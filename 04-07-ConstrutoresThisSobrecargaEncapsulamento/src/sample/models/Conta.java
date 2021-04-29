package sample.models;

public class Conta {
    //Atributos
    private String nome;
    private String conta;
    private double saldo;
    //Construtor sobrecarregado
    public Conta(String nome, String conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public Conta(String nome, String conta) {
        this.nome = nome;
        this.conta = conta;
    }
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //ToString Sobrecarregado
    @Override
    public String toString() {
        return "Dados da Conta" +
                "Conta: " + conta + ", " +
                "Titular: " + this.nome + ", " +
                "Saldo: R$" + saldo;
    }
}
