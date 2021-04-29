package sample;

import sample.models.Pessoa;

import java.util.ArrayList;
import java.util.Collections;

public class PessoaMain {
    public static void main(String[] args) {
        //ArrayList para Pessoa's
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        //Criando e adicionando Pessoa's ao array
        Pessoa p1 = new Pessoa("Rodrigo", 20);
        Pessoa p2 = new Pessoa("Claudio", 17);
        pessoas.add(p1);
        pessoas.add(p2);

        //ArrayList para armazenar as idades, depois será usado
        //para determinar a pessoa mais velha
        ArrayList<Integer> idades = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
            idades.add(pessoa.getIdade());
            //Percorre o ArrayList de funcionario, printando os retornos do toString()
            //Adiciona a idade de cada Pessoa ao ArrayList
        }
        Collections.sort(idades);//Ordenou o ArrayList, maior na última posição e vice-versa
        Integer maior = idades.get(idades.size() - 1);//Armazenando o maior número
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade().equals(maior)) {
                System.out.println(pessoa.getNome() + " é a pessoa mais velha!");
            }
            //Percorre o ArrayList para descobrir qual a pessoa com a maior idade e
            // printar o nome desse objeto Pessoa específico.
        }

    }
}
