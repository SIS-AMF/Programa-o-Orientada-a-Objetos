public class Computador {
    private Processador processador;
    private Memoria memoria;
    private PlacaMae placaMae;

    public Computador(int tamanhoMB, String nomeProcessador, float clockBase, float clockTurbo, int nucleoFisico, String nomePlacaMae, String chipset) {
        memoria = new Memoria(tamanhoMB);
        processador = new Processador(nomeProcessador, clockBase, clockTurbo, nucleoFisico);
        placaMae = new PlacaMae(nomePlacaMae, chipset);
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(String nome, float clockBase, float clockTurbo, int nucleoFisico) {
        if (nome != null) {
            processador.setNome(nome);
        }
        if (clockBase >= 0) {
            processador.setClockBase(clockBase);
        }
        if (clockTurbo >= 0) {
            processador.setClockTurbo(clockTurbo);
        }
        if (nucleoFisico >= 0) {
            processador.setNucleoFisico(nucleoFisico);
        }
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }
}