package main;

public class SMS implements Canal{
	public void enviar(String msg) {
		System.out.println("Enviando por SMS: " + msg);
	}
}
