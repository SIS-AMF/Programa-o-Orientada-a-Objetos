
public class Funcionario {

    String nome;
    float salario;
    Cargo cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void aumentarSalario(double percentual) {
        if (percentual <= 20 && percentual > 0) {
            salario *= (percentual / 100 + 1);
        }
    }

}
