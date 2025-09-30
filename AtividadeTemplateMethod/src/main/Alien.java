package main;

public class Alien extends JogoIA {

	@Override
	protected void atirar() {
	System.out.println("Estou atirando pelos olhos");
	}

	@Override
	protected void mover() {
	System.out.println("Estou me movendo com meus tentáculos\n");
	}
}
