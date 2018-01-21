package com.petreca.spring_mvc_demo.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cliente {

	private String firstName;
	
	@NotNull(message="Campo obrigatorio")
	@Size(min=1, message="Campo obrigatorio")
	private String lastName;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
