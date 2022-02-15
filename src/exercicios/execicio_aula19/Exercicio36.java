package exercicios.execicio_aula19;

import java.util.Scanner;

//
public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[11];

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = Math.pow(2, i);
            //vetorB[i]=vetorA[i]+(vetorA[i]+i;
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();


    }
}
