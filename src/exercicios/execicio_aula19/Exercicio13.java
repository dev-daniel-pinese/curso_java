package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int cont = 0;
        //for para percorrer vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com o numero");
            //vetorA na posicao i recebe teclado
            vetorA[i] = scan.nextInt();
            //se o vetor A posicao i for divisivel por 5
            if (vetorA[i] % 5 == 0) {
                //vai somar os valores de par
                cont += vetorA[i];
            }

        }

        System.out.println("a soma é " + cont);
    }
}
