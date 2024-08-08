import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA DA AREA DO RETANGULO\n");
        System.out.println("Digite o 1ª lado do retangulo: ");
        float lado1 = scanner.nextFloat();
        System.out.println("Digite o 2ª lado do retangulo: ");
        float lado2 = scanner.nextFloat();

        float area = lado1 * lado2;

        System.out.printf("A area do retangulo e: %f\n", area);
    }
}
