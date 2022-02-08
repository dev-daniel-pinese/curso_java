package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]vetorA = new int[8];
        int[]vetorb = new int[vetorA.length];

        for (int i = 0 ; i< vetorA.length; i++){
            System.out.println("entre com o valor da posicao: "+i);
            vetorA[i] = scan.nextInt();
            vetorb[i] = (vetorA[i]*2);

        }
        for(int i=0; i< vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        for(int i=0; i< vetorA.length;i++){
            System.out.print(vetorb[i]+" ");
        }

    }
}
