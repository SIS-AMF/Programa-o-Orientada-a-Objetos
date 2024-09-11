package Aulas.Aula02;
public class Ex02 {
    public static void main(String[] args) {
        for (int x = 1; x < 500; x++) {
            boolean primo = true;
            for (int y = 2; y < x; y++)
                if (x % y == 0) {
                    primo = false;
                    break;
                }
            if (primo)
                System.out.println(x);
        }
    }
}