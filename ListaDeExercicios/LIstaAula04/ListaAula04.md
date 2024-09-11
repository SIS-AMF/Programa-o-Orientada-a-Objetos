# Exercício 1: Criar uma Classe com Atributos Privados

**Objetivo**: Criar uma classe `Carro` com atributos privados e métodos públicos de acesso.

### Descrição:

- Crie uma classe `Carro` com os atributos privados: `marca`, `modelo`, `ano` e `preco`.
- Crie métodos `get` e `set` para cada atributo.
- No método `setPreco()`, adicione uma validação para que o preço não possa ser negativo.

**Dica**: Use a palavra-chave `private` para os atributos e `public` para os métodos.

---

# Exercício 2: Validação de Entrada de Dados

**Objetivo**: Aplicar validações nos métodos setters.

### Descrição:

- Crie uma classe `ContaBancaria` com os atributos privados: `titular`, `saldo`, e `numeroConta`.
- Crie métodos `get` e `set` para todos os atributos.
- No método `setSaldo()`, implemente uma regra que impede que o saldo seja definido como um valor negativo.
- Adicione um método `depositar(double valor)` e outro `sacar(double valor)` que só permite saques se o saldo for suficiente.

---

# Exercício 3: Encapsulamento e Modificação Controlada

**Objetivo**: Controlar o acesso e a modificação de atributos internos.

### Descrição:

- Crie uma classe `Pessoa` com os atributos privados: `nome`, `idade`, e `cpf`.
- O CPF deve ser definido uma vez e não pode ser alterado posteriormente.
- O nome e a idade podem ser modificados através dos métodos `setNome()` e `setIdade()`, mas a idade deve sempre ser maior que zero.
- Adicione um método `mostrarDados()` que exibe os dados da pessoa.

---

# Exercício 4: Encapsulamento com Lógica de Negócio

**Objetivo**: Aplicar lógica de negócios dentro de métodos setters e getters.

### Descrição:

- Crie uma classe `Produto` com os atributos privados: `nome`, `quantidadeEstoque` e `preco`.
- Crie métodos `get` e `set` para todos os atributos, mas a quantidade em estoque só pode ser atualizada por um método `adicionarEstoque(int quantidade)` e `vender(int quantidade)`.
- Adicione validações para impedir que a quantidade no estoque fique negativa e para garantir que o preço não seja zero ou negativo.

---

# Exercício 5: Implementação de uma Classe com Encapsulamento Completo

**Objetivo**: Desenvolver uma classe completa que utiliza encapsulamento, com regras de acesso e modificação.

### Descrição:

- Crie uma classe `Funcionario` com os atributos privados: `nome`, `salario`, e `cargo`.
- O salário deve ser protegido de modificação direta. Crie um método `aumentarSalario(double percentual)` que só permita aumentos de até 20%.
- O cargo só pode ser modificado por um método `promover(String novoCargo)`, e só se o cargo anterior for compatível com o novo (adicione uma validação básica para isso).
- Crie métodos para exibir os dados completos do funcionário.
