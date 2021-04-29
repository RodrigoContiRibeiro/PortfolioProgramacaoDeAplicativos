package sample.model;

import java.util.Date;

public final class UsedProduct extends Product {
    //Filho de Product
    //Atributos
    private String manufactureDate;
    //COnstrutor sobrecarregado e usando os valores do pai
    public UsedProduct(String name, double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //Getter & Setters
    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //ToString sobrescrito
    @Override
    public String toString() {
        return "Produto Usado" +
                "\nNome: " + super.getName() +
                "\nPreço: R$" + super.getPrice() +
                "\nData de Fabricação: " + manufactureDate;
    }
}
