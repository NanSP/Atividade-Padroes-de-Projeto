package main;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class PrototypeRegistry {
    private static Map<String, ElementoDesign> prototipos = new HashMap<>();

    static {
        // Registrar protótipos iniciais
        inicializarPrototipos();
    }

    private static void inicializarPrototipos() {
        // Protótipo: Botão Moderno
        Botao botaoModerno = new Botao();
        botaoModerno.setNome("Botão Moderno");
        botaoModerno.setCorFundo("#3498db");
        botaoModerno.setCorTexto("#ffffff");
        botaoModerno.setFonte("Arial", 14, "bold");
        botaoModerno.setBorda(2, "solid", "#2980b9");
        botaoModerno.setPadding(10, 20);
        botaoModerno.setBorderRadius(5);
        // ... configurar outras 15 propriedades
        prototipos.put("botao-moderno", botaoModerno);

        // Protótipo: Botão Corporativo
        Botao botaoCorporativo = new Botao();
        botaoCorporativo.setNome("Botão Corporativo");
        botaoCorporativo.setCorFundo("#2c3e50");
        botaoCorporativo.setCorTexto("#ecf0f1");
        botaoCorporativo.setFonte("Helvetica", 12, "normal");
        botaoCorporativo.setBorda(1, "solid", "#34495e");
        botaoCorporativo.setPadding(8, 16);
        botaoCorporativo.setBorderRadius(3);
        // ... configurar outras propriedades
        prototipos.put("botao-corporativo", botaoCorporativo);
    }

    public static void registrarPrototipo(String chave, ElementoDesign prototipo) {
        prototipos.put(chave, prototipo);
    }

    public static ElementoDesign obterPrototipo(String chave) {
        ElementoDesign prototipo = prototipos.get(chave);
        if (prototipo == null) {
            throw new IllegalArgumentException("Protótipo não encontrado: " + chave);
        }
        return prototipo.clone();
    }

    public static List <String> listarPrototipos() {
        return new ArrayList<>(prototipos.keySet());
    }
}
