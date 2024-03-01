package aula12.model;

import aula12.model.service.ValidaModel;

public abstract class Animal implements ValidaModel {
	private Integer id;
	private String nome;
	private String sexo;
	
	public Animal(String nome, String sexo) {
		this.setNome(nome);
		this.setSexo(sexo);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Animal() { }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
