package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre om o tip de carne");
        System.out.println("1 - file duplo\n2 - alcatra\n3- picanha ");
        int tipo = scan.nextInt();
        System.out.println("quantidade de kg");
        double qtd = scan.nextDouble();
        double precokg;
        double desc = 0;
        System.out.println("tem carto tabajara ?");
        String cartao = scan.next();
        if (tipo == 1) {
            System.out.println(qtd + " kg-file duplo");
            if (qtd <= 5) {
                precokg = qtd * 4.9;
                System.out.println(precokg);
            } else {
                precokg = qtd * 5.8;
                System.out.println(precokg);
            }
        } else if (tipo == 2) {
            if (qtd <= 5) {
                precokg = qtd + 5.9;
            } else{
                precokg=qtd*6.8;
            }
        }else{
            if (qtd<=5){
                precokg=qtd *6.9;
            }else {
                precokg=7.8;
            }
        }
        if (cartao.equalsIgnoreCase("s")){
            desc=precokg/100*5;
        }
        System.out.println(precokg-desc);
    }
}




