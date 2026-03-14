public class exercicio {

    // --- COMO ELE É (CARACTERÍSTICAS / ATRIBUTOS) ---
    String modelo;
    String cor;
    int velocidadeAtual;

    // --- O QUE ELE FAZ (AÇÕES / MÉTODOS) ---
    void acelerar() {
        velocidadeAtual += 10;
        System.out.println("Acao realizada: ACELERAR");
        System.out.println("Velocidade atual do " + modelo + ": " + velocidadeAtual + " km/h");
        System.out.println("--------------------------------");
    }

    void frear() {
        velocidadeAtual -= 10;
        System.out.println("Acao realizada: FREAR");
        System.out.println("Velocidade atual do " + modelo + ": " + velocidadeAtual + " km/h");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        // Criando o objeto
        exercicio meuCarro = new exercicio();

        // Definindo as características
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "Azul";
        meuCarro.velocidadeAtual = 0;

        // Exibindo o que é o objeto e suas características
        System.out.println("OBJETO: CARRO");
        System.out.println("CARACTERISTICAS (Atributos):");
        System.out.println("- Modelo: " + meuCarro.modelo);
        System.out.println("- Cor: " + meuCarro.cor);
        System.out.println("- Velocidade Inicial: " + meuCarro.velocidadeAtual);
        System.out.println("================================");

        // Executando as ações
        System.out.println("ACOES (Métodos):");
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.frear();
    }
}