package Aulas.Aula04.questao04;
public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();

        folha.funcionarios[0] = new Funcionario(1, 160, 50);
        folha.funcionarios[0].setQuantidadeHorasExtras(10);

        folha.funcionarios[1] = new Funcionario(2, 170, 55);
        folha.funcionarios[1].setQuantidadeHorasExtras(5);

        folha.funcionarios[2] = new Funcionario(3, 180, 60);
        folha.funcionarios[2].setQuantidadeHorasExtras(20);

        System.out.println("\n\nAntes da ordenação:");
        folha.exibir();

        folha.ordenar();

        System.out.println("\n\nDepois da ordenação:");
        folha.exibir();
    }
}