package main;

public class Main {

	public static void main(String[] args) {

		Menu arquivo = new Menu("ARQUIVO:MENU");
		MenuItem salvar = new MenuItem("SALVAR: mItem");
		
		MenuItem deletar = new MenuItem("DELETAR: mItem");
		
		Menu opcoes = new Menu("OPÇÕES: MENU");
		
		MenuItem colar =new MenuItem("COLAR: mItem");
		
		MenuItem copiar = new MenuItem("COPIAR: mITEM");
		
		
		
		arquivo.add(salvar);
		arquivo.add(deletar);
		arquivo.add(opcoes);
		
		opcoes.add(colar);
		opcoes.add(copiar);
		
		arquivo.show();
	}

}
