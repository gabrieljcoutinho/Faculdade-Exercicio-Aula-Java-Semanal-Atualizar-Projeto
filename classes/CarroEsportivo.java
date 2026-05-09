public class CarroEsportivo extends exercicio {
    private boolean modoTurbo;

    public CarroEsportivo(String modelo, String cor, Motor motor, boolean modoTurbo) {
        super(modelo, cor, motor);
        this.modoTurbo = modoTurbo;
    }

    // Implementacao OBRIGATORIA do metodo abstrato
    @Override
    public String descricaoVeiculo() {
        return "Carro Esportivo | Turbo: " + (modoTurbo ? "ATIVADO" : "desativado");
    }

    public void ativarTurbo() {
        if (modoTurbo) {
            System.out.println("SISTEMA: Nitro ativado! Chamas saindo pelo escapamento.");
            setVelocidadeAtual(getVelocidadeAtual() + 50);
        }
    }
}