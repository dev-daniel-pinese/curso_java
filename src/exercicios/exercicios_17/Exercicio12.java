package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o numeropara gerar  a tabuada");
        int n= scan.nextInt();
        System.out.println("tabuada de "+ n +":");
        //o for vai percorrer o 10
        for (int i=1 ;i<=10;i++){
            System.out.println(n + " x "+ i +" = "+ (n*i));
        }
    }
}
