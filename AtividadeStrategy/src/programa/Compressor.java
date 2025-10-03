package programa;

public class Compressor {
	private CompressaoStrategy estrategia;

    public void setEstrategia(CompressaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void comprimirArquivo(String arquivo) {
        if (estrategia == null) {
            throw new IllegalStateException("Nenhuma estratégia de compressão definida!");
        }
        estrategia.comprimir(arquivo);
    }
}
