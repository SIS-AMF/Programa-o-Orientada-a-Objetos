package Aulas.Aula04.questao02;
public class Aluno {
    int matricula, idade;
    String nome;
    double altura;

    public static void mediaIdade(Aluno[] alunos) {
        int soma = 0;
        for (int i = 0; i < alunos.length; i++) {
            soma += alunos[i].idade;
        }
        double media = (double) soma / alunos.length;
        System.out.println("A média das idades é: " + media);
    }

    public static void menores2Idades(Aluno[] alunos) {
        int[] menores = new int[2];
        menores[0] = alunos[0].idade;
        for (int i = 1; i < 10; i++) {
            if (menores[0] > alunos[i].idade) {
                menores[1] = menores[0];
                menores[0] = alunos[i].idade;
            }
        }
        System.out.printf("As duas menores idade: %d - %d\n", menores[0], menores[1]);
    }

    public static void porcentagem(Aluno[] alunos) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (alunos[i].idade > 16)
                contador++;
        }
        float percentual = (float) contador / 10 * 100;
        System.out.printf("Percentual: %.2f\n", percentual);
    }

    public static void maiormenor(Aluno[] alunos) {
        float totalAltura = 0;
        for (int i = 0; i < 10; i++)
            totalAltura += alunos[i].altura;
        double mediaAltura = totalAltura / 10;
        
        int contadorMenor16MaiorMediaAltura = 0;
        for (int i = 0; i < 10; i++) {
            if (alunos[i].idade < 16 && mediaAltura < alunos[i].altura) 
            contadorMenor16MaiorMediaAltura++;
        }
        System.out.println("Maior 16 e maior que media da altura: " + contadorMenor16MaiorMediaAltura);
    }
}
