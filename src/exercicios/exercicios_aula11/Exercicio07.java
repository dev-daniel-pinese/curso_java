package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado = scan.nextDouble();
        double area = Math.pow(lado,2);
        double resul;
        resul = area;
        System.out.println(area+ " area do quadrado");
        System.out.println((area* 2)+ " o dobro da area do quadrado");

    }
}
