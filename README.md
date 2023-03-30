# Estrutura De Dados

Conteúdo das aulas e exercícios propostos na matéria Estrutura de Dados ministrada pelo professor Leandro Colevati, cursada no 3º semestre do curso de análise e desenvolvimento de sistemas na Faculdade de Tecnologia da Zona Leste (FATEC-ZL).

# Exercícios propostos

## [Aula01](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/Aula01)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=12k7kal6sYeTY5oH6SeJsrnss2RDhzBFv&arquivo=ExerciciosAulaRecursividade.pdf)

Resolver, por recursividade, os problemas abaixo, fazendo o desenho do teste da solução, apresentando o ponto de parada e o retorno da função para a próxima chamada. Fazer a implementação em Java na sequência. Carregar o código no Github.

- 1 - Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da multiplicação de A por B.

- 2 - Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por subtrações, exiba o resto da divisão.

- 3 - Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quantidade de números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais diferentes de zero.

## [Recursividade01](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/Recursividade01)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1EsAiBxl4nHoHmPSFZ7dj_2BiY4kkpdHa&arquivo=01-Recursividade.pdf) (pag. 17 a 20)

### [Exercício 1](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/Recursividade01/src/controller/Exercicio01.java) 

Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da recursividade, o número de entrada deveráser baixo para não dar estouro(limite de entrada = 12)):

O código deve trazer como comentários:

- a) A condição de parada
- b) Como escrever a função para o termo n em função do termo anterior

### [Exercício 2](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/Recursividade01/src/controller/Exercicio02.java) 

Crie uma função recursiva que exiba o total de elementos negativos de um vetor de inteiros, de N posições, passado como parâmetro:

O código deve trazer como comentários:

- a) A condição de parada
- b) Como escrever a função para o termo n em função do termo anterior

### [Exercício 3](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/Recursividade01/src/controller/Exercicio03.java)

Crie uma função recursiva que exiba a quantidade de dígitos de um número inteiro passado como parâmetro:

O código deve trazer como comentários:

- a) A condição de parada
- b) Como escrever a função para o termo n em função do termo anterior

### [Exercício 4](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/Recursividade01/src/controller/Exercicio04.java)

Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres (Ex.: entrada = teste ; saída = etset):

Deve se utilizar a função SUBSTRING da Java

O código deve trazer como comentários:

- a) A condição de parada
- b) Como escrever a função para o termo n em função do termo anterior

## [Recursividade02.01](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/Recursividade02.01/src)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1F3oK4A5hZDmuT9cdDsnbioQzb9QKMnaw&arquivo=02-ExerciciosRecursividade.pdf)

Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros número NATURAIS (a função deve retornar zero para números negativos)
- O Código deve apresentar, em formato de comentário, como foi definida a
condição de parada;
- O Código deve apresentar, em formato de comentário, como foi definida a
relação de chamada dos passos;

## [Recursividade02.02](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/Recursividade02.02/src)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1F3oK4A5hZDmuT9cdDsnbioQzb9QKMnaw&arquivo=02-ExerciciosRecursividade.pdf)

Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro, converta para binário. Entrada limitada a 2000.
- O Código deve apresentar, em formato de comentário, como foi definida a
condição de parada;
- O Código deve apresentar, em formato de comentário, como foi definida a
relação de chamada dos passos;

## [Recursividade02.03](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/Recursividade02.03/src)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1F3oK4A5hZDmuT9cdDsnbioQzb9QKMnaw&arquivo=02-ExerciciosRecursividade.pdf)

Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro (N), apresente a saída da somatória

    𝑆 = 1 + 1/2 + 1/3 + 1/4 + … + 1/N

- O Código deve apresentar, em formato de comentário, como foi definida a condição de
parada;
- O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;

## [Recursividade02.04](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/Recursividade02.04/src)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1F3oK4A5hZDmuT9cdDsnbioQzb9QKMnaw&arquivo=02-ExerciciosRecursividade.pdf)

Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um numero inteiro de 10 a 999999 e recebendo um 2º número inteiro (de 0 a 9), tenha uma função recursiva que apresente quantas vezes o 2º número aparece no primeiro.

