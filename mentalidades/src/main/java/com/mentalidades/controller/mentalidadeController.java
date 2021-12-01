package com.mentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades")
public class mentalidadeController {

	@GetMapping
	public String mentalidades() {
		return "Mentalidade de MUITA Persistência e Habilidade de Orientação para o futuro.";
	}
}