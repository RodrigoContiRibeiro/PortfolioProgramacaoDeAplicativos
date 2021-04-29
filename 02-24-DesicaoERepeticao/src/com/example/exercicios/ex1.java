package com.example.exercicios;

public class ex1 {
    public static void main(String[] args) {
        //Fazendo a média com os valores
        float nota1 = 2f;
        float nota2 = 7f;
        float exame = 2f;
        float media = (nota1 + nota2) / 2;
        float mediaExame = (media + exame) / 2;

        //Verificando se o aluno passou de ano
        if (media >= 6.0) {
            System.out.println(" "); // Para quebrar uma linha antes dos logs
            System.out.println("Você passou de ano direto :)");
            System.out.println("Nota: " + media);
        } else {
            if (mediaExame >= 6.0) {
                System.out.println(" "); // Para quebrar uma linha antes dos logs
                System.out.println("Você passou de ano por exame :/");
                System.out.println("Nota: " + mediaExame);
            } else {
                System.out.println(" "); // Para quebrar uma linha antes dos logs
                System.out.println("Você reprovou de ano :(");
                System.out.println("Nota: " + mediaExame);
            }
        }
    }
}
