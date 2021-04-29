package sample.models;

public class Pessoa {
    //Atributos
    private String nome;
    private Integer idade;
    //Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //To String
    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nIdade: " + idade + "\n";
    }
}
