# CAPGEMINI
Repositório com as respostas do desafio capgemini

## Respostas

A resposta para as questões 1, 2 e 3 estão nas Classes QuestaoUm, QuestaoDois, QuestaoTres respectivamente, todas do pacote com.carlostrks.

As classes de Teste para cada uma das classes possuem o nome da classe que terá seus métodos testados com o acréscimo da palavra Test,
 por exemplo, a classe que testa os métodos da classe QuestaoDois se chama QuestaoDoisTest.

Não considerei necessário a criação de algum objeto, por esse motivo as classes são abstratas e seus métodos estáticos,
em cada uma delas adicionei um método main para que também sejam executadas.

Executando os testes unitários é possível verificar que os métodas fazem o que devem fazer.
Se as classes QuestaoUm, QuestaoDois ou QuestaoTres forem executadas, a solução apresentada pode estar além do que foi pedido.

Executando a classe QuestaoUm, o usuário necessita digitar o número inteiro que será usado na impressão dos asteriscos.

Executando a classe QuestaoDois, se a senha não cumprir os requisitos necessários, é exibido não somente o número de caracteres necessáios
mas também os tipos de caracteres que faltam para que a senha possa ser considerada forte, cada caracter digitado é contatenado aos que já estavam
 e enquanto o caractere necessário não for digitado o programa não é encerrado.

Executando a classe QuestaoTres, são impressos os pares de substrings e o número de pares de substrings que são anagramas.


## Tecnologias utilizadas

- Java (JDK 11)
- Intellij IDEA
- Maven
- JUnit

## Execução do programa

Pré-requisitos: Ambiente de desenvolvimento Java configurado.

```bash
# clonar repositório
git clone https://github.com/josecarlostrks/CAPGEMINI.git
```
Em sua IDE abra o projeto, compile, e execute os testes como desejar.

## Observações

A Questão 3 pediu para que o número de pares de substrings que são anagramas fosse encontrado, porém, os exemplos dados ficaram um pouco confusos.

No exemplo 1, a entrada "ovo" estava com a saída 3, mas a explicação apresentou 2 pares de anagramas, [o, o], [ov, vo].

No exemplo 2, a entrada "ifailuhkqq" estava com a saída 3, e na explicação apresentou os 3 pares de anagrama [i, i], [q, q] e [ifa, fai].

Como a questão pediu claramente o número de pares de substrings que são anagramas, 
considerei que foi apenas algum erro de digitação quando foi colocado a saída 3 ao invés de 2 no exemplo 1.


