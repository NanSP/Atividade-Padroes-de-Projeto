package programa;

class ZipCompressao implements CompressaoStrategy {
    @Override
    public void comprimir(String arquivo) {
        System.out.println("Comprimindo " + arquivo + " em formato ZIP...");
    }
}

        
