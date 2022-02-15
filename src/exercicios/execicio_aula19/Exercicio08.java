package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        //o for vai percorrer o vetorA
        for (int i =0 ; i< vetorA.length;i++){
            System.out.println("entre com o valor da posiçao");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
            vetorC[i] = vetorA[i] * vetorB[i];
        }
        System.out.println();
        System.out.println("vetorA");
        //o for vai percorrer o vetorA para aparecer
        for (int i =0; i< vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
        System.out.println();
        System.out.println("vetorB");
        for (int i =0; i< vetorA.length; i++){
            System.out.println(vetorB[i]);
        }
        System.out.println();
        System.out.println("vetorC");
        for (int i =0; i< vetorA.length; i++){
            System.out.println(vetorC[i]);
        }
    }
}
