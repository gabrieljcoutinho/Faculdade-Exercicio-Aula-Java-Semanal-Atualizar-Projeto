public class Motor {
    private String tipoCombustivel;
    private int cavalos;

    public Motor(String tipoCombustivel, int cavalos) {
        this.tipoCombustivel = tipoCombustivel;
        this.cavalos = cavalos;
    }

    // Método de ação do Motor
    public void darPartida() {
        System.out.println("SISTEMA: Motor " + this.tipoCombustivel + " de " + this.cavalos + " CV ligado... VRUMMM!");
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getCavalos() {
        return cavalos;
    }
}