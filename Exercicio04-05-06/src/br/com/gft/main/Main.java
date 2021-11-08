package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Pessoa;

public class Main {



	public static void main(String[] args) {

		String nome = "";
		int maiorIdade = 0;
		int contador = 0;


		
		Pessoa p1 = new Pessoa("Joao", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);


		List<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);

		for(Pessoa pessoa : pessoas) {		
			if(pessoa.getIdade()>maiorIdade) {
				maiorIdade = pessoa.getIdade();
				nome = pessoa.getNome();
			}
		}

		System.out.println("A pessoa mais velha é: " + nome);

		System.out.println("Quantidade de pessoas antes da exclusão: " + pessoas.size());
		
		pessoas.removeIf(p-> p.getIdade()<18);

		System.out.println("Quantidade de pessoas após a exclusão: " + pessoas.size());
		
		for(Pessoa pessoa : pessoas) {		
			if(pessoa.getNome()=="Jessica") {
				System.out.println("Jessica está na lista e sua idade é: " + pessoa.getIdade());
			}
		}

	}	


}
