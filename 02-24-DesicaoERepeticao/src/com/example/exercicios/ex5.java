package com.example.exercicios;

public class ex5 {
    public static void main(String[] args) {
        //Inicializando as variáveis para as somas das sequencias
        int seq1 = 0, seq2 = 0;

        //Iteração para as sequencias
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                seq1 += 5;
                System.out.println("Seq1 " + seq1);
            } else {
                seq2 -= 10;
                System.out.println("IMPÁR " + seq2);
            }
        }
        //Saída das somas das sequencias
        System.out.println(seq1 + seq2);
    }
}

