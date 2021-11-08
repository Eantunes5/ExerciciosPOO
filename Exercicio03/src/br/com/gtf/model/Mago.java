package br.com.gtf.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	private List<String> Magia = new ArrayList<>();
	private static int totalDeMagos = 0;


	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		Mago.setTotalDeMagos(Mago.getTotalDeMagos() + 1);
	}


	public List<String> getMagia() {
		return Magia;
	}


	public void setMagia(List<String> magia) {
		Magia = magia;
	}
	public void lvlUp() {
		super.lvlUp();
		setMana(getMana()+1);
		setInteligencia(getInteligencia()+1);
	}

	public void attack() {

		Random random = new Random();
		
		int numero = random.nextInt(300);
		int dano = getInteligencia()*getLevel() + numero;
		
		System.out.println("Dano do ataque do mago:" + dano);
	}

	public void aprenderMagia(String magia) {

	}


	public static int getTotalDeMagos() {
		return totalDeMagos;
	}


	public static void setTotalDeMagos(int totalDeMagos) {
		Mago.totalDeMagos = totalDeMagos;
	}
}
