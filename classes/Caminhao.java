public class Caminhao extends exercicio {
    private double capacidadeCarga;

    public Caminhao(String modelo, String cor, Motor motor, double capacidadeCarga) {
        super(modelo, cor, motor);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Implementação OBRIGATÓRIA do método abstrato
    @Override
    public String descricaoVeiculo() {
        return "Caminhao de Carga | Capacidade: " + this.capacidadeCarga + " toneladas";
    }

    public void carregarCarga() {
        System.out.println("SISTEMA: Carregando " + this.capacidadeCarga + " toneladas de mercadoria.");
    }

    public static void main(String[] args) {
        // 1. Definindo os motores
        Motor motorV12 = new Motor("Gasolina High Octane", 700);
        Motor motorDiesel = new Motor("Diesel S10", 540);

        // 2. Instanciando os objetos (subclasses concretas)
        CarroEsportivo ferrari = new CarroEsportivo("F8 Tributo", "Vermelho Rosso", motorV12, true);
        Caminhao volvo = new Caminhao("FH 540", "Prata Metalico", motorDiesel, 40.5);

        System.out.println("========================================");
        System.out.println("       TESTE DE ABSTRACAO ATIVADO       ");
        System.out.println("========================================");

        // PROVA que o método abstrato foi implementado em cada subclasse
        System.out.println("Descricao: " + ferrari.descricaoVeiculo());
        ferrari.getMotor().darPartida();
        ferrari.acelerar();
        ferrari.ativarTurbo();
        System.out.println("Velocidade Final: " + ferrari.getVelocidadeAtual() + " km/h");

        System.out.println("----------------------------------------");

        System.out.println("Descricao: " + volvo.descricaoVeiculo());
        volvo.getMotor().darPartida();
        volvo.carregarCarga();
        volvo.acelerar();
        System.out.println("Velocidade Final: " + volvo.getVelocidadeAtual() + " km/h");

        System.out.println("========================================");

        // ERRO DE COMPILACAO (deixe comentado para ver na prática):
        // Se descomentar a linha abaixo, o compilador barra com:
        // "exercicio is abstract; cannot be instantiated"
        // exercicio v = new exercicio("Generico", "Branco", motorV12);
    }
}