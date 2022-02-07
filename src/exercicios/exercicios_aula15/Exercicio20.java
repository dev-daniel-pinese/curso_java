package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite resposta 1");
        String resp1 = scan.next();
        System.out.println("digite resposta 2");
        String resp2 = scan.next();
        System.out.println("digite resposta 3");
        String resp3 = scan.next();
        System.out.println("digite resposta 4");
        String resp4 = scan.next();
        System.out.println("digite resposta 5");
        String resp5 = scan.next();
        int conta = 0;
        if (resp1.equalsIgnoreCase("s")) {
            conta++;
        }
        if (resp2.equalsIgnoreCase("s")) {
            conta++;
        }
        if (resp3.equalsIgnoreCase("s")) {
            conta++;
        }
        if (resp4.equalsIgnoreCase("s")) {
            conta++;
        }
        if (resp5.equalsIgnoreCase("s")) {
            conta++;
        }

        if (conta == 2) {
            System.out.println("é suspeito");
        } else if (conta == 3 || conta == 4) {
            System.out.println("cumplice");
        } else if (conta == 5) {
            System.out.println("assasino");
        } else {
            System.out.println("inocente");
        }
        System.out.println(conta);
    }

}

