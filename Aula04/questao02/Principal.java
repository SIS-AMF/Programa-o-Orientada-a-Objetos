public class Principal {


    Aluno[] aluno = new Aluno[10];

    public static void main(String[] args) {
        int matricula[] = {1,2,3,4,5,6,7,8,9,10};
        String nome[] = {"João", "Maria", "Pedro", "Clara", "Jose", "Carla", "Fabio", "Mara", "Cesar", "Ana"};
        int idade[] = {14,18,15,16,17,14,17,13,16,17};
        double altura[] = {1.75, 1.54, 1.62, 1.60, 1.65, 1.62, 1.62, 1.74, 1.61, 1.68};

       

        for (int i = 0; i < 10; i++) {
            aluno[i] = new Aluno();
            aluno[i].matricula = matricula[i];
            aluno[i].nome = nome[i];
            aluno[i].idade = idade[i];
            aluno[i].altura = altura[i];
        }

        Aluno.mediaIdade(aluno);
        Aluno.menores2Idades(aluno);
        Aluno.porcentagem(aluno);
        Aluno.maiormenor(aluno);
    }
}
