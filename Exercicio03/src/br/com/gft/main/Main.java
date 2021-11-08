package br.com.gft.main;

import br.com.gtf.model.Guerreiro;
import br.com.gtf.model.Mago;

public class Main {

	public static void main(String[] args) {

		Guerreiro g1 = new Guerreiro("Joseph", 20, 20, 12, 10, 20, 5);
		Guerreiro g2 = new Guerreiro("Carlos", 18, 15, 10, 9, 19, 4);
		
		
		g1.lvlUp();
		g2.lvlUp();
		g2.lvlUp();
		
		Mago m1 = new Mago("Andre", 10, 15, 8, 10, 8, 3);
		Mago m2 = new Mago("Jair", 25, 30, 45, 20, 21, 15);
		
		m1.lvlUp();
		m2.lvlUp();
		m2.lvlUp();
		
		m2.attack();		
		g2.attack();

		int totalPersonagens = Guerreiro.getTotalDeGuerreiros() + Mago.getTotalDeMagos();
		System.out.println("O total de personagens é: "+totalPersonagens);
	}

}
