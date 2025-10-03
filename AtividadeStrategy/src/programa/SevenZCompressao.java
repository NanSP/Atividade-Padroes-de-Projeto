package programa;

class SevenZCompressao implements CompressaoStrategy {
    @Override
    public void comprimir(String arquivo) {
        System.out.println("Comprimindo " + arquivo + " em formato 7Z...");
}
}