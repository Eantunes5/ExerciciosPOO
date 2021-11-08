package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;
	private int idade;
	List<Pessoa> pessoas = new ArrayList<>();
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
