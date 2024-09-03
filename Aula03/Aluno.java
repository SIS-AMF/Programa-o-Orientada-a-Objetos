public class Aluno {
    String nome;
    float media, g1, g2;

    public float calcularMedia() {
        return media = (g1 + g2) / 2;
    }

    public void exibir() {
        if (calcularMedia() >= 7) System.out.printf("%s sua media é: %.2f\n",nome,media);
    }
}
