package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int soma=0;
        int media;
        //o for vai percorrer o 5
        for (int i = 0; i<5; i++){
            System.out.println("digite um numero");
            num = scan.nextInt();

            soma+= num;
        }
        media = soma/5;
        System.out.println(media);
    }
}
