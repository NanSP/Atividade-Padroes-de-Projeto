package programa;

public class Aluno implements Observer {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String tarefa) {
        System.out.println(nome + " recebeu a tarefa: " + tarefa);
    }
}


