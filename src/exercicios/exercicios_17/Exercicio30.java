package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o numeropara gerar  a tabuada");
        int n= scan.nextInt();
        int fim;
        int inicio;
        boolean ivalido = true;
        do {
            System.out.println("entre com o inio da tabuada");
           inicio = scan.nextInt();
            System.out.println("entre com o fim da tabuada");
             fim = scan.nextInt();
            if (fim > inicio) {
                ivalido = false;
                System.out.println("tabuada de " + n + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }

            }
        } while (!ivalido) ;
        System.out.println("tabuada de "+ n +":");
        System.out.println("comecar por "+ inicio +":");
        System.out.println("terminar em "+ fim  +":");

        for (int i = 1; i<= 10; i++){
            System.out.println(n + " x "+ i + "="+(n*i));
        }


    }
}
