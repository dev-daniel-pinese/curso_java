package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com um numero para a posicao " + i);
            vetorA[i] = scan.nextInt();

        }
        boolean palindro = true;
        //vai percorre o vetor a e dividi por dois
        for (int i=0; i< (vetorA.length)/2;i++){
            //se o vetor A posicao i for diferente ou iqual
            if (vetorA[i] != vetorA[vetorA.length -1-i]){
                palindro = false;
                //o break vai para o loop
                break;
            }
        }
        System.out.println("vetor A");
        //vai percorre o vetor a
        for (int i=0; i< vetorA.length; i++){
            System.out.println(vetorA[i]+ " ");
        }
        /*for (int j : vetorA) {
            System.out.println(j + " ");
        }*/
        System.out.println();

        if (palindro){
            System.out.println("palindromo");
        }else {
            System.out.println("nao palindromo");
        }
    }
}
