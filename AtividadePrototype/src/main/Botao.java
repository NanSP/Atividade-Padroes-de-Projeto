package main;

class Botao implements ElementoDesign {
    private String nome;
    private String corFundo;
    private String corTexto;
    private String fonte;
    private int tamanhoFonte;
    private String pesoFonte;
    private int larguraBorda;
    private String estiloBorda;
    private String corBorda;
    private int paddingHorizontal;
    private int paddingVertical;
    private int borderRadius;

    public Botao() {}

    private Botao(Botao botao) {
        this.nome = botao.nome;
        this.corFundo = botao.corFundo;
        this.corTexto = botao.corTexto;
        this.fonte = botao.fonte;
        this.tamanhoFonte = botao.tamanhoFonte;
        this.pesoFonte = botao.pesoFonte;
        this.larguraBorda = botao.larguraBorda;
        this.estiloBorda = botao.estiloBorda;
        this.corBorda = botao.corBorda;
        this.paddingHorizontal = botao.paddingHorizontal;
        this.paddingVertical = botao.paddingVertical;
        this.borderRadius = botao.borderRadius;
    }

    @Override
    public Botao clone() {
        return new Botao(this);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void aplicarEstilo() {
        System.out.println("Aplicando estilo do botão: " + nome);
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setCorFundo(String corFundo) { this.corFundo = corFundo; }
    public void setCorTexto(String corTexto) { this.corTexto = corTexto; }
    public void setFonte(String fonte, int tamanho, String peso) {
        this.fonte = fonte;
        this.tamanhoFonte = tamanho;
        this.pesoFonte = peso;
    }
    public void setBorda(int largura, String estilo, String cor) {
        this.larguraBorda = largura;
        this.estiloBorda = estilo;
        this.corBorda = cor;
    }
    public void setPadding(int horizontal, int vertical) {
        this.paddingHorizontal = horizontal;
        this.paddingVertical = vertical;
    }
    public void setBorderRadius(int radius) {
        this.borderRadius = radius;
    }

}

