package Aulas.Aula04.questao04;
public class Funcionario {
    private int codigo;
    private float quantidadeHoras;
    private float valorHora;
    private float valorSalario;
    private float quantidadeHorasExtras;

    public void setQuantidadeHorasExtras(float value) {
        quantidadeHorasExtras = value;
    }

    public Funcionario(int codigo, float quantidadeHoras, float valorHora) {
        this.codigo = codigo;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    private float calcularHoraExtra() {
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
