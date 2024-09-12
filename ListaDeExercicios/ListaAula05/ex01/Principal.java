public class Principal {
    public static void main(String[] args) {
        Motor fire = new Motor(10, "Gasolina");
        Carro carro01 = new Carro(5, "Alcol", "Uno");
        fire.exibir();
        System.out.println();
        carro01.exibir();
    }
}
