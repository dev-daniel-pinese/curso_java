package exercicios.execicio_aula19;

import java.util.Scanner;

//6.Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
//um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
//regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi;
//b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1
//quando Ai for menor que Bi.
public class Exercicio26{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        //o for vai percorrer o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vator A " + i);
            vetorA[i] = scan.nextInt();
            System.out.println("vator b " + i);
            vetorB[i] = scan.nextInt();
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else if (vetorA[i] < vetorB[i]) {
                vetorC[i] = -1;
            }
            System.out.println(vetorC[i] + " ");
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorC[i] + " ");
        }
    }
}
