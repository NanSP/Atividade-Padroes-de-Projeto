package programa;

public class Programa {

	public static void main(String[] args) {
		Professor professor = new Professor();

        Aluno Marcos = new Aluno("Marcos");
        Aluno mariana = new Aluno("mariana");

        professor.adicionar(Marcos);
        professor.adicionar(mariana);

        professor.postarTarefa("Ler capítulo 5 do livro");
        professor.postarTarefa("Fazer exercício 10 da página 42");

	}

}
