public abstract class exercicio implements Manutivel, Rastreavel {
    private String modelo;
    private String cor;
    private int velocidadeAtual;
    private Motor motor;
    private String posicaoGPS;

    public exercicio(String modelo, String cor, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.velocidadeAtual = 0;
        this.posicaoGPS = "Patio Central";
    }

    // Metodo ABSTRATO: cada subclasse OBRIGATORIAMENTE deve implementar
    public abstract String descricaoVeiculo();

    // Getters e Setters
    public String getModelo()       { return modelo; }
    public String getCor()          { return cor; }
    public int getVelocidadeAtual() { return velocidadeAtual; }
    public Motor getMotor()         { return motor; }

    public void setVelocidadeAtual(int velocidade) {
        this.velocidadeAtual = Math.max(0, velocidade);
    }

    public void setPosicaoGPS(String posicao) {
        this.posicaoGPS = posicao;
    }

    public void acelerar() {
        setVelocidadeAtual(this.velocidadeAtual + 10);
        System.out.println("Acao: ACELERAR -> " + this.modelo + " a " + this.velocidadeAtual + " km/h");
    }

    // Implementacao de Rastreavel
    @Override
    public String getPosicaoAtual() {
        return modelo + " esta em: [" + posicaoGPS + "] a " + velocidadeAtual + " km/h";
    }

    // Implementacao de Manutivel
    @Override
    public void realizarManutencao() {
        System.out.println("OFICINA: Revisao geral de " + modelo + " (" + cor + ").");
        motor.realizarManutencao();
        setVelocidadeAtual(0);
    }

    @Override
    public String getRelatorioManutencao() {
        return "Veiculo: " + modelo + " | Cor: " + cor
               + " | Motor -> [" + motor.getRelatorioManutencao() + "]";
    }
}