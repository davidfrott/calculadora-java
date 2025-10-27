# Calculadora Simples em Java

Este é um projeto de uma calculadora simples desenvolvido em Java como um exercício para praticar conceitos de Programação Orientada a Objetos (POO).

## Funcionalidades

A calculadora é capaz de realizar as quatro operações básicas:
* Soma (+)
* Subtração (-)
* Multiplicação (*)
* Divisão (/)

## Conceitos Aplicados

Este projeto foi refatorado para utilizar princípios fundamentais da POO:

* **Interface:** Foi definida uma interface `Operacao` que estabelece um contrato (um método `calcular()`) para todas as classes de operação.
* **Herança (de Interface):** As classes `Soma`, `Subtracao`, `Multiplicacao` e `Divisao` *implementam* a interface `Operacao`.
* **Polimorfismo:** A classe `Principal` utiliza uma variável do tipo `Operacao` para executar o cálculo correto em tempo de execução, sem precisar saber qual operação específica está sendo realizada.

## Como Executar

1.  Clone o repositório.
2.  Abra o projeto em sua IDE Java preferida (ex: IntelliJ IDEA).
3.  Execute a classe `Principal.java`.
4.  Siga as instruções no console para digitar os dois números e escolher a operação.