import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA DA ÁREA DO RETÂNGULO\n");
        System.out.print("Digite o 1ª lado do retângulo: ");
        float lado1 = scanner.nextFloat();
        System.out.print("Digite o 2ª lado do retângulo: ");
        float lado2 = scanner.nextFloat();
        System.out.printf("\nA área do retângulo é: %f\n", lado1 * lado2);
    }
}