- Exemplo 1: 1º. Número = 523578; 2º. Número = 5; retorno aparece 2 vezes

- Exemplo 2: 1º. Número = 836363; 2º. Número = 3; retorno aparece 3 vezes

- A validação da entrada e do dígito deve ser feito na main da aplicação e não na função recursiva;
- O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
- O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;

- Dica para a resolução do exercício
    
    Exemplo: Número 1234

        1234 / 10 = 123 com resto 4
        123 / 10 = 12 com resto 3
        12 / 10 = 1 com resto 2
        1 / 10 = 0 com resto 1

    Exemplo: Número 8647

        8647 / 10 = 864 com resto 7
        864 / 10 = 86 com resto 4
        86 / 10 = 8 com resto 6
        8 / 10 = 0 com resto 8

## [Recursividade02.05](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/Recursividade02.05/src)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1F3oK4A5hZDmuT9cdDsnbioQzb9QKMnaw&arquivo=02-ExerciciosRecursividade.pdf)

Considere a série de Fibonacci:
 - 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

- Escrever uma função recursiva que, dado uma posição da série, a função
retorne seu valor. Entrada limitada a 20.
- O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
- O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;

## [Recursividade02.06](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/Recursividade02.06/src)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1F3oK4A5hZDmuT9cdDsnbioQzb9QKMnaw&arquivo=02-ExerciciosRecursividade.pdf)

Considerando exercícios realizados anteriormente, criar uma função recursiva que solucione a função (Entrada limitada a 10):

    𝑆 = 1 + 1/2! + 1/3! + 1/4! + … + 1/𝑁!
- O Código deve apresentar, em formato de comentário, como foi definida a
condição de parada;
- O Código deve apresentar, em formato de comentário, como foi definida a
relação de chamada dos passos;

## [AlgoritmosOrdenacao](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/AlgoritmosOrdenacao/src/br/edu/fateczl/ordenacao)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1F-sHe4u0eYJK8kl7xLWQY5bprglPfYv-&arquivo=03-AlgoritmosOrdenacao.pdf)

#### BUBBLE SORT

O Bubble Sort é baseado em um algoritmo bastante simples, mas tem como comportamento percorrer o vetor diversas vezes, o que pode ser de bom desempenho com vetores pequenos e menos desordenados, mas perde desempenho em vetores médios ou grandes.

DESCRIÇÃO:

- Pegar um vetor
- O número de repetições deverá ser igual ao tamanho do vetor
- A dinâmica se dá como segue:
    - Da primeira posição do vetor, até a penúltima posição;
    - Verificar se a posição atual é maior que a próxima;
    - Se for, elas devem trocar de posição;
    - O controle de posição deve ser incrementado;
- Ao final, o vetor estará ordenado crescentemente

#### MERGE SORT

O Merge Sort tem bom desempenho em qualquer situação, seja referente ao tamanho do vetor ou à ordenação inicial dos dados. Baseado na técnica de divisão para conquista, utiliza a definição de uma posição central do vetor para dividir o vetor em sub vetor da esquerda e da direita e intercala os dados. Utiliza recursividade.

DESCRIÇÃO:

- Pegar um vetor (Ou parte dele)
- Identificar a posição central do vetor e dividi-lo em 2 (posição inicial – meio ; meio + 1 – posição final)
- Recursivamente, ir dividindo em sub vetores de esquerda e direita até que se encontre um vetor de 1 posição, retornando o próprio vetor;
- Nesse ponto, se retorna ao vetor anterior que deve intercalar os valores a fim de ordená-los
- A função de intercalar precisa conhecer a posição inicial, a posição final e o meio do vetor (ou sub vetor)
- A função de intercalar deve gerar um vetor auxiliar, com o tamanho do vetor inicial, mas com dados apenas nas posições do sub vetor passado como parâmetro
- Define-se como ponteiros:
    - esquerda iniciando na posição inicial
    - direita, iniciando na posição do meio + 1
