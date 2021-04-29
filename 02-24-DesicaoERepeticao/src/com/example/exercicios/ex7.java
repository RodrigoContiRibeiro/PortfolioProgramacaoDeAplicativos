package com.example.exercicios;

public class ex7 {
    public static void main(String[] args) {
        //Variáveis inicializando as sequencias
        double seq1 = 2, seq2 = 1, soma = 0, aux, frac;
        //iterações para printar e mostrar as sequencias
        for (int i = 0; i < 10; i++, seq1 += 2, seq2++) {
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
        }
        System.out.println("Soma: " + soma);
    }
}
