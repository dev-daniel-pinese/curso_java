package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        //o for vai percorrer o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com o valor da posicao " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = (int) Math.sqrt(vetorA[i]);
        }
        System.out.println("vetor a");
        //o for vai percorrer o vetorA para aparecer
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("vetor b");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
