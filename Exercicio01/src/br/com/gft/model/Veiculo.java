package br.com.gft.model;

public class Veiculo {

	//Criação de variaveis
	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private float Km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int Velocidade;
	private Double Preco;
	
	//Criação de métodos
	public Veiculo(){
		
	}
	
	public void acelerar() {
		Velocidade = Velocidade + 20;
	}
	public void abastecer(int combustivel) {
		if(combustivel + litrosCombustivel > 60) {
			System.out.println("Essa quantidade de combustivel irá exceder o limite de 60L");
		}else {
			litrosCombustivel = litrosCombustivel + combustivel;
		}
	}
	public void frear() {
		if(Velocidade == 0) {
			System.out.println("O carro ja está parado");
		}else {
			if(Velocidade - 20 <0) {
				Velocidade = 0;
			}else {
				Velocidade = Velocidade - 20;
			}
		}
	}
	public void pintar(String cor) {
		Cor = cor;
	}
	public void ligar() {
		if(isLigado == false) {
			isLigado = true;
			System.out.println("O veiculo foi ligado");
		}else {
			System.out.println("O veiculo ja está ligado");
		}
	}
	public void desligar() {
		if(isLigado == false) {
			System.out.println("O veiculo ja está desligado");
		}else if(Velocidade > 0) {
			System.out.println("Não é possivel desligar um veiculo em movimento");
		}else {
			isLigado = false;
		}
	}
	
	//Geração de Get e Set
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public float getKm() {
		return Km;
	}
	public void setKm(float km) {
		Km = km;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return Velocidade;
	}
	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}
	public Double getPreco() {
		return Preco;
	}
	public void setPreco(Double preco) {
		Preco = preco;
	}
}
