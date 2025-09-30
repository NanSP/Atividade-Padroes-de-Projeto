package main;

public abstract class Mensagem {
	protected Canal canal;
	public Mensagem(Canal canal) {
		this.canal = canal;
	}
	abstract void enviar(String msg);
}
