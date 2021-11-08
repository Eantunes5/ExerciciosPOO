package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		
		v1.setLigado(true);
		v1.ligar();
		v1.acelerar();
		System.out.println(v1.getVelocidade());
		v1.acelerar();
		v1.acelerar();
		v1.frear();
		System.out.println(v1.getVelocidade());
		v1.pintar("Vermelho");
		System.out.println(v1.getCor());
		v1.desligar();
		v1.frear();
		v1.frear();
		v1.desligar();
		v1.abastecer(50);
		System.out.println(v1.getLitrosCombustivel());
		v1.abastecer(50);
	}

}
