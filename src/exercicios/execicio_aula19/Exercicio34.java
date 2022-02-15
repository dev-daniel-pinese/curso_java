package exercicios.execicio_aula19;

import java.util.Scanner;

//.Criar um vetor A com 10 elementos inteiros. Escreva um programa que
//imprima cada elemento do vetor A e a relação de todos os pares de 0
//até o respectivo elemento.
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição A - " + i);
            vetorA[i] = scan.nextInt();
        }

        //percorre o vetorA
        for (int i=0; i<vetorA.length; i++){

            //printa a vetor na posicao i
            System.out.println("Analizando o número " + vetorA[i]);

             //percorre o vetorA a partir de 2
            for (int j=2; j<vetorA[i]; j++){
                //verificando se numeros pares até a posicao dele mesmo
                if (j % 2 == 0){
                    //se par printa frse
                    System.out.println(j + " é par");
                }
            }

            System.out.println();
        }

    }


}

