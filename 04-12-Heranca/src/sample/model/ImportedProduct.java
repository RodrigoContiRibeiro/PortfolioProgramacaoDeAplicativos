package sample.model;

public final class ImportedProduct extends Product{
    //Filho de Product
    //Atributos
    private double customsFee;

    //Contrutor sobrecarregado e usando os valores do pai
    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
        setPrice(this.customsFee + this.getPrice());
    }

    public ImportedProduct(double customsFee) {
        this.customsFee = customsFee;
    }
    //Getter & Setter
    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
    //Sobrescrita do toString
    @Override
    public String toString() {
        return "Produto Importado" +
                "\nNome: " + super.getName() +
                "\nPreço: R$" + super.getPrice() +
                "\nTaxa Aduaneira: R$" + customsFee;
    }
}
