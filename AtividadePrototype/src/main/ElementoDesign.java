package main;

interface ElementoDesign extends Cloneable {
    ElementoDesign clone();
    String getNome();
    void aplicarEstilo();
}
