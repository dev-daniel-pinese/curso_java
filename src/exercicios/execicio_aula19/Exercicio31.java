package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetor A");
            vetorA[i] = scan.nextInt();
        }
        int posB = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;

            }
        }
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[posB] = vetorA[i];
                posB++;

            }
        }
        for (int i = 0; i < posB; i++) {
            System.out.println(vetorB[i] + " ");
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorB[i] + " ");
        }
    }
}
