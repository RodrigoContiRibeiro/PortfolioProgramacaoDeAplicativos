package sample.models;

import java.util.ArrayList;
import java.util.Random;

public class Ex7 {
    public void prova() {
        //Acessar números randômicos
        Random rnd = new Random();
        //Lista de Caracteres
        ArrayList<Character> G = new ArrayList<Character>();
        //Populando aleatóriamente o gabarito com os caracteres "abcde"
        for (int i = 0; i < 10; i++) {
            String chars = "abcde";
            char caractere = chars.charAt(rnd.nextInt(chars.length()));
            G.add(caractere);
        }
        //Printando as alternativas sorteadas do gabarito
        System.out.println(G);
        //Populando aleatóriamente a folha de respostas com os caracteres "abcde"
        ArrayList<Character> R = new ArrayList<Character>();
        for (int i = 0; i < 10; i++) {
            String chars = "abcde";
            char caractere = chars.charAt(rnd.nextInt(chars.length()));
            R.add(caractere);
        }
        //Printando as respostas
        System.out.println(R);
        //Criando listas para armazenar quais questões foram acertadas ou erradas pelo aluno
        ArrayList<Integer> questoesErradas = new ArrayList<Integer>();
        ArrayList<Integer> questoesCertas = new ArrayList<Integer>();
        //Inicilizando contagens de erros e acertos
        int acertos = 0;
        int erros = 0;
        //Verificando se as repostas estão corretas ou erradas, incrementando a contagem respectiva e adicionando o número da questão 
        // à respectiva lista
        for (int i = 0; i < 10; i++) {
            if (G.get(i).equals(R.get(i))) {
                questoesCertas.add(i + 1);
                acertos++;
            } else {
                questoesErradas.add(i + 1);
                erros++;
            }
        }
        //Printando a quantidade de acertos e erros, e quais questão estavam erradas e certas
        System.out.println("Acertos: " + acertos + " | Questões: " + questoesCertas.toString());
        System.out.println("Erros: " + erros + " | Questões: " + questoesErradas.toString());
        //Verificando se o aluno foi aprovado
        int nota = acertos;
        if (nota >= 6) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }
}
