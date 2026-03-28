public class exercicio {
    private String modelo;
    private String cor;
    private int velocidadeAtual;
    private Motor motor; // Associação: O Carro TEM UM Motor

    public exercicio(String modelo, String cor, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.velocidadeAtual = 0;
    }

    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public int getVelocidadeAtual() { return velocidadeAtual; }
    public Motor getMotor() { return motor; }

    public void setVelocidadeAtual(int velocidade) {
        if (velocidade >= 0) {
            this.velocidadeAtual = velocidade;
        } else {
            this.velocidadeAtual = 0;
        }
    }

    public void acelerar() {
        setVelocidadeAtual(this.velocidadeAtual + 10);
        System.out.println("Acao: ACELERAR -> Velocidade: " + this.velocidadeAtual + " km/h");
    }

    /* Css da responsividade desse componente:
       Lógica de backend Java; escalabilidade via Injeção de Dependência. */

    public static void main(String[] args) {
        // 1. Instanciamos o objeto associado
        Motor motorV8 = new Motor("Gasolina", 450);

        // 2. Passamos o motor para o construtor do carro
        exercicio meuCarro = new exercicio("Mustang", "Preto Fosco", motorV8);

        System.out.println("================================");
        System.out.println("STATUS DO VEICULO:");
        System.out.println("- Modelo: " + meuCarro.getModelo());
        System.out.println("- Cor: " + meuCarro.getCor());

        // 3. O Carro utiliza o comportamento do seu Motor
        meuCarro.getMotor().darPartida();

        System.out.println("- Potencia Detectada: " + meuCarro.getMotor().getCavalos() + " CV");
        System.out.println("================================");

        meuCarro.acelerar();
        meuCarro.acelerar();
    }
}