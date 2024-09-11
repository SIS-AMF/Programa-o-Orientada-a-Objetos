package Aulas.Aula06.EX01;
public class Biblioteca {
    private Livro[] livros;

    public Biblioteca() {}

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro livro, int index) {
        this.livros[index] = livro;
    }
}
