package sample.models;

public class Ex3 {
    //Chamando o método intervalos com valores diferentes
    public void intervalo1() {
        intervalos(1, 100);
        intervalo2();
    }

    public void intervalo2() {
        intervalos(101, 200);
        intervalo3();
    }

    public void intervalo3() {
        intervalos(201, 300);
    }

    //Método que printa todos os números de um dado intervalo
    public void intervalos(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }
}
