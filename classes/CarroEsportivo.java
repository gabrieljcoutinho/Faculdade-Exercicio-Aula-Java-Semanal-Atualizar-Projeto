public class CarroEsportivo extends exercicio {
    private boolean modoTurbo; // Atributo exclusivo

    public CarroEsportivo(String modelo, String cor, Motor motor, boolean modoTurbo) {
        super(modelo, cor, motor); // Chama o construtor da Superclasse
        this.modoTurbo = modoTurbo;
    }

    public void ativarTurbo() {
        if (modoTurbo) {
            System.out.println("SISTEMA: Nitro ativado! Chamas saindo pelo escapamento.");
            setVelocidadeAtual(getVelocidadeAtual() + 50);
        }
    }
}