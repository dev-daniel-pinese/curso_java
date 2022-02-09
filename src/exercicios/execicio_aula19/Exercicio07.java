package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i =0; i< vetorA.length; i++){
            System.out.println("entre com a posicao");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        System.out.println();
        System.out.println("vator A");
        for (int i = 0; i< vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
        System.out.println();
        System.out.println("vator B");
        for (int i = 0; i< vetorA.length; i++){
            System.out.println(vetorB[i]);
        }
        System.out.println();
        System.out.println("vator C");
        for (int i = 0; i< vetorA.length; i++){
            System.out.println(vetorC[i]);
        }
    }
}
