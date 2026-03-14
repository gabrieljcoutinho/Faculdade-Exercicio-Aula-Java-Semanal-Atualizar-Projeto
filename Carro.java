/**
 * @author Gabriel Jorge Coutinho
 * @version 2.0 - Refactor: Encapsulamento e Regras de Negócio
 */
public class Carro {

    private String modelo;
    private String cor;
    private int velocidadeAtual;
    private final int LIMITE_VELOCIDADE = 220; // Constante de segurança

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidadeAtual = 0;
    }


    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getVelocidadeAtual() { return velocidadeAtual; }


    public void setVelocidadeAtual(int velocidade) {
        if (velocidade < 0) {
            System.err.println(">> BLOQUEADO: Tentativa de velocidade negativa (" + velocidade + " km/h)");
            return;
        }
        if (velocidade > LIMITE_VELOCIDADE) {
            System.err.println(">> ADVERTÊNCIA: Limite de segurança atingido (" + LIMITE_VELOCIDADE + " km/h)");
            this.velocidadeAtual = LIMITE_VELOCIDADE;
        } else {
            this.velocidadeAtual = velocidade;
        }
    }



    public void acelerar() {
        System.out.println("Comando: ACELERAR [+]");
        setVelocidadeAtual(this.velocidadeAtual + 20);
        exibirStatus();
    }

    public void frear() {
        System.out.println("Comando: FREAR [-]");
        setVelocidadeAtual(this.velocidadeAtual - 20);
        exibirStatus();
    }

    private void exibirStatus() {
        String moldura = "------------------------------------";
        System.out.println(moldura);
        System.out.printf("VEÍCULO: %s | COR: %s %n", modelo.toUpperCase(), cor.toUpperCase());
        System.out.printf("VELOCIDADE ATUAL: %d km/h %n", velocidadeAtual);
        System.out.println(moldura);
    }

    public static void main(String[] args) {
        // Instanciação moderna
        Carro meuCarro = new Carro("Skyline GTR", "Bayside Blue");

        System.out.println("INICIALIZANDO SISTEMAS...");

        // Teste 1: Aceleração normal
        meuCarro.acelerar();

        // Teste 2: Tentativa de quebra de integridade (Burlar o sistema)
        System.out.println("\nTESTE DE VULNERABILIDADE: Injetando velocidade negativa...");
        meuCarro.setVelocidadeAtual(-150);

        // Teste 3: Tentativa de ultrapassar limite físico
        System.out.println("\nTESTE DE PERFORMANCE: Forçando limite de hardware...");
        meuCarro.setVelocidadeAtual(500);

        System.out.println("\nRESULTADO FINAL DO OBJETO:");
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Velocidade Segura: " + meuCarro.getVelocidadeAtual() + " km/h");
    }
}
