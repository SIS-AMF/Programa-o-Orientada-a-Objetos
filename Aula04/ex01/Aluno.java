public class Aluno {
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    String nome;
    int idade;

    public void exibir() {
        System.out.println(nome + idade);
    }
}
