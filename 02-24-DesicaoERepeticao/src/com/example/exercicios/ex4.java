package com.example.exercicios;

import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        //Criando as variáveis
        double porcentagem = 0, total = 0, diff = 0;

        //Gerando valor aleatório entre 1 e 1000
        double valor = (int) (Math.random() * ((1000 - 1) + 1)) + 1;

        //Gerar um caractere aleatório entre a string chars
        String chars = "abcd";
        Random rnd = new Random();
        char character = chars.charAt(rnd.nextInt(chars.length()));

        //Colocar em caixa alta para não ter problema na entrada de dados
        char classi = Character.toUpperCase(character);

        //Switch para os códigos
        switch (classi) {
            case 'A':
                porcentagem = -0.10;
                break;
            case 'B':
                porcentagem = -0.15;
                break;
            case 'C':
                porcentagem = -0.20;
                break;
            case 'D':
                porcentagem = 0.05;
                break;
        }

        total = (valor * porcentagem) + valor;//Aplicando o desconto ou acréscimo

        diff = total - valor;//Quando de diferença

        //Saídas
        System.out.println("Valor: R$" + valor);

        if(diff < 0){
            System.out.println("Desconto de " + (porcentagem*-100) + "%");
        } else {
            System.out.println("Acréscimo de " + (porcentagem*100) + " %");
        }

        System.out.println("Total de R$" + total);
    }
}
