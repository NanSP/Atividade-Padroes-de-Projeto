package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("===ABORDAGEM MANUAL===");
        criarBotoesManualmente();

        System.out.println("\n===ABORDAGEM COM PROTOTYPE===");
        criarBotoesComPrototype();
    }

    // ABORDAGEM MANUAL
    private static void criarBotoesManualmente() {
        long inicio = System.currentTimeMillis();

        // Botão 1
        Botao botao1 = new Botao();
        botao1.setNome("Botão Moderno 1");
        botao1.setCorFundo("#213B59");
        botao1.setCorTexto("#080F17");
        botao1.setFonte("Arial", 14, "bold");
        botao1.setBorda(4, "solid", "#E814E8");
        botao1.setPadding(10, 20);
        botao1.setBorderRadius(5);
        botao1.aplicarEstilo();

        // Botão 2 - Mesmas configurações, código repetido
        Botao botao2 = new Botao();
        botao2.setNome("Botão Moderno 2");
        botao2.setCorFundo("#3498db");
        botao2.setCorTexto("#666066");
        botao2.setFonte("Arial", 14, "bold");
        botao2.setBorda(6, "solid", "#A30EA3");
        botao2.setPadding(10, 20);
        botao2.setBorderRadius(3);
        // ... mais 15 linhas de configuração IDÊNTICAS
        botao2.aplicarEstilo();

        // Botão 3 - Mesmas configurações, código repetido
        Botao botao3 = new Botao();
        botao3.setNome("Botão Moderno 3");
        botao3.setCorFundo("#2E381B");
        botao3.setCorTexto("#ffffff");
        botao3.setFonte("Arial", 14, "bold");
        botao3.setBorda(2, "solid", "#383538");
        botao3.setPadding(10, 20);
        botao3.setBorderRadius(2);
        // ... mais 15 linhas de configuração IDÊNTICAS
        botao3.aplicarEstilo();

        long fim = System.currentTimeMillis();
        System.out.println("Tempo manual: " + (fim - inicio) + "ms");
        System.out.println("Linhas de código: ~60 linhas");
    }

    // ABORDAGEM COM PROTOTYPE
    private static void criarBotoesComPrototype() {
        long inicio = System.currentTimeMillis();

        // Criar 3 botões idênticos a partir do protótipo
        Botao botao1 = (Botao) PrototypeRegistry.obterPrototipo("botao-moderno");
        botao1.setNome("Botão Moderno 1");
        botao1.aplicarEstilo();

        Botao botao2 = (Botao) PrototypeRegistry.obterPrototipo("botao-moderno");
        botao2.setNome("Botão Moderno 2");
        botao2.aplicarEstilo();

        Botao botao3 = (Botao) PrototypeRegistry.obterPrototipo("botao-moderno");
        botao3.setNome("Botão Moderno 3");
        botao3.aplicarEstilo();

        long fim = System.currentTimeMillis();
        System.out.println("Tempo com prototype: " + (fim - inicio) + "ms");
        System.out.println("Linhas de código: 9 linhas");

        // Demonstração de customização pós-clonagem
        System.out.println("\n===CUSTOMIZAÇÃO PÓS-CLONAGEM===");
        Botao botaoCustomizado = (Botao) PrototypeRegistry.obterPrototipo("botao-moderno");
        botaoCustomizado.setNome("Botão Customizado");
        botaoCustomizado.setCorFundo("#041C38"); 
        botaoCustomizado.aplicarEstilo();
    }
}
