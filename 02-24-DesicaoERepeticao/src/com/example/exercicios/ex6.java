package com.example.exercicios;

public class ex6 {
    public static void main(String[] args) {
        //Variáveis inicializando as sequencias
        double seq1 = 480, seq2 = 10, soma = 0, aux, frac;
        //iterações para printar e mostrar as sequencias
        for (int i = 0; i < 30; i++, seq1 -= 5, seq2++) {
            System.out.println("Posição: " + (i+1));
            if (i % 2 == 1) {
                aux = seq1 * -1;
                System.out.println("Número: " + aux + "/" + seq2);
                frac = aux / seq2;
            } else {
                System.out.println("Número: " + seq1 + "/" + seq2);
                frac = seq1 / seq2;
            }

            System.out.println("Razão: " + frac);
            //Somando as frações
            soma += frac;
            System.out.println("Soma: " + soma);
        }
    }
}
