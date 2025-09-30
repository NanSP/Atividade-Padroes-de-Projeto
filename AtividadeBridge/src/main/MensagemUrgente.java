package main;

public class MensagemUrgente extends Mensagem{
	public MensagemUrgente(Canal canal) {
		super(canal);
	}
	public void enviar(String msg) {
		canal.enviar("[URGENTE] {- " + msg +" -}");
	}
}
