package sample;

import sample.models.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Armazenando as entradas do usuário
        Scanner s = new Scanner(System.in);
        System.out.println("Entre o número da conta:");
        String numConta = s.next();
        System.out.println("Entre o titular da conta:");
        String nomeConta = s.next();
        System.out.println("Haverá depósito inicial:");
        String isInitialDeposity = s.next().toLowerCase();
        int deposity = 0;
        if (isInitialDeposity.equals("s")) {
            System.out.println("Entre o valor do depósito inicial(s/n):");
            int initialDeposity = s.nextInt();
            deposity += initialDeposity;
        }
        //Criando uma instância com as entradas
        Conta conta = new Conta(nomeConta, numConta, deposity);
        //Imprimindo o objeto
        System.out.println(conta.toString());
    }
}
