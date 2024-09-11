
public class Produto {

    String nome;
    int quantidadeEstoque = 0;
    float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void vender(int quantidade) {
        if (quantidadeEstoque - quantidade >= 0) {
            quantidadeEstoque -= quantidade;
        }
    }
}
