package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altu= scan.nextDouble();
        //o peso ideal vai receber 72.7 * altura
        double pesoideal =(72.7 * altu);
        System.out.println(pesoideal);
    }
}
