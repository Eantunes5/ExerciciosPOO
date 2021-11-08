package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros = new ArrayList<>();
	private List<VideoGame> videoGames = new ArrayList<>();

	public Loja() {

	}
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void listaLivros() {
		if(livros.isEmpty()){
			System.out.println("A loja não tem livros no seu estoque");
		}else {
			System.out.println("-------------------------------------");
			System.out.println("A loja " + nome + " possui estes livros para venda:");
			for(Livro livro : livros) {
				System.out.println("Titulo: "+ livro.getNome() +" Preço: "+ livro.getPreco() +" Quantidade: "+ livro.getQtd());
			}
		}
	}

	public void listaVideoGames() {
		if(videoGames.isEmpty()){
			System.out.println("A loja não tem video-games no seu estoque");
		}else {
			System.out.println("-------------------------------------");
			System.out.println("A loja " + nome + " possui estes video-games para venda:");
			for(VideoGame game : videoGames) {
				System.out.println("Video-game: "+ game.getNome() +" Preço: "+ game.getPreco() +" Quantidade: "+ game.getQtd());
			}
		}
	}
	
	public double calculaPatrimonio() {
		double valor = 0;
		
		for(Livro livro : livros) {
			valor = valor + livro.getPreco()*livro.getQtd();
		}
		for(VideoGame game : videoGames) {
			valor = valor + game.getPreco()*game.getQtd();
		}
		System.out.println("-------------------------------------");
		System.out.println("O patrimonio da loja: "+nome+" é de R$ "+valor);
		return valor;
		
	}


}
