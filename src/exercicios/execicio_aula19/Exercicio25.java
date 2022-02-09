package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        // vai percorre o vetor A
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com um numero para a posicao " + i);
            vetorA[i] = scan.nextInt();
            //operador ternario
            //(vetorA[i] % 2 == 0) ?  se sim recebe 1 : se não recebe 0
            //if (vetorA[i] % 2 == 0) {
            //    vetorB[i] = 1;
            //else {
            //    vetorB[i] = 0;}
            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
        }
        System.out.println("vetor A");
        //vai percorre o vetor a
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("vetor B");
        //vai percorre o vetor a
        for (int i=0; i< vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");

        }
    }
}
