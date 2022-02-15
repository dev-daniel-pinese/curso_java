package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int qtd0 = 0;
        int qtd1 = 0;
        //vai percorrer o vetor A
        for (int i=0; i< vetorA.length; i++){
            //Math.random() * 1 retorna um valor double entre zero e um
            //Math.round() faz o arrendondamento desse numro
            //(int)Math.round(Math.random()*1; retorna um valor inteiro de 0 ou 1
            vetorA[i] = (int) Math.round(Math.random()*1);
            //se o vetorA na posicao i for iqual a 0
            if (vetorA[i] == 0){
                //vai somar os valores
                qtd0++;
            //se nao
            }else {
                //vai somar os valores do qtd1
                qtd1++;
            }
        }
        //vai receber a porcentagem de num 0
        double porc0 = (qtd0 * 100)/vetorA.length;
        //vai receber a porcentagem de num 1
        double porc1 = (qtd1 * 100)/vetorA.length;

        System.out.println("vetr A ");
        //for para percorrer o vetor
        for (int i=0; i< vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("porc 0 =" + porc0);
        System.out.println("porc 1 =" + porc1);
    }
}
