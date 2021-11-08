package br.com.gft.main;

import br.com.gft.model.Gerente;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente g1 = new Gerente("Fabio", 40, 8000.0);
		Supervisor s1 = new Supervisor("Joao", 30, 4000.0);
		Vendedor v1 = new Vendedor("Jose", 20, 3000.0);
		
		
		System.out.println(g1.getNome() +" "+ g1.getIdade() + " Anos");
		g1.bonificação();
		
		System.out.println(s1.getNome() +" "+ s1.getIdade() + " Anos");
		s1.bonificação();
		
		System.out.println(v1.getNome() +" "+ v1.getIdade() + " Anos");
		v1.bonificação();
		
		
	}

}
