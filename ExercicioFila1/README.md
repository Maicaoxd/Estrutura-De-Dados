# [ExercícioFila1](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/ExercicioFila1)

## [PDF](http://www.leandrocolevati.com.br/downloadmateriais?idFile=1FEDAE4tyO14cmilJrcTIr2IMuXl0NaDO&arquivo=06-FilasDinamicas.pdf)

## [Exercício 4](https://github.com/Maicaoxd/Estrutura-De-Dados/tree/main/ExercicioFila1/src)

Considerando a biblioteca FilaObject, já criada, faça:

Criar um projeto Java (ChamadoSim) e importe a biblioteca. Esse novo projeto simulará uma necessidade de muitas empresas e instituições que atendem clientes, que é criar um canal de geração de senhas para pessoas com alguma prioridade e pessoas que não tem nenhuma prioridade.

A classe Principal, no package view, deve ter na Main, a criação de 2 filas, a fila e a filaPrioritarios, a inicialização das senhas dos prioritários e dos não prioritários e, por fim, deve dar ao usuário a possibilidade de inserir uma nova senha na fila, uma nova senha na fila de prioritários ou chamar uma pessoa para o atendimento. Um menu deve ser criado.

A classe FilaController deve ter os métodos de validação das operações oferecidas na Main da Classe Principal. Todos os métodos devem receber a fila criada no método Main como parâmetro.
    
    • O método de inserir um novo elemento na fila;
    • O método de remover o primeiro elemento da fila, que será atendido. A fila não pode estar vazia;
    • O método de chamado que deve seguir a seguinte regra: 
        • Fazer 3 chamadas prioritárias para 1 da fila não prioritária
        • Se não houver prioritários, já se deve chamar dos não prioritários
        • Se não houver ninguém nas 2 filas, deve-se gerar um aviso
