package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s, da máquina xyz!", name);
    }
	@GetMapping("/miojo")
    public String miojo(@RequestParam(value = "sabor", defaultValue = "nenhum") String sabor) {
		if(sabor.equals("galinha")){
			return String.format("Condimento preparado sabor galinha, sal, açúcar, cenoura em pó, extrato de levedura em pó, mandioquinha em pó, molho de soja cloreto de potássio, realçadores de sabor glutamato monossódico, inosinato dissódico e guanilato dissódico, antiumectante dióxido de silício, corantes caramelo IV II, corante natural cúrcuma.");
		} else if (sabor.equals("carne")){
			return String.format("Sal, farinha de arroz, açúcar, cebola em pó, condimento à base de extrato de levedura, alho em pó, condimento preparado sabor carne, extrato de levedura em pó, condimento preparado sabor pimenta branca, carne bovina em pó, gengibre em pó, salsa triturada, cacau em pó, realçadores de sabor glutamato monossódico.");
		} else if (sabor.equals("camarão")){
			return String.format("Descrição. Com 8808 SHU, este é o macarrão instantâneo mais apimentado do mundo! Como referência, o molho de pimenta Sriracha possui cerca de 4500 SHU e o molho Tabasco tradicional, 5000 SHU. Produzido na Coreia do Sul, este macarrão sabor frango ficou mundialmente famoso por sua picância extrema.");
		}
		return String.format("O miojo é um tipo de macarrão instantâneo produzido por diversas marcas de alimentos, como a Maggi e a Nissin. Ele é popular no mundo inteiro e tem infinitos sabores diferentes. O miojo é fácil de preparar: basta alguns minutos e um micro-ondas ou fogão, mas, se você quiser incrementar sua refeição, use uns ingredientes a mais, como vegetais ou ovos para transformar um miojo simples em um prato cheio de sabor e de dar água na boca");
    }
	@GetMapping("/envia")
	public String envia(@RequestParam(value = "remetente", defaultValue = "") String name, @RequestParam(value = "texto", defaultValue = "") String texto) {
		return String.format("%s : %s", name, texto);
	}
	
}
