package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorhora = scan.nextDouble();
        double qtdhoras = scan.nextDouble();
        double salaribruto = valorhora*qtdhoras;
        int percen =0;
        if (salaribruto <= 900){
            percen = 0;
        }else if (salaribruto > 900 && salaribruto <= 1500){
            percen =5;
        }else if (salaribruto > 1500 && salaribruto <= 2500){
            percen = 10;
        }else if (salaribruto >  2500) {
            percen = 20;
        }
        double ir = (salaribruto/100)* percen;
        double inss = (salaribruto / 100)* 10;
        double fgts = (salaribruto / 100)* 11;
        double totaldescon = ir + inss;
        double salarioliquido = salaribruto - totaldescon;
        System.out.println("salari bruto ("+ valorhora + " * "+ qtdhoras +")");
        System.out.println("(-) ir ("+percen+"%): "+ir);
        System.out.println("(-) inss (10%): "+ fgts);
        System.out.println("total de desconto "+ totaldescon);
        System.out.println("salario liquido "+salarioliquido);
    }
}
