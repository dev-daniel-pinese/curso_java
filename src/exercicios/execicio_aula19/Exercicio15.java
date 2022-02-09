package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int contidadeImpares = 0;
        int somaDosImpares = 0;
        int contidadePares = 0;
        int somaDospares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com o valor da posicao");
            vetorA[i] = scan.nextInt();
            //se vetorA na posicao i for impar
            if (vetorA[i] % 2 != 0) {
                //cont vai conyar a quantidade de impares
                contidadeImpares++;
                //soma vai somar o valor de todos os impares
                somaDosImpares += vetorA[i];

            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            //se vetorA na posicao i for impar
            if (vetorA[i] % 2 == 0) {
                //cont vai contar a quantidade de pares
                contidadePares++;
                //soma vai somar o valor de todos os pares
                somaDospares += vetorA[i];

            }
        }
        System.out.println("o numero impares é " + contidadeImpares);
        System.out.println(" a soma dos impares é: " + somaDosImpares);
        System.out.println("o numero pares é " + contidadePares);
        System.out.println("a soma de pares é " + somaDospares);
    }
}
