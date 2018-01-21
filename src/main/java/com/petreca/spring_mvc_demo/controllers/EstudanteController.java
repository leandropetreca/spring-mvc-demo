package com.petreca.spring_mvc_demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petreca.spring_mvc_demo.models.Estudante;

@Controller
@RequestMapping("/estudante")
public class EstudanteController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Estudante estudante = new Estudante();
		
		theModel.addAttribute("estudante", estudante);
		
		return "estudante-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("estudante") Estudante estudante) {
		
		System.out.println("estudante nome: "+ estudante.getFirstName());
		
		return "estudante-confirmacao";
	}
}
