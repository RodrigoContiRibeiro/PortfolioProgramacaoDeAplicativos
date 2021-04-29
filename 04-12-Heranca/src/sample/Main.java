package sample;

import sample.model.ImportedProduct;
import sample.model.Product;
import sample.model.UsedProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando uma lsita para os objeos de Produto
        ArrayList<Product> produtos = new ArrayList<>();
        //Instancia de Scanner para entradas
        Scanner s = new Scanner(System.in);
        System.out.print("Insira o número de produtos:");
        int n = s.nextInt();
        //Interando o número de vezes que o usuário entrar
        for (int i = 0; i < n; i++) {
            //Armazenando as entradas do usuário
            System.out.print("Comum, Usado ou Importado (C / U / I): ");
            s.nextLine();//Gambiarra para funcionar os scanners https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
            String tipo = s.nextLine();
            System.out.print("Nome do Produto: ");
            String nome = s.nextLine();
            System.out.print("Preço do Produto: ");
            int preco = s.nextInt();
            //Vericiando o tipo do produto e instanciando a classe correta e se necessário pedir mais entradas e
            // adicionando as instancias à lista
            switch (tipo.toLowerCase()) {
                case "c":
                    Product p = new Product(nome, preco);
                    produtos.add(p);
                    break;
                case "u":
                    System.out.print("Data de Fabricação (dd/mm/aaaa): ");
                    s.nextLine();//Gambiarra para funcionar os scanners https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
                    String date = s.nextLine();
                    UsedProduct uP = new UsedProduct(nome, preco, date);
                    produtos.add(uP);
                    break;
                case "i":
                    System.out.print("Taxa Aduaneira: ");
                    s.nextLine();//Gambiarra para funcionar os scanners https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
                    double taxa = s.nextInt();
                    ImportedProduct iP = new ImportedProduct(nome, preco, taxa);
                    produtos.add(iP);
                    break;
            }
        }
        //PRintando os produtos da lista
        for (Product prod : produtos) {
            System.out.println("O produto " + prod.getName() + " custou " + prod.getPrice());
        }
    }
}
