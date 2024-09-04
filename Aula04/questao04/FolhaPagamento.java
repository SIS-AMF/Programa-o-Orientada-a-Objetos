
public class FolhaPagamento {
    Funcionario[] funcionarios = new Funcionario[50];

    public void ordenar() {
        for (int i = 0; i < funcionarios.length - 1; i++) {
            for (int j = 0; j < funcionarios.length - 1 - i; j++) {
                if (funcionarios[j] != null && funcionarios[j + 1] != null) {
                    if (funcionarios[j].calcularSalario() < funcionarios[j + 1].calcularSalario()) {
                        Funcionario temp = funcionarios[j];
                        funcionarios[j] = funcionarios[j + 1];
                        funcionarios[j + 1] = temp;
                    }
                }
            }
        }
    }

    public void exibir() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                System.out.println();
                funcionario.exibir();
            }
        }
        
    }

    public void main() {
        exibir();
        ordenar();
        exibir();
    }
}
