package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        //a area é a o raio vezes o raio
        double area = Math.PI * Math.pow(raio,2);
        System.out.println(area);
    }
}
