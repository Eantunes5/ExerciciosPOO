package br.com.gft.model;

public class Gerente extends Funcionario {

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	public double bonificação() {
		System.out.println(super.bonificação() + 10000);
		return super.bonificação() + 10000;
	}
	
}
