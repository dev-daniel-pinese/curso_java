package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int cont = 0;
        //for vai perocorrer o vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("entre com o valor da posicao");
            vetorA[i] = scan.nextInt();
            //vai verificar se é par
            if (vetorA[i] % 2 == 0){
                //vai contar a quantidade de pares-
                cont++;
            }
            System.out.println("o numero pares é "+ cont);

        }
    }
}
