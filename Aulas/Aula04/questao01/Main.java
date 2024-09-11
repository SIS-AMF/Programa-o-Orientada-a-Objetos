package Aulas.Aula04.questao01;
public class Main {
    public static void main(String[] args) {
        boolean stop = false;
        int qtd = 10;
        int matricula[] = {1,2,3,4,5,6,7,8,9,10};
        String nome[] = {"João", "Maria", "Pedro", "Clara", "Jose", "Carla", "Fabio", "Mara", "Cesar", "Ana"};
        int idade[] = {14,18,15,16,17,14,17,13,16,17};
        double altura[] = {1.75, 1.54, 1.62, 1.60, 1.65, 1.62, 1.62, 1.74, 1.61, 1.68};
        
        int total = 0;
        for (int i = 0; i < 10; i++)
            total += idade[i];
        float media = total / 10;
        System.out.println("Media: " + media);

        int menores[] = {idade[0], idade[1]};
        for (int i = 2; i < 10; i++) {
            if (menores[0] > idade[i]) {
                menores[1] = menores[0];
                menores[0] = idade[i];
            }
        }
        System.out.printf("As duas menores idade: %d - %d\n", menores[0], menores[1]);

        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (idade[i] > 16)
                contador++;
        }
        float percentual = (float) contador / 10 * 100;
        System.out.printf("Percentual: %.2f\n", percentual);

        float totalAltura = 0;
        for (int i = 0; i < 10; i++)
            totalAltura += altura[i];
        double mediaAltura = totalAltura / 10;
        
        int contadorMenor16MaiorMediaAltura = 0;
        for (int i = 0; i < 10; i++) {
            if (idade[i] < 16 && mediaAltura < altura[i]) 
            contadorMenor16MaiorMediaAltura++;
        }
        System.out.println("Maior 16 e maior que media da altura: " + contadorMenor16MaiorMediaAltura);
    }
}
