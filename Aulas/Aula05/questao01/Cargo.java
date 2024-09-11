
public class Cargo {

    private int nivel;
    private String nome;

    public Cargo(int nivel,String nome){
        this.nivel = nivel;
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
