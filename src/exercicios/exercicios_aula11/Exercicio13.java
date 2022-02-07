package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cent;
        double metro = scan.nextDouble();
        cent = metro * 100;
        System.out.println(cent+" centimetros ");
    }
}
