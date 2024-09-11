package Aulas.Aula02;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cpf = scanner.nextLine();

        System.out.println(verficar(cpf));
    }

    public static String verficar (String cpf) {
        if (calcular(cpf, 10) == converter(9, 10, cpf));
        else if (calcular(cpf, 10) == converter(10, 11, cpf));
        else return "CPF INVALIDO";
        return "CPF VALIDO";
    }
    
    public static int converter (int ini, int end, String cpf) {
        return Integer.parseInt(cpf.substring(ini,end));
    }
    
    public static int calcular (String cpf, int numero) {
        int total = 0;
        for (int x = numero, contador = 0; x >= 2; x--, contador++) {
            total += x * converter(contador, contador + 1, cpf);
        }
        int result = total % 11;
        if (result < 2) {
            return 0;
        } 
        return 11 - result;
    }
}
