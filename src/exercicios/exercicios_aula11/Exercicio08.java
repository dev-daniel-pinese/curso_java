package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorhora= scan.nextDouble();
        double horames = scan.nextDouble();
        //a sala vai receber o valor da hora * horas mes
        double sala= valorhora* horames;
        System.out.println("o seu salario é "+ sala);

    }
}
