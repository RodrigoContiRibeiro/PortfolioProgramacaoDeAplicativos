package sample.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex6 {
    //Instanciando a classe Random para acessar número aleatórios
    Random rnd = new Random();

    public void idade() {
        //Inicializando um vetor de número inteiros
        ArrayList<Integer> vet1 = new ArrayList<Integer>();
        //Populando o vetor com 10 valores inteiros de 0 até 120
        for (int i = 0; i < 10; i++) {
            int pos = rnd.nextInt(120);
            vet1.add(pos);
        }
        //Está sorteando entre 0 e 120, então peguei 121 para encontra o menor número
        int menor = 121;
        
        //Pegando o menor número do arr.
        for (int i = 0; i < vet1.size(); i++) if (vet1.get(i) < menor) menor = vet1.get(i);
        int qntd = 0;
        //Contando as repetições do menor número
        for (int i = 0; i < vet1.size(); i++) if (menor == vet1.get(i)) qntd++;

        System.out.println(vet1);
        System.out.println("Menor: " + menor);
        System.out.println("Quantidade: " + qntd);
        System.out.println(vet1.stream().count());
        System.out.println(vet1.size());
    }
}
