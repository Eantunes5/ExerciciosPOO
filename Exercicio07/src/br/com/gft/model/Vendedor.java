package br.com.gft.model;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	
	public double bonificação() {
		System.out.println(super.bonificação() + 3000);
		return super.bonificação() + 3000;
	}
}
