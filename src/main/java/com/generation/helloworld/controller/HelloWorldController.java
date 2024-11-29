package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping("/bsms")
	public String listBsms() {
    return "BSM’s da Generation Brasil: \n" +
            "- Proatividade\n" +
            "- Comunicação\n" +
            "- Orientação ao Futuro\n" +
            "- Responsabilidade Pessoal\n" +
            "- Mentalidade de Crescimento\n" +
            "- Persistência.";
 }

	@GetMapping("/objetivos")
	public String listObjetivos() {
    return "Objetivos de aprendizagem desta semana: "
    		+ "Revisar MySQL"
    		+ "Revisar conceitos de Spring Boot";
}
}
