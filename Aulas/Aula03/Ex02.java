package Aulas.Aula03;
public class Ex02 {
    public static void main(String[] args) {
        Aluno lucas = new Aluno();
        lucas.nome = "Lucas Feldmann";
        lucas.g1 = 10;
        lucas.g2 = 9;
        lucas.exibir();
        lucas.g2 = 9;
        System.out.println(lucas.calcularMedia());
    }
}
