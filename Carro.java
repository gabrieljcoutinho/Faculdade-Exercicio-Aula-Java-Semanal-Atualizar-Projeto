public class Carro {

    // Atributos privados (Encapsulamento)
    private String modelo;
    private String cor;
    private int velocidadeAtual;

    // --- GETTERS E SETTERS ---

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Regra Especial: A velocidade não pode ser negativa
    public void setVelocidadeAtual(int velocidadeAtual) {
        if (velocidadeAtual >= 0) {
            this.velocidadeAtual = velocidadeAtual;
        } else {
            System.err.println("ERRO: A velocidade não pode ser negativa! Mantendo valor anterior.");
        }
    }

    // --- MÉTODOS DE AÇÃO ---

    public void acelerar() {
        setVelocidadeAtual(this.velocidadeAtual + 10);
        System.out.println("Ação: ACELERAR -> Velocidade: " + this.velocidadeAtual + " km/h");
    }

    public void frear() {
        setVelocidadeAtual(this.velocidadeAtual - 10);
        System.out.println("Ação: FREAR -> Velocidade: " + this.velocidadeAtual + " km/h");
    }

    // --- MAIN PARA TESTES ---
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        // Usando setters para definir valores
        meuCarro.setModelo("Fusca");
        meuCarro.setCor("Azul");
        meuCarro.setVelocidadeAtual(0);

        System.out.println("OBJETO: CARRO - " + meuCarro.getModelo());
        System.out.println("================================");

        // Testando funcionamento normal
        meuCarro.acelerar();

        // Tentando burlar o sistema (Regra de Negócio)
        System.out.println("Tentativa de burlar: Definindo velocidade -50...");
        meuCarro.setVelocidadeAtual(-50);

        System.out.println("Velocidade atual após tentativa: " + meuCarro.getVelocidadeAtual() + " km/h");
        System.out.println("================================");
    }
}
