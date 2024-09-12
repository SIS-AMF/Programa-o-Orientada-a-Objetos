
public class Carro {
    private String nome;
    private Motor motor;

    public Carro(double potencia, String tipoCombustivel, String nome) {
        motor = new Motor(potencia, tipoCombustivel);
        this.nome = nome;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void exibir() {
        System.out.println("----Carro----");
        System.out.println("Nome: " + nome);
        motor.exibir();
    }
}
