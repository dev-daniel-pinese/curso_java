package exercicios.execicio_aula19;

import java.util.Scanner;

//Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
//que nos vetor B e C serão armazenados o valores pares e ímpares de
//A, respectivamente.
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetor A");
            vetorA[i] = scan.nextInt();
        }
        int posB = 0;
        int posC = 1;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            } else {
                vetorB[posC] = vetorA[i];
                posC++;
            }
        }
        for (int i = 0; i < posB; i++) {
            System.out.println(vetorB[i] + " ");
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorB[i] + " ");
        }
        for (int i = 0; i < posC; i++) {
            System.out.println(vetorC[i] + " ");
        }
    }
}
