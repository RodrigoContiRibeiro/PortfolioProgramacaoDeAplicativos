package sample.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex8 {
    public void imparParArr() {
        //Acessando valores randômicos
        Random rnd = new Random();
        //Inicializando os dois vetores
        ArrayList<Integer> vet = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        //Sorteando valores inteiros de 0 a 120 e adicionando ele a primeira lista, mas
        // se esse valor for par ele também será adicionado ao outro vetor
        for (int i = 0; i < 10; i++) {
            int pos = rnd.nextInt(100);
            vet.add(pos);
            if (i % 2 == 0) par.add(pos);
        }
        //Printando os vetores
        System.out.println(vet);
        System.out.println(par);
        //Inicializando um vetor para armazenar a soma dos dois últimos
        ArrayList<Integer> sum = new ArrayList<Integer>();
        //Iterando os vetores e somando
        for (int i = 0; i < par.size(); i++) {
            sum.add(vet.get(i) + par.get(i));
        }
        //Saída da soma
        System.out.println(sum);
    }
}
