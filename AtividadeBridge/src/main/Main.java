package main;

public class Main {

	public static void main(String[] args) {
		Mensagem msg1 = new MensagemUrgente(new Email());
		Mensagem msg2 = new MensagemUrgente(new  SMS());
		
		msg1.enviar("Reunião 10h");
		msg2.enviar("Me ligue");
	}

}
