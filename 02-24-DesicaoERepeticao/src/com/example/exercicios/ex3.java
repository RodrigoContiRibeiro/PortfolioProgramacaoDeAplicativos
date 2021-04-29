package com.example.exercicios;

public class ex3 {
    public static void main(String[] args) {
        int qtnd = (int) (Math.random() * ((20 - 1) + 1)) + 1; //Número inteiro aleatório entre 1 e 20 para a quantidade
        int cod = (int) (Math.random() * ((5 - 1) + 1)) + 1; //Número inteiro aleatório entre 1 e 5 para um dos códigos
        double preco = 0;

        System.out.println("Quantidade: " + qtnd);
        System.out.println("Código: " + cod);
        System.out.println(" ");//Quebra de linha

        //Descobrir qual a comida a partir do código e atribuir um valor para o preco
        if (cod == 1) {
            System.out.println("Você comprou " + qtnd + " Cachorro(s) Quente(s)");
            preco = 4.00;
        } else if (cod == 2) {
            System.out.println("Você comprou " + qtnd + " X(s)-Salada(s)");
            preco = 4.50;
        } else if (cod == 3) {
            System.out.println("Você comprou " + qtnd + " X(s)-Bacon(s)");
            preco = 5.00;
        } else if (cod == 4) {
            System.out.println("Você comprou " + qtnd + " Torrada(s) Simples");
            preco = 2.00;
        } else if (cod == 5) {
            System.out.println("Você comprou " + qtnd + " Refrigerante(s)");
            preco = 1.50;
        }
        //Calcular o preço total baseado na qtnd e no preco
        double precoTotal = preco * qtnd;

        System.out.println(" ");//Quebra de linha
        System.out.println("Valor a pagar: R$" + precoTotal);
    }
}
