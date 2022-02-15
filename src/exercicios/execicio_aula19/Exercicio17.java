package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        //o for vai percorrer o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com a idade da pessoa");
            vetorA[i] = scan.nextInt();

        }

        int qtd =0;
        for (int i=0; i< vetorA.length; i++){
            //vai ver se o vetorA na posicao i  é maior que 35
            if (vetorA[i] > 35){
                //vai somar os valores-
                qtd++;

            }
        }
        System.out.println("vetor de idades");
        for (int i =0; i< vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("qtd pessoa idade > 35 :" +qtd);

    }
}
