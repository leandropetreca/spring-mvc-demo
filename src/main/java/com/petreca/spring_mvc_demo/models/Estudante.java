package com.petreca.spring_mvc_demo.models;

import java.util.LinkedHashMap;

public class Estudante {

	private String firstName;
	private String lastName;
	private String sexo;
	private String pais;
	private String curso;
	private String sistema;
		
	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	private LinkedHashMap<String, String> paisOptions;
	
	public Estudante() {
		paisOptions = new LinkedHashMap<String, String>();
		paisOptions.put("BR", "Brasil");
		paisOptions.put("FR", "Franca");
		paisOptions.put("DE", "Alemanha");
		paisOptions.put("IN", "India");
	}
	
	public LinkedHashMap<String, String> getPaisOptions() {
		return paisOptions;
	}

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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
