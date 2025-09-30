package main;

public abstract class JogoIA {

	// Ordem que o algoritmo é executado
	public final void OrdemIA() {
		colisao();
		atirar();
		mover();
		}

	private void colisao() {
		System.out.println("Estou colidindo");
		}
	
	protected abstract void atirar();
	protected abstract void mover();
	}
