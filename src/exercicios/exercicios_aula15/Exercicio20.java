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
        //conta iqual a 0
        int conta = 0;
        //se resp1 for s
        if (resp1.equalsIgnoreCase("s")) {
            //conta recebe 1
            conta++;
        }
        //se resp2 for s
        if (resp2.equalsIgnoreCase("s")) {
            conta++;
        }
        //se resp3 for s
        if (resp3.equalsIgnoreCase("s")) {
            conta++;
        }
        //se resp4 for s
        if (resp4.equalsIgnoreCase("s")) {
            conta++;
        }
        //se resp5 for s
        if (resp5.equalsIgnoreCase("s")) {
            conta++;
        }
        //se fo conta iqual a dois
        if (conta == 2) {
            System.out.println("é suspeito");
            //se nao se conta for iqual a 3 ou conta iqual a 4
        } else if (conta == 3 || conta == 4) {
            System.out.println("cumplice");
            //se nao se conta for iqual a 5
        } else if (conta == 5) {
            System.out.println("assasino");
        } else {
            System.out.println("inocente");
        }
        System.out.println(conta);
    }

}

