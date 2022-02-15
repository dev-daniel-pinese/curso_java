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
        //se tipo igual a 0
        if (tipo == 1) {
            System.out.println(qtd + " kg-file duplo");
            //se qtd maior ou iqual a 5
            if (qtd <= 5) {
                precokg = qtd * 4.9;
                System.out.println(precokg);
            } else {
                //se nao
                precokg = qtd * 5.8;
                System.out.println(precokg);
            }
            //se nao if tipo igual a 2
        } else if (tipo == 2) {
            //se qtd maior ou iqual 5
            if (qtd <= 5) {
                precokg = qtd + 5.9;
            } else{
                precokg=qtd*6.8;
            }
        }else{
            //se qtd maior ou igual a 5
            if (qtd<=5){
                precokg=qtd *6.9;
            }else {
                precokg=7.8;
            }
        }
        //se cartao s
        if (cartao.equalsIgnoreCase("s")){
            desc=precokg/100*5;
        }
        System.out.println(precokg-desc);
    }
}




