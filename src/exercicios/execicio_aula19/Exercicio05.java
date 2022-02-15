package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        //o for vai percorrer o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com o valor da posicao");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
        }
        System.out.println("vetor A");
        //o for vai percorrer o vetorA para aparecer
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        System.out.println("vetor B");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i]+" ");
        }



    }
}
