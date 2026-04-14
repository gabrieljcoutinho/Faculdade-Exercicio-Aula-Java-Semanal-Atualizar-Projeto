public class Caminhao extends exercicio {
    private double capacidadeCarga;

    public Caminhao(String modelo, String cor, Motor motor, double capacidadeCarga) {
        super(modelo, cor, motor);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void carregarCarga() {
        System.out.println("SISTEMA: Carregando " + this.capacidadeCarga + " toneladas de mercadoria.");
    }

    /* Css da responsividade desse componente:
       Layout robusto para transporte de grandes volumes de dados. */

    public static void main(String[] args) {
        // 1. Definindo os motores
        Motor motorV12 = new Motor("Gasolina High Octane", 700);
        Motor motorDiesel = new Motor("Diesel S10", 540);

        // 2. Instanciando os objetos (Herdeiros)
        CarroEsportivo ferrari = new CarroEsportivo("F8 Tributo", "Vermelho Rosso", motorV12, true);
        Caminhao volvo = new Caminhao("FH 540", "Prata Metálico", motorDiesel, 40.5);

        System.out.println("========================================");
        System.out.println("       TESTE DE HERANCA ATIVADO         ");
        System.out.println("========================================");

        // Teste do Carro Esportivo
        System.out.println("VEICULO: " + ferrari.getModelo());
        ferrari.getMotor().darPartida();
        ferrari.acelerar();
        ferrari.ativarTurbo();
        System.out.println("Velocidade Final: " + ferrari.getVelocidadeAtual() + " km/h");

        System.out.println("----------------------------------------");

        // Teste do Caminhão
        System.out.println("VEICULO: " + volvo.getModelo());
        volvo.getMotor().darPartida();
        volvo.carregarCarga();
        volvo.acelerar();
        System.out.println("Velocidade Final: " + volvo.getVelocidadeAtual() + " km/h");
        System.out.println("========================================");
    }
}