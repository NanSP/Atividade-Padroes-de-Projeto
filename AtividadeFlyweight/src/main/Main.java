package main;

public class Main {

	public static void main(String[] args) {

		Carta c1 = CartaFactory.getCarta("Ataque", 1, "Causa 10 de dano");
		c1.exibir(1);
		
		Carta c2 = CartaFactory.getCarta("Bola de fogo", 10, "Lança uma poderosa, e cara, bola de fogo");
		c2.exibir(2);
		
		Carta c3 = CartaFactory.getCarta("Curar", 8, "Uma cura rápida");
		c3.exibir(3);
	}

}
