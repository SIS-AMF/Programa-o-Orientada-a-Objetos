import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA DE MÉDIA DE 3\n");
        System.out.print("Digite a 1ª nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Digite a 2ª nota: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Digite a 3ª nota: ");
        float nota3 = scanner.nextFloat();
        System.out.printf("\nA media é: %f\n", (nota1+ nota2+ nota3) / 3);
    }
}