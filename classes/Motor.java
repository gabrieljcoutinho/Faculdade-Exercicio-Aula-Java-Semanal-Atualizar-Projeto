public class Motor implements Manutivel {
    private String tipoCombustivel;
    private int cavalos;
    private int kmDesdeUltimaManutencao;

    public Motor(String tipoCombustivel, int cavalos) {
        this.tipoCombustivel = tipoCombustivel;
        this.cavalos = cavalos;
        this.kmDesdeUltimaManutencao = 0;
    }

    public void darPartida() {
        System.out.println("SISTEMA: Motor " + tipoCombustivel + " de " + cavalos + " CV ligado... VRUMMM!");
    }

    public String getTipoCombustivel() { return tipoCombustivel; }
    public int getCavalos()            { return cavalos; }

    public void registrarKm(int km) {
        this.kmDesdeUltimaManutencao += km;
    }

    @Override
    public void realizarManutencao() {
        System.out.println("OFICINA: Troca de oleo e filtros do motor " + tipoCombustivel + ".");
        kmDesdeUltimaManutencao = 0;
    }

    @Override
    public String getRelatorioManutencao() {
        return "Motor " + tipoCombustivel + " | " + cavalos + " CV | "
               + kmDesdeUltimaManutencao + " km desde ultima revisao";
    }
}