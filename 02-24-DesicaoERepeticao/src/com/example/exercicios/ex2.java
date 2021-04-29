package com.example.exercicios;

public class ex2 {
    public static void main(String[] args) {
        //Passando uma idade
        int age = 10;

        //Com base na idade verifcando a qual categoria ela pertence
        if (age >= 18) {
            System.out.println("Nadador Adulto");
        } else if(age >= 14){
            System.out.println("Nadador Juvenil");
        } else if(age >= 11){
            System.out.println("Nadador Infanto Juvenil");
        } else if(age >= 10){
            System.out.println("Nadador Infantil");
        }
    }
}
