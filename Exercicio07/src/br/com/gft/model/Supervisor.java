package br.com.gft.model;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	public double bonificação() {
		System.out.println(super.bonificação() + 5000);
		return super.bonificação() + 5000;
	}
}
