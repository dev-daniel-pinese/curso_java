package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero ");
        int num = scan.nextInt();
        System.out.println(num+ "! = " +num+ "");

        int fatorial =num;
        //o for vai percorrer o 0
        for (int i= num; i>0; i--){
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("resultado " + fatorial);
    }
}
