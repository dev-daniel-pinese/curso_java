package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        //o for vai percorrer o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com o valor da posicao");
            vetorA[i] = scan.nextInt();
        }
        int somaMenor = 0;
        int somaMaior = 0;
        int qtdMaior = 0;
        int iqual = 0;
        for (int i = 0; i < vetorA.length; i++) {
            //o if vai ver se o vetorA na pisicao i é iqual a 15
            if (vetorA[i] == 15) {
                iqual++;
                //o else if vai ver se o vetorA na pisicao i é menor que 15
            } else if (vetorA[i] < 15) {
                somaMenor += vetorA[i];
            } else if (vetorA[i] > 15) {
                qtdMaior++;
                somaMaior += vetorA[i];
            }
        }
        System.out.println("vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("qtd numeros == 15: " + iqual);
        System.out.println("soma menor numeros < 15: " + somaMenor);
        System.out.println("media numeros > 15: " + somaMaior / qtdMaior);
    }
}
