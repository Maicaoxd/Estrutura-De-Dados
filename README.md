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

## [ExercicioPilha1](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/ExercicioPilha1)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=14DiL64nYCp3fmOKjFqlAmNO2hn2gPL0a&arquivo=ExerciciosAulaPilhasDinamicas.pdf)

### [Exercício 1](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha1/src/view/Exercicio01.java)

Fazer um teste de mesa do algoritmo abaixo, deixando explícito os valores de saída em console e a estrutura da pilha

    Pilha p = new Pilha();
    int[] vetor = {100, 200, 1, 50, 39, 44, 25, 16, 99, 45, 33, 18, 102, 92};
    int tamanhoVetor = vetor.length;
    Para (i = 0 ; i < tamanhoVetor ; i++) {
        Se (pilhaVazia() == verdadeiro) {
            p.push(vetor[i] - 10);
        } Senao Se (vetor[i] mod 5 == 0) {
            p.push(vetor[i] / 5);
        } Senao Se (vetor[i] mod 3 == 0) {
            p.push(vetor[i] * 3);
        } Senao {
            int v1 = p.pop();
            escreva (v1 / 2);
        }
    }

### [Exercício 3](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha1/src/view/Exercicio03.java)

Baseado na lógica do Exercício 2, criar uma aplicação Java, baseada na biblioteca de pilha de int, que faça:
1) Criar uma classe view (Principal.java) que, na main:
    - a. Peça ao usuário um valor inteiro de 0 a 10 (Caso o usuário digite um valor fora desses limites, pedir novamente, até que o valor atenda à solicitação);
2) Criar uma classe controller chamada FatController, que tenha um método fatorial(int valor): int e faça:
    - a. Inicialize uma pilha
    - b. Usando a pilha como suporte, calcule o fatorial do valor de entrada 
    - c. O método deve retornar esse valor 
3) O método main da classe Principal.java deve chamar o método fatorial(int valor): long e exibir em console o valor do fatorial.

O método fatorial(int valor): long deve estar baseado nas operações da pilha de inteiros (push(), pop(), size(), top(), isEmpty())

## [ExercicioPilha2](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/ExercicioPilha2)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1EzVw7a07L1lyTCv0iRfoRdaH6-1aWk0P&arquivo=04-PilhasDinamicas.pdf)

### [Exercício 1. a](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha2/src/view/Exercicio0101.java)

Simular o comportamento de pilhas dinâmicas para os algoritmos abaixo ( A simulação deve deixar evidente a pilha que sobrou na memória):

a)
    
    Para (i = 0 ; i < 10 ; i++) {
        Se (i % 2 == 0) {
            Push(i * i);
        } Senão {
            Se (i <= 5) {
                Push(i);
            } Senão {
                Pop();
            }
        }
        Top();
    }
    Size();

### [Exercício 1. b](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha2/src/view/Exercicio0102.java)

Simular o comportamento de pilhas dinâmicas para os algoritmos abaixo ( A simulação deve deixar evidente a pilha que sobrou na memória):

b)

    Para (i = 100 ; i < 115 ; i++) {
        Se (isEmpty()) {
            Push(i + 100);
        } Senão {
            Se (Size() <= 4) {
                Push(i + 50);
            } Senão {
                Pop();
            }
        }
        Top();
    }
    Size();

### [Exercício 3](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha2/src/view/Exercicio03.java)

Implementar um novo projeto Java com base biblioteca PilhaInt que permita a conversão de decimais para binários, a qual se dá dividindo, sucessivamente, o valor de entrada por 2 e concatenando os restos da divisão do último para o primeiro.

O projeto deve ter uma classe ConverteController no package controller, que inicialize uma pilha de inteiros e com um método decToBin(int decimal): String, que, recebendo um número decimal e realizando as operações, irá inserindo os restos das divisões na pilha. Ao término do empilhamento, deverá ser feita a operação de desempilhar, concatenando cada número desempilhado (Convertendo para String) com o próximo, até a pilha esvaziar.

Deve-se ter também uma classe Principal no package view que permita ao usuário inserir um número decimal limitado a 1000.

## [ExercicioPilha3](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/ExercicioPilha3)

### [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1FBbk5qjFDMhNx0cOkeLIcQbOBDEtOdrz&arquivo=05-ExerciciosPilhasDinamicas.pdf)

### [Exercício 2](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha3/src/view/Exercicio02.java)

Considere o vetor a seguir:
    
    0 5 7 -4 3 5 -2 -1 10 4 3 -6 2 -9 1 -5
Fazer um algoritmo, em Java, utilizando a biblioteca PilhaInt, inicializar uma pilha de inteiros e resolva conforme as condições:
- O vetor deve ser percorrido do primeiro ao último elemento
- Caso seja um número positivo ou 0, fazer o push do valor
- Caso seja um número negativo, fazer o pop de 2 valores, somá-los, fazer o push  do número negativo e o push do resultado da soma 
- Ao término do vetor, apresentar a quantidade de valores presentes na pilha

### [Exercício 3](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha3/src/view/Exercicio03.java)

