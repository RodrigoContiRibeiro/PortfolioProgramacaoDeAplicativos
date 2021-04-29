package sample.model;

public class Product {
    //Possui dois filhos
    //Atributos
    private String name;
    private double price;
    
    //Sobrecarregando o construtor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }
    //Método para retornar o atributo preco como string
    public String priceTag() {
        return this.price + "";
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //Sobrescrevendo o toString
    @Override
    public String toString() {
        return "Produto" +
                "\nNome: " + name +
                "\nPreço: R$" + price;
    }
}
