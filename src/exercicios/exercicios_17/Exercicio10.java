package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o primeiro numero");
        int n1 = scan.nextInt();
        System.out.println("entre com o segundo numero");
        int n2 = scan.nextInt();
        //o for vai percorrer o n2
        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }
}
