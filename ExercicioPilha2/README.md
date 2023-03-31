# [ExercicioPilha2](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/ExercicioPilha2)

## [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=1EzVw7a07L1lyTCv0iRfoRdaH6-1aWk0P&arquivo=04-PilhasDinamicas.pdf)

## [Exercício 1. a](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha2/src/view/Exercicio0101.java)

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

## [Exercício 1. b](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha2/src/view/Exercicio0102.java)

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

## [Exercício 3](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha2/src/view/Exercicio03.java)

Implementar um novo projeto Java com base biblioteca PilhaInt que permita a conversão de decimais para binários, a qual se dá dividindo, sucessivamente, o valor de entrada por 2 e concatenando os restos da divisão do último para o primeiro.

O projeto deve ter uma classe ConverteController no package controller, que inicialize uma pilha de inteiros e com um método decToBin(int decimal): String, que, recebendo um número decimal e realizando as operações, irá inserindo os restos das divisões na pilha. Ao término do empilhamento, deverá ser feita a operação de desempilhar, concatenando cada número desempilhado (Convertendo para String) com o próximo, até a pilha esvaziar.

Deve-se ter também uma classe Principal no package view que permita ao usuário inserir um número decimal limitado a 1000.