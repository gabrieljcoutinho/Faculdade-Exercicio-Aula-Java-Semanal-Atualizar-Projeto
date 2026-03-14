public class exercicio {
    // Atributos privados: Ninguém mexe direto (Sinal de - no Astah)
    private String modelo;
    private String cor;
    private int velocidadeAtual;

    public exercicio() {
    }

    // Métodos Getter e Setter (Sinal de + no Astah)
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

    public void setVelocidadeAtual(int velocidade) {
        // Regra de segurança: a velocidade não pode ser menor que zero
        if (velocidade >= 0) {
            this.velocidadeAtual = velocidade;
        } else {
            System.out.println("Aviso: O carro já está parado.");
            this.velocidadeAtual = 0;
        }
    }

    // Métodos de Ação
    public void acelerar() {
        setVelocidadeAtual(this.velocidadeAtual + 10);
        System.out.println("Acao realizada: ACELERAR");
        System.out.println("Velocidade atual do " + this.modelo + ": " + this.velocidadeAtual + " km/h");
        System.out.println("--------------------------------");
    }

    public void frear() {
        setVelocidadeAtual(this.velocidadeAtual - 10);
        System.out.println("Acao realizada: FREAR");
        System.out.println("Velocidade atual do " + this.modelo + ": " + this.velocidadeAtual + " km/h");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        exercicio carro = new exercicio();

        // Agora usamos os SETTERS para configurar o objeto
        carro.setModelo("Fusca");
        carro.setCor("Azul");
        carro.setVelocidadeAtual(0);

        System.out.println("OBJETO: CARRO (Encapsulado)");
        System.out.println("CARACTERISTICAS:");
        System.out.println("- Modelo: " + carro.getModelo());
        System.out.println("- Cor: " + carro.getCor());
        System.out.println("- Velocidade Inicial: " + carro.getVelocidadeAtual());
        System.out.println("================================");

        System.out.println("ACOES:");
        carro.acelerar();
        carro.acelerar();
        carro.frear();
    }
}
