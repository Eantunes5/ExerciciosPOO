package br.com.gft.model;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	
	public double bonifica��o() {
		System.out.println(super.bonifica��o() + 3000);
		return super.bonifica��o() + 3000;
	}
}
