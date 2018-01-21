package com.petreca.spring_mvc_demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String processForm() {
		return "helloworld-form";
	}
	

	
	
	//Exemplo usando HttpServletRequest
	@RequestMapping("/process")
	public String processForm(HttpServletRequest request, Model model) {
		
		String nome = request.getParameter("nome");
		
		nome = nome.toUpperCase();
		
		String result = "Olá " + nome;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	// Exemplo usando anotation
	@RequestMapping("/processTwo")
	public String processFormTwo(@RequestParam("nome") String nome, Model model) {
				
		nome = nome.toUpperCase();		
		String result = "Olá novamente " + nome;		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	

	
}