Considere a pilha abaixo, já formada. 

    J
    G
    R
    B
    H
    L
    W
Demonstrando em código ou teste de mesa, criar uma sequência de operações de pilha que dê a seguinte saída:

Console:
    
    R W
Pilha Final:
    
    K
    G
    M
    B
    L

### [Exercício 4](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha3/src/view/Exercicio04.java)

Implementar um novo projeto Java com a biblioteca PilhaInt.

Esse projeto deve implementar uma solução para uma calculadora em Notação  Polonesa Reversa (NPR), também conhecida como posfixa. Calculadoras HP, como a 48G ou a 12C utilizam esse formato de cálculo, em detrimento da maneira algébrica (infixa).

A lógica da NPR se dá como a seguir:

- Notação Polonesa Reversa: 
- (O vídeo [https://www.youtube.com/watch?v=-b-f9-9_xAI](https://www.youtube.com/watch?v=-b-f9-9_xAI) mostra a HP 50G em operações infixa e posfixa)
    - Enquanto for digitado número, ele será empilhado.
    - Quando for digitada uma operação (+,-,*,/), 2 valores devem ser desempilhados, se faz a operação com eles e o resultado retorna à pilha
    - É importante verificar que a pilha deve ter, no mínimo 2 valores para fazer a operação

O projeto deve ter uma classe de controle (NPRController) que inicializa uma nova Pilha e deve ter duas operações:
- Operação insereValor(Pilha p, int valor):void, faz um push() na pilha
- Operação npr(Pilha p, String op):int. O método deve verificar se a String se trata de uma operação (+,-,*,/), verifica se é possível fazer 2 pop() e, em sendo possível, fazer os 2 pop(), fazer a operação, gravar em uma variável resultado (que é o retorno da operação) e fazer o push() do resultado.
    - Para operações de subtração e divisão (que a ordem importa), fazer o valor do 2º pop() operação valor do 1º pop(), ou seja o valor mais antigo à esquerda da operação
    - Se não houverem 2 valores, deve-se lançar um Exception de pilha com valores insuficientes

A classe view Principal, deve inicializar a pilha e solicitar dados (número ou operação) ao usuário até alguma condição de encerramento, definido por você.

### [Exercício 5](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha3/src/view/Exercicio05.java)

Considerando a biblioteca PilhaString, já criada, faça:

Criar um projeto Java (Palindromos) e importe a biblioteca PilhaStrings. Esse novo projeto irá receber uma cadeia de Strings do usuário e demonstrar para ele se essa palavra se trata ou não de um Palíndromo.

Palíndromo é uma cadeia de caracteres que se lê da direita para a esquerda e da esquerda para a direita e a sequência de caracteres é a mesma, como em arara, ovo, subinoonibus, por exemplo.

A classe PalindromoController no package controller deve ter 2 métodos:
- O método invertePalavra que recebe um String e retorna o String invertido. Os 
métodos push(), pop(), isEmpty() devem ser usados para esse fim;
- O método comparaPalavras, que recebe o String, o String já invertido e retorna 
um boolean (True para Palíndromo e False para Não Palíndromo)

A classe Principal, no package view, no seu método Main, deve inicializar uma pilha e exibir a possibilidade de o usuário inserir uma cadeia de Strings e retornar a ele se é ou não um palíndromo. Todos os métodos devem receber a pilha criada no método Main como parâmetro.

Dica: Para inverter, pode-se usar os métodos substring ou charAt

### [Exercício 6](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha3/src/view/Exercicio06.java)

Considerando a biblioteca PilhaString, já criada, faça:

Criar um projeto Java (HistoricoSim) e importe a biblioteca PilhaStrings. Esse novo projeto simulará uma função presente nos navegadores Web, a função de histórico.

A função de histórico empilha os endereços de sites acessados.

A classe Principal, no package view, deve ter na Main, a criação de uma Pilha denominada histórico e deve dar ao usuário a possibilidade de inserir um novo endereço no histórico, remover o último endereço da pilha, saber qual foi o último endereço visitado. Um menu deve ser criado.

A classe HistoricoController deve ter os métodos de validação das operações oferecidas na Main da Classe Principal. Todos os métodos devem receber a pilha criada no método Main como parâmetro.
- O método de inserir um novo endereço, deve-se verificar antes, se o endereço é válido, um endereço válido começa com http:// e, na sequência, deve ter algo no formato www.endereço.com (podendo ser, .com, .co.uk, .com.br, etc.). Não 
serão aceitos sites sem www;
- O método de remover o último endereço deve dar um erro se o histórico estiver 
vazio ou desempilhar o último endereço;
- O método de consultar o último endereço, deve dar um erro se o histórico estiver 
vazio ou apresentar o último endereço, sem removê-lo.

## [AlgoritmosFila](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/ExercicioPilha3)

### [PDF](http://www.leandrocolevati.com.br/downloadmateriais?idFile=1FEDAE4tyO14cmilJrcTIr2IMuXl0NaDO&arquivo=06-FilasDinamicas.pdf)

### [Exercício 2](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha3/src/view/Exercicio02.java)