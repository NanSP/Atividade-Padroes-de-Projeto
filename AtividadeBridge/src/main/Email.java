package main;

public class Email implements Canal{
	public void enviar(String msg) {
		System.out.println("Enviando por Email: " + msg);
	}

}
