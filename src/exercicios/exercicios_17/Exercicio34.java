package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);
        System.out.println("digite o valor de n");
        int n = scan.nextInt();
         double soma = 0;

        //for vai percorre o n
         for (int i= 1;i<= n; i++ ){
             soma += 1/i;
         }
        System.out.println("soma "+ soma);
    }
}
