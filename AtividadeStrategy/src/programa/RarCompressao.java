package programa;

class RarCompressao implements CompressaoStrategy {
    @Override
    public void comprimir(String arquivo) {
        System.out.println("Comprimindo " + arquivo + " em formato RAR...");
    }
}

