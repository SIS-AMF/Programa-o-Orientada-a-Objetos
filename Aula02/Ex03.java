import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int total = 0;
        for (int x = 1; x < numero + 1; x++) total += x;
        System.out.println(total);
    }   
}
