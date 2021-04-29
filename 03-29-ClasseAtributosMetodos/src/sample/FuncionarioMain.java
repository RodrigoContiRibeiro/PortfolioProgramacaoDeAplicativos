package sample;

import sample.models.Funcionario;

import java.util.ArrayList;

public class FuncionarioMain {
    public static void main(String[] args) {
        //ArrayList para armazenar Funcionario's
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        //Criando e adicionando Funcionario's ao ArrayList
        Funcionario f1 = new Funcionario("Rodrigo", 10000);
        Funcionario f2 = new Funcionario("Claudio", 5000);
        funcionarios.add(f1);
        funcionarios.add(f2);

        //Descobrindo o salário total de todos os Funcionario's
        // percorrendo o ArrayList deles
        double total = 0;
        for(Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
            total += funcionario.getSalario();
        }
        //Calculando a média com o total e a quantidade de Funcionario's(tamanho do ArrayList)
        double media = total / funcionarios.size();
        //Printa a média
        System.out.println("Média Salarial: R$" + media);

    }
}
