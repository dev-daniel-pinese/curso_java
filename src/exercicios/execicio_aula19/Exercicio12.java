package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int cont = 0;
        //o for vai percorrer o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com o numero");
            vetorA[i] = scan.nextInt();
            //vai somar os valores
            cont += vetorA[i];
        }

        System.out.println("a soma é " + cont);

    }
}
