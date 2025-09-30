package main;

public class Robo extends JogoIA{
	@Override
	protected void atirar() {
	System.out.println("Estou atirando com as mãos");
	}

	@Override
	protected void mover() {
	System.out.println("Estou me movendo com minhas pernas robóticas");
	}
}