- Intercalar significa fazer os seguintes testes aninhados, percorrendo o novo vetor de posição inicial para a posição final, controlando as posições por um contador
- Para cada posição do novo vetor:
    - Se o ponteiro da esquerda é maior que a posição do meio, o vetor inicial na posição do contador, recebe o valor do novo vetor na posição do ponteiro à direita. Incrementa-se o ponteiro da direita;
    - Senão, se o ponteiro da direta é maior que a posição do fim, o vetor inicial na posição do contador, recebe o valor do novo vetor na posição do ponteiro à esquerda. Incrementa-se o ponteiro da esquerda;
    - Senão, se o valor do novo vetor na posição do ponteiro à esquerda é menor que o valor do novo vetor na posição do ponteiro à direita, o vetor inicial na posição do contador, recebe o valor do novo vetor na posição do ponteiro à esquerda. Incrementa-se o ponteiro da esquerda;
    - Senão, o vetor inicial na posição do contador, recebe o valor do novo vetor na posição do ponteiro à direita. Incrementa-se o ponteiro da direita;
- O comportamento recursivo vai fazer com que os sub vetores retornem ordenados e desempilhando até a ordenação do vetor inicial

#### QUICK SORT
O Quick Sort é considerado um dos algoritmos com melhor desempenho. Pode ter menor desempenho que o Bubble Sort para vetores pequenos, mas tem um ótimo desempenho para vetores médios ou grandes. É baseado na técnica de divisão para conquista (Dividir para conquistar), sendo que a utilizada é denominada particionamento, utilizando um pivot, tal que, os números à esquerda são menores ou iguais ao pivot e os números à direita são maiores. Para melhor desenvolvimento, se usa recursividade.

DESCRIÇÃO:

- Pegar um vetor (Ou parte dele)
- Verifica se é um vetor de mais de 1 posição
    - Caso seja de 1 posição, já está ordenado
- Defina, arbitrariamente, a primeira posição como um pivô, portanto, a validação será feita da 2ª posição até a última
- Marcar a segunda posição com um ponteiro da esquerda e a última com um ponteiro
da direita
- Enquanto o ponteiro da esquerda se mantiver à esquerda do ponteiro da direita, validar:
    - Enquanto o valor do ponteiro da esquerda for menor ou igual ao valor do pivô e o ponteiro da esquerda continuar à esquerda do ponteiro da direita, o ponteiro da esquerda incrementa 1. Se alguma condição falhar, o incremento cessa;
    - Enquanto o valor do ponteiro da direita for maior que o pivô e o ponteiro da esquerda continuar à esquerda ou igualar ao ponteiro da direita, o ponteiro da direita decrementa 1. Se alguma condição falhar, o decremento cessa;
    - Se incremento do ponteiro da esquerda e decremento do ponteiro da direita cessarem, mas o ponteiro da esquerda continuar à esquerda do ponteiro da direita, os valores cujos índices forem, ponteiro da esquerda e ponteiro da direita, mudam de lugar. Incrementa-se o ponteiro da esquerda e decrementa-se o ponteiro da direita;
- Quando o ponteiro da direita, passar à esquerda do ponteiro da esquerda, o valor do pivô troca de lugar com o valor cujo índice é o ponteiro da direita
- A partir desse momento, com o pivô em algum lugar entre o início e o fim do vetor inicial, este valor já está na sua posição definitiva restando um (sub)vetor à esquerda e um (sub)vetor à direita.
-Recursivamente, a função usada com vetor inicial, deve ser chamada novamente (sem retorno), para ordenar o sub vetor da esquerda e, sequencialmente, o da direita.
- Essa recursividade deve seguir até que o subvetor fique com 1 única posição, condição de parada da recursividade.
-Neste ponto, o vetor estará ordenado