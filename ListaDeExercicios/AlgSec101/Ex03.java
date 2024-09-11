import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ÁREA DO TRIÂNGULO\n");

        System.out.print("Digite o 1° Lado:");
        float lado1 = scanner.nextFloat();
        System.out.print("Digite o 2° Lado:");
        float lado2 = scanner.nextFloat();
        System.out.print("Digite o 3° Lado:");
        float lado3 = scanner.nextFloat();

        float semi = (lado1 + lado2 + lado3) / 2;
        System.out.printf("\nA área é: %f = %f\n", semi, Math.sqrt(semi * (semi - lado1) * (semi - lado2) * (semi - lado3)));
    }
}
