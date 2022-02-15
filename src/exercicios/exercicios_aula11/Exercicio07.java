package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado = scan.nextDouble();
        //vai ser a o lado vezes o lado
        double area = Math.pow(lado,2);
        double resul;
        //e o resultado vai receber a area
        resul = area;
        System.out.println(area+ " area do quadrado");
        System.out.println((area* 2)+ " o dobro da area do quadrado");

    }
}
