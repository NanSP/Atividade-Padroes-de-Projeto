package main;

import java.util.HashMap;
import java.util.Map;

public class CartaFactory {
	private static final Map<String, Carta> cartas = new HashMap<>();
	public static Carta getCarta(String nome, int custo, String efeito) {
		String chave = nome +"-"+ custo +"-"+ efeito;
		
		if(!cartas.containsKey(chave)) {
			cartas.put(chave, new Carta(nome,custo,efeito));
			System.out.println("Criando nova carta:" + nome);
		}
		return cartas.get(chave);
	}
	
}
