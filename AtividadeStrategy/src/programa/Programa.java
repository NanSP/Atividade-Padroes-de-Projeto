package programa;

public class Programa {

	public static void main(String[] args) {
		Compressor compressor = new Compressor();

        compressor.setEstrategia(new RarCompressao());
        compressor.comprimirArquivo("documento.txt");

        compressor.setEstrategia(new ZipCompressao());
        compressor.comprimirArquivo("imagem.png");

        compressor.setEstrategia(new SevenZCompressao());
        compressor.comprimirArquivo("video.mp4");

	}

}
