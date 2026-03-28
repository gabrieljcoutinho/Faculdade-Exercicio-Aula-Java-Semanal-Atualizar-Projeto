public package br.com.fiapride.model;

public class Motor {
    private String tipo; // Ex: V8, Elétrico, 1.0
    private int cavalos;

    public Motor(String tipo, int cavalos) {
        this.tipo = tipo;
        this.cavalos = cavalos;
    }

    // Getters para acessar os dados no Main
    public String getTipo() { return tipo; }
    public int getCavalos() { return cavalos; }
} {
    
}
