package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetorA = new int[5];
        int [] vetorB = new int [vetorA.length];
        double[] vetorC = new double[vetorA.length];

        System.out.println("valores vetor A:");
        for (int i = 0; i< vetorA.length; i++){
            System.out.print(" ,");
            vetorA[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("valores vetor B:" );
        for (int i=0 ; i< vetorA.length;i++){

            vetorB[i] = scan.nextInt();
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        System.out.println();
        System.out.println("vetorA");
        for (int i =0; i< vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        System.out.println("vetorB");
        for (int i =0; i< vetorA.length; i++){
            System.out.print(vetorB[i]+" ");
        }
        System.out.println();
        System.out.println("vetorC");
        for (int i =0; i< vetorA.length; i++){
            System.out.print(vetorC[i]+" ");
        }
    }
}
