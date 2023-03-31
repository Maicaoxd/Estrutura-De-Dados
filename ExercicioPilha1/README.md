# [ExercicioPilha1](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/ExercicioPilha1)

## [PDF](https://leandrocolevati.com.br/downloadmateriais?idFile=14DiL64nYCp3fmOKjFqlAmNO2hn2gPL0a&arquivo=ExerciciosAulaPilhasDinamicas.pdf)

## [Exercício 1](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha1/src/view/Exercicio01.java)

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

## [Exercício 3](https://github.com/Maicaoxd/Estrutura-De-Dados/blob/main/ExercicioPilha1/src/view/Exercicio03.java)

Baseado na lógica do Exercício 2, criar uma aplicação Java, baseada na biblioteca de pilha de int, que faça:
1) Criar uma classe view (Principal.java) que, na main:
    - a. Peça ao usuário um valor inteiro de 0 a 10 (Caso o usuário digite um valor fora desses limites, pedir novamente, até que o valor atenda à solicitação);
2) Criar uma classe controller chamada FatController, que tenha um método fatorial(int valor): int e faça:
    - a. Inicialize uma pilha
    - b. Usando a pilha como suporte, calcule o fatorial do valor de entrada 
    - c. O método deve retornar esse valor 
3) O método main da classe Principal.java deve chamar o método fatorial(int valor): long e exibir em console o valor do fatorial.

O método fatorial(int valor): long deve estar baseado nas operações da pilha de inteiros (push(), pop(), size(), top(), isEmpty())

