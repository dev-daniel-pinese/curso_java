package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorora = scan.nextDouble();
        double horas = scan.nextDouble();
        //o salariobruto vai receber valor hora * ras
        double salarbruto= valorora * horas;
        //o inss vai receber o (salaribruto/100)*8
        double inss = (salarbruto/100)*8;
        //o sidicato vai receber (salaribruto/100)*8
        double sindi = (salarbruto/100)*5;
        //o ir recebe (salaribruto/100)*8
        double ir = (salarbruto/100)*11;
        //o total deconto recebe inss + sindi
        double totaldesco =inss + sindi;
        //salario liquido recebe salarbruto-totaldesco
        double salarliquido = salarbruto - totaldesco;
        System.out.println(salarbruto);
        System.out.println(inss);
        System.out.println(sindi);
        System.out.println(totaldesco);
        System.out.println(salarliquido);
    }
}
