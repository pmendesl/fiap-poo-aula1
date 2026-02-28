Projeto de Conta Bancária - POO

O que o Objeto Representa?

A classe `Conta` representa uma conta bancária no mundo real. Ela encapsula os dados essenciais de uma conta (agência, número, CPF do titular e saldo) e as operações que podem ser realizadas sobre ela, como sacar, depositar e consultar o saldo.

# Estrutura da Classe `Conta`

A classe possui os seguintes atributos:

*   `agencia` (int): O número da agência.
*   `numeroConta` (int): O número da conta.
*   `digito` (int): O dígito verificador da conta.
*   `cpf` (String): O CPF do titular da conta.
*   `saldo` (double): O valor monetário disponível na conta.

Como Usar os Métodos

Para interagir com um objeto `Conta`, você pode usar os seguintes métodos:

# `void depositar(double valor)`

Este método adiciona um valor ao saldo da conta.

*   **Parâmetro**: `valor` (double) - O valor a ser depositado.
*   **Regra de Negócio**: O método só aceita valores maiores que zero. Se um valor negativo ou zero for informado, a operação é bloqueada e uma mensagem de erro é exibida.

Exemplo de uso:
```java
Conta minhaConta = new Conta();
minhaConta.saldo = 100.0;
minhaConta.depositar(50.0); // Saldo agora é 150.0
```

# `void sacar(double valor)`

Este método retira um valor do saldo da conta.

*   Parâmetro: `valor` (double) - O valor a ser sacado.
*   Regras de Negócio:
    1.  O valor do saque deve ser maior que zero.
    2.  O saldo da conta deve ser maior ou igual ao valor do saque.
*   Se alguma das regras for violada, a operação não é concluída e uma mensagem explicativa é mostrada no console.

Exemplo de uso:
```java
Conta minhaConta = new Conta();
minhaConta.saldo = 150.0;
minhaConta.sacar(30.0); // Saldo agora é 120.0
minhaConta.sacar(200.0); // Exibe "Saldo insuficiente."
```

# `void exibirSaldo()`

Este método imprime no console o saldo atual da conta formatado em uma mensagem amigável.

Exemplo de uso:
```java
minhaConta.exibirSaldo();
// Saída: O saldo atual da conta de CPF [CPF] é: R$[saldo]
```

Como Executar o Projeto

1.  Clone o repositório.
2.  Abra o projeto em sua IDE Java (VS Code).
3.  Execute o arquivo `src/Main.java`. O console mostrará os resultados dos testes de depósito e saque.
