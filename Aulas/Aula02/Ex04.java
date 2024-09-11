package Aulas.Aula02;
public class Ex04 {
    public static void main(String[] args) {
        for (int x = 1; x < 1000000; x++) {
            int total = 0;
            for (int y = 1; y < x; y++)
                if (x % y == 0) {
                    total += y;
                }
            if (x == total) System.out.println(x);
        }
    }
}