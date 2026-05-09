public abstract class exercicio {
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

    // Método ABSTRATO: cada subclasse OBRIGATORIAMENTE deve implementar
    // Faz sentido? SIM! Um "veículo genérico" não tem descrição própria.
    // Um Caminhão descreve sua carga; um Esportivo descreve seu turbo.
    public abstract String descricaoVeiculo();

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
}