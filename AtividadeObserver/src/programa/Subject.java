package programa;

public interface Subject {
	void adicionar(Observer o);
    void remover(Observer o);
    void notificar(String tarefa);
}
