public class exercicio {
    private String modelo;
    private String cor;
    private int velocidadeAtual;
    private Motor motor;

    public exercicio(String modelo, String cor, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.velocidadeAtual = 0;
    }

    // Getters e Setters
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public int getVelocidadeAtual() { return velocidadeAtual; }
    public Motor getMotor() { return motor; }

    public void setVelocidadeAtual(int velocidade) {
        this.velocidadeAtual = Math.max(0, velocidade);
    }

    public void acelerar() {
        setVelocidadeAtual(this.velocidadeAtual + 10);
        System.out.println("Acao: ACELERAR -> " + this.modelo + " a " + this.velocidadeAtual + " km/h");
    }

    /* Css da responsividade desse componente:
       Layout escalável com Herança e Polimorfismo. */
}