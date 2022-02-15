package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        //o for vai percorrer o vetorA
        for (int i =0; i< vetorA.length; i++){
            System.out.println("entre com o valor da posiçao: "+ i);
            vetorA[i]= scan.nextInt();

            vetorB[i] = vetorA[i];
        }


            System.out.println("vetor A = ");
        //o for vai percorrer o vetorA para aparecer
            for (int i=0; i< vetorA.length; i++) {
                System.out.println(vetorA[i] + "");
            }

                System.out.println("vetor B = ");
                for (int i=0; i< vetorB.length; i++){
                    System.out.println(vetorB[i]+ "");
        }
        System.out.println();
    }
}
