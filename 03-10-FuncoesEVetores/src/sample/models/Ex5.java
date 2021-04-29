package sample.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public void invertArray() {
        //Instanciando Scanner para receber entradas
        Scanner input = new Scanner(System.in);
        //Criando dois vetores de inteiros
        ArrayList<Integer> vet1 = new ArrayList<Integer>();
        ArrayList<Integer> vet2 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++)vet2.add(0);//Se não preencher o array não é possível settar.
        //Criando um array com números aleatórios e adicionando os mesmos elementos de forma inversa em outro array
        for (int i = 0, j = 4; i < 5; i++, j--) {
            System.out.println((i + 1) + "º Posição: ");
            int pos = input.nextInt();
            vet1.add(pos);
            vet2.set(j, vet1.get(i));
        }
        //Chamando o método que printa todos elementos
        toString(vet1);
        toString(vet2);
    }
    //Método para printar todos os elementos de um vetor
    public void toString(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " | ");
        }
        System.out.println("");
    }
}
