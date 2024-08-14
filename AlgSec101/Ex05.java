import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULO DA ÁREA DO CUBO\n");
        System.out.print("Digite o valor de uma das arestas: ");
        float aresta = scanner.nextFloat();
        System.out.printf("\nA volume do cubo é: %f\n", Math.pow(aresta,3));
        System.out.printf("\nA área do cubo é: %f\n", Math.pow(aresta,2) * 6);
    }
}