package br.com.gft.model;

public class Gerente extends Funcionario {

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	public double bonifica��o() {
		System.out.println(super.bonifica��o() + 10000);
		return super.bonifica��o() + 10000;
	}
	
}
