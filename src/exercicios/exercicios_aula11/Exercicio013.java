package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorora = scan.nextDouble();
        double horas = scan.nextDouble();
        double salarbruto= valorora * horas;
        double inss = (salarbruto/100)*8;
        double sindi = (salarbruto/100)*5;
        double ir = (salarbruto/100)*11;
        double totaldesco =inss + sindi;
        double salarliquido = salarbruto - totaldesco;
        System.out.println(salarbruto);
        System.out.println(inss);
        System.out.println(sindi);
        System.out.println(totaldesco);
        System.out.println(salarliquido);
    }
}
