package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        //vai percorrer o vetor A na posicao i
        for (int i=0; i < vetorA.length;i++){
            System.out.println("entre com um numero para a posicao "+ i);
            vetorA[i] = scan.nextInt();
            //se o vetorA na posicao i for impar
            if (vetorA[i] % 2 !=0){
                break;
            }
        }
    }
}
