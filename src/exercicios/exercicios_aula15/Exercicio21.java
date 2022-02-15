package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite litros");
        double litros = scan.nextDouble();
        System.out.println("digite tipo de combustivel");
        String tipo = scan.next();
        double precogas = 2.5;
        double precoalc = 1.9;
        int percdescon = 0;
        double total = 0;
        double totaldesonto = 0;
        //se tipo for a
        if (tipo.equalsIgnoreCase("a")) {
            //se litros for menor ou iqual
            if (litros <= 20) {
                percdescon =  3;
            } else {
                percdescon =  5;
            }
            //total recebe preco alc * litros
            total = precoalc * litros;
            //se tipo for g
        } else if (tipo.equalsIgnoreCase("g")) {
            //se litros for menor ou iqual
            if (litros <= 20) {
                percdescon =  4;
            } else {
                percdescon =  6;
            }
            //total recebe litros * preco gas
            total = litros * precogas;
        }
        //total desconto recebe total /100 *  percdescon
        totaldesonto = (total / 100 ) * percdescon;
        double precoapagar = total - totaldesonto;
        System.out.println(precoapagar);
    }
}
