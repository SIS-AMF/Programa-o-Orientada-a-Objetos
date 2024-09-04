public class Funcionario {
    int codigo;
    float quantidadeHoras;
    float valorHora;
    float valorSalario;
    float quantidadeHorasExtras;

    public Funcionario(int codigo, float quantidadeHoras, float valorHora) {
        this.codigo = codigo;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    public float calcularHoraExtra() {
        return (float) (quantidadeHorasExtras * (valorHora * 1.5));
    }

    public float calcularSalario() {
        return valorSalario = (quantidadeHoras * valorHora) + calcularHoraExtra();
    }

    public void exibir() {
        System.out.println("Funcionario: " + codigo);
        System.out.println("Horas Trabalhadas: " + (quantidadeHoras + quantidadeHorasExtras));
        calcularSalario();
        System.out.println("Salario: R$" + valorSalario);
    }
}
