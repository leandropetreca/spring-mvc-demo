package com.petreca.spring_mvc_demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petreca.spring_mvc_demo.models.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Cliente cliente = new Cliente();
		
		theModel.addAttribute("cliente", cliente);
		
		return "cliente-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("cliente") Cliente cliente, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "cliente-form";
		}else {
			return "cliente-confirmacao";
		}	
		
		
	}
}
