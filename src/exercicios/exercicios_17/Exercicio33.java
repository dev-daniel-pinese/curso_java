package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o valor de n");
        int n = scan.nextInt();
        for (int i= 1, j= 1;i<=n;i++ ,j+=2){
            System.out.println(i+ "/"+ j +"+");

        }
    }
}
