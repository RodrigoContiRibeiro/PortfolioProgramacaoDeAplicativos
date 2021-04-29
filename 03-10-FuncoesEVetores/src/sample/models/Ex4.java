package sample.models;

import java.util.Arrays;

public class Ex4 {
    //Passando arrays para a função
    public void somArr(int[] arr1, int[] arr2) {
        //Criando array
        int[] arr3 = new int[5];
        //Iteração que somará os elementos dos arrays passados em um novo array
        for (int i = 0; i < 5; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }
        //Chamando o método para imprimir os elementos dos arrays
        toString(arr1);
        toString(arr2);
        toString(arr3);
    }
    //Método que printa todos os elemento de um array
    public void toString(int[] arr) {
        for (int i = 0; i < 5;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
