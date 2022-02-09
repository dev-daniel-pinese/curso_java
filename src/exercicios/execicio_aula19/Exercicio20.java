package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[5];
        double cotacao;

        System.out.println("entre com a cotacao do dolar:");
        cotacao = scan.nextDouble();
        //for para percorrer vetorA
        for (int i = 0; i < vetorA.length; i++) {
            //
            vetorA[i] = cotacao * (i + 1);

        }
        System.out.println("vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + "");
        }
        System.out.println();
    }
}
