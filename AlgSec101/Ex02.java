import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ÁREA DO TRIÂNGULO\n");
        System.out.print("Digite a base do Triângulo: ");
        float base = scanner.nextFloat();
        System.out.print("Digite a altura do Triângulo: ");
        float altura = scanner.nextFloat();
        System.out.printf("\nA área do Tringulo é %f\n", base * altura / 2);
    }
}
