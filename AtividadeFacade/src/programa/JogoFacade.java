package programa;

public class JogoFacade {
	private Mapa mapa;
	private Inventario inventario;
	private Combate combate;
	
	public JogoFacade() {
		mapa=new Mapa();
		inventario=new Inventario();
		combate=new Combate();
		
	}
	public void iniciarJogo() {
		mapa.carregarMapa();
		inventario.adicionarItens();
		combate.ativar();
		System.out.println("jogo iniciado");
	}
	

}
