package sample.models;

import java.util.ArrayList;
import java.util.Random;

public class Ex9 {
    public void diff() {
        //Acesso a randômicos
        Random rnd = new Random();
        //Inicializando os 3 vetores
        ArrayList<Integer> vet1 = new ArrayList<Integer>();
        ArrayList<Integer> vet2 = new ArrayList<Integer>();
        ArrayList<Integer> vet3 = new ArrayList<Integer>();
        //Populando os dois primeiros vetores com valores aletórios de entre 0 a 100 e
        // adicionando a diferença no terceiro vetor
        for (int i = 0; i < 5; i++) {
            int pos = rnd.nextInt(100);
            int pos2 = rnd.nextInt(100);
            vet1.add(pos);
            vet2.add(pos2);
            vet3.add(pos - pos2);
        }
        //Printando os vetores
        System.out.println(vet1);
        System.out.println(vet2);
        System.out.println(vet3);
    }
}
