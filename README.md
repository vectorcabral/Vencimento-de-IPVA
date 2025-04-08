# Vencimento-de-IPVA


O programa tem como objetivo informar o mês de vencimento do IPVA de um carro, com base no número final da placa do veículo.
1. **Declaração de variáveis**: O primeiro passo foi declarar as variáveis necessárias e definir seus tipos. Neste caso, foi utilizada a variável do tipo `Int` para armazenar o número final da placa.
2. **Conversão de dados**: Os dados inseridos pelo usuário foram convertidos de `String` para `int` utilizando o método `Integer.parseInt()`.
3. **Estrutura de decisão (switch)**: Utilizei a estrutura `switch` para verificar o valor inserido. Para cada valor possível (de 1 a 9), foi criado um `case` correspondente que exibe o mês de vencimento do IPVA de acordo com o número final da placa.
4. **Tratamento de valores inválidos**: Caso o número digitado não esteja entre os valores esperados (1 a 9), o programa exibe uma mensagem de erro indicando que o valor não foi identificado.
5. **Uso do `default`**: O comando `default` foi utilizado para finalizar a estrutura `switch`, garantindo o tratamento de qualquer entrada inválida que não corresponda aos `cases` definidos.
