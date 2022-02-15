package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com um numero");
        int num = scan.nextInt();
        //o for vai percorrer o num
        for (int i =2; i<=num; i++){

        boolean primo = true;
            //for j recebe 2 ; j se for menor ou iqual que num ; e j recebe 1
        for (int j =2; j<=num; j++){
            //se o num com a porcentagen de j igual a 0
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
