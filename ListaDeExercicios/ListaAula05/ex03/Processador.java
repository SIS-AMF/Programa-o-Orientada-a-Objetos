public class Processador {
    String nome;
    float clockBase = 0;
    float clockTurbo = 0;
    int nucleoFisico = 0;

    public Processador(String nome, float clockBase, float clockTurbo, int nucleoFisico) {
        this.nome = nome;
        this.clockBase = clockBase;
        this.clockTurbo = clockTurbo;
        this.nucleoFisico = nucleoFisico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getClockBase() {
        return clockBase;
    }

    public void setClockBase(float clockBase) {
        this.clockBase = clockBase;
    }

    public float getClockTurbo() {
        return clockTurbo;
    }

    public void setClockTurbo(float clockTurbo) {
        this.clockTurbo = clockTurbo;
    }

    public int getNucleoFisico() {
        return nucleoFisico;
    }

    public void setNucleoFisico(int nucleoFisico) {
        this.nucleoFisico = nucleoFisico;
    }
}
