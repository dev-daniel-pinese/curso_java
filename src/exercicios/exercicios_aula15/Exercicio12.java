package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorhora = scan.nextDouble();
        double qtdhoras = scan.nextDouble();
        double salaribruto = valorhora*qtdhoras;
        int percen =0;
        //se salario bruto fpr menor ou iqual
        if (salaribruto <= 900){
        //e o percentual recebe 0
            percen = 0;
            //se nao se salario bruto maior ou iqual 900 e salario bruto menor que 1500
        }else if (salaribruto > 900 && salaribruto <= 1500){
            //percent recebe 5
            percen =5;
            //se nao se salario bruto for maior 1500 e salario bruto menor ou iqual 2500
        }else if (salaribruto > 1500 && salaribruto <= 2500){
            //percent recebe 10
            percen = 10;
            //se salario bruto 2500
        }else if (salaribruto >  2500) {
            //percent recebe 20
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
