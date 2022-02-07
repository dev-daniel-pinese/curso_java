package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num ;
        int maior =Integer.MIN_VALUE;
        for (int i = 0 ;i<5; i++){
            System.out.println("entre com um numero ");
            num = scan.nextInt();
            if (num > maior){
                maior = num;
            }
            System.out.println("o maior numero digitado foi "+maior);
        }
    }
}
