package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double f = scan.nextDouble();
        //crals vai receber (5*(f-32)/9)
        double c = (5*(f-32)/9);
        System.out.println("tempertura "+ f +" f é igual a "+ c +" c");
    }
}
