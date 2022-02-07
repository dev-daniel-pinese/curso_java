package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double c = scan.nextDouble();
            double f = (c * 1.8) + 32;
            System.out.println("tempertura " + c + " c é igual a " + f + " f");
        }
    }


