package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        //o for vai percorrer o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com a idade da pessoa");
            vetorA[i] = scan.nextInt();

        }
        int menor = vetorA[0];
        int indexMenor = 0;
        int maior = vetorA[0];
        int indexMaior = 0;
        //for para percorrer o vetor
        for (int i = 1; i < vetorA.length; i++) {
            //se posicao for maior que maior
            if (vetorA[i] > maior) {

                maior = vetorA[i];

                indexMaior = i;

            } else if (vetorA[i] < menor) {

                menor = vetorA[i];

                indexMenor = i;

            }
        }
        System.out.println("vetor de idades");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("menor idade :" + menor);
        System.out.println("index menor idade " + indexMenor);
        System.out.println("maior idade " + maior);
        System.out.println("index mmaior idade " + indexMaior);
    }
}
