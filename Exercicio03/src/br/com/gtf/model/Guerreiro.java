package br.com.gtf.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	private List<String> Habilidade = new ArrayList<>();
	private static int totalDeGuerreiros = 0;

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		Guerreiro.setTotalDeGuerreiros(Guerreiro.getTotalDeGuerreiros() + 1);
	}


	public List<String> getHabilidade() {
		return Habilidade;
	}


	public void setHabilidade(List<String> habilidade) {
		Habilidade = habilidade;
	}

	public void lvlUp() {
		super.lvlUp();
		setVida(getVida()+1);
		setForca(getForca()+1);
	}

	public void attack() {

		Random random = new Random();
		
		int numero = random.nextInt(300);
		int dano = getForca()*getLevel() + numero;
		
		System.out.println("Dano do ataque do guerreiro:" + dano);
		
	}

	public void aprenderHabilidade(String habilidade) {

	}


	public static int getTotalDeGuerreiros() {
		return totalDeGuerreiros;
	}


	public static void setTotalDeGuerreiros(int totalDeGuerreiros) {
		Guerreiro.totalDeGuerreiros = totalDeGuerreiros;
	}



}
