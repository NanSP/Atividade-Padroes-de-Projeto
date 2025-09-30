package main;

public class Carta {

	private final String nome;
	private final int custo;
	private final String efeito;
	
	public Carta(String nome, int custo, String efeito) {
		
		this.nome = nome;
		this.custo = custo;
		this.efeito = efeito;
		
	}
	
	public void exibir(int posicao) {
		System.out.println("Carta[" + nome + "] - custo " + custo + ", efeito: "+ efeito + "  [ posição na mão: " + posicao + " ]");
	}
}
