package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        double n3 = scan.nextInt();
        int resul1 = (n1*2)* (n2/2);
        double resul2 = (n1 * 3) + n3;
        double resul3 = Math.pow(n3, 3);
        System.out.println("primeiro resultado "+ resul1);
        System.out.println("segundo resultado "+ resul2);
        System.out.println("terceiro resultado "+ resul3);
    }
}
