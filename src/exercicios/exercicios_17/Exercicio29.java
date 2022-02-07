package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com um numero");
        int num = scan.nextInt();
        for (int i =2; i<=num; i++){

        boolean primo = true;

        for (int j =2; j<=num; j++){
                if (num%j == 0){
                    System.out.println("nao é primo");
                    primo= false;
                }
            }
            if (primo){
                System.out.println("é numero primo");

            }
        }
    }
}
