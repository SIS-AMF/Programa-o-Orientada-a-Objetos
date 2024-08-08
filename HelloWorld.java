import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        var resultado = valor1 + valor2;
        System.out.println("Resultado: " + resultado);
    }
}