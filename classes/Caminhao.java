public class Caminhao extends exercicio {
    private double capacidadeCarga;

    public Caminhao(String modelo, String cor, Motor motor, double capacidadeCarga) {
        super(modelo, cor, motor);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Implementacao OBRIGATORIA do metodo abstrato
    @Override
    public String descricaoVeiculo() {
        return "Caminhao de Carga | Capacidade: " + this.capacidadeCarga + " toneladas";
    }

    public void carregarCarga() {
        System.out.println("SISTEMA: Carregando " + this.capacidadeCarga + " toneladas de mercadoria.");
    }

    public static void main(String[] args) {
        // 1. Definindo os motores
        Motor motorV12    = new Motor("Gasolina High Octane", 700);
        Motor motorDiesel = new Motor("Diesel S10", 540);
        Motor motorAvulso = new Motor("Eletrico", 300); // hierarquia DIFERENTE dos veiculos

        // 2. Instanciando os objetos (subclasses concretas)
        CarroEsportivo ferrari = new CarroEsportivo("F8 Tributo", "Vermelho Rosso", motorV12, true);
        Caminhao volvo         = new Caminhao("FH 540", "Prata Metalico", motorDiesel, 40.5);

        // Simulando uso antes da manutencao
        ferrari.setPosicaoGPS("Autodromo de Interlagos, curva 1");
        volvo.setPosicaoGPS("Rodovia Anhanguera, km 72");
        motorAvulso.registrarKm(15000);

        System.out.println("========================================");
        System.out.println("       TESTE DE ABSTRACAO ATIVADO       ");
        System.out.println("========================================");

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
        System.out.println("   POLIMORFISMO COM INTERFACE: Rastreavel");
        System.out.println("========================================");

        // Array da INTERFACE Rastreavel — ferrari e volvo sao de hierarquias irmas
        Rastreavel[] frota = { ferrari, volvo };

        for (Rastreavel veiculo : frota) {
            System.out.println(veiculo.getPosicaoAtual());
        }

        System.out.println("========================================");
        System.out.println("   POLIMORFISMO COM INTERFACE: Manutivel");
        System.out.println("========================================");

        // Array da INTERFACE Manutivel — mistura hierarquias DIFERENTES:
        // ferrari e volvo estendem 'exercicio'; motorAvulso estende apenas Object
        // Isso e o poder das interfaces: unir objetos sem parentesco!
        Manutivel[] itensParaRevisar = { ferrari, volvo, motorAvulso };

        for (Manutivel item : itensParaRevisar) {
            System.out.println("\nRelatorio: " + item.getRelatorioManutencao());
            item.realizarManutencao();
        }

        System.out.println("========================================");
        System.out.println("        RELATORIOS POS-MANUTENCAO       ");
        System.out.println("========================================");

        for (Manutivel item : itensParaRevisar) {
            System.out.println(item.getRelatorioManutencao());
        }
    }
}