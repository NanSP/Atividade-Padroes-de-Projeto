package programa;

import java.util.ArrayList;
import java.util.List;

public class Professor implements Subject {
    private List<Observer> alunos = new ArrayList<>();

    @Override
    public void adicionar(Observer o) {
        alunos.add(o);
    }

    @Override
    public void remover(Observer o) {
        alunos.remove(o);
    }

    @Override
    public void notificar(String tarefa) {
        for (Observer aluno : alunos) {
            aluno.update(tarefa);
        }
    }

    public void postarTarefa(String tarefa) {
        System.out.println("Professor postou: " + tarefa);
        notificar(tarefa);
    }
}