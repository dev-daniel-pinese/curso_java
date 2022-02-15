package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        //media recebe nota1 + nota2 /2
        double media = nota1+nota2/2;
        //se a media for maior ou iqual a 7
        if (media >= 7){
            System.out.println("aprovado "+ media);
            //se nao se media for menor ou iqual q 6
        }else if (media <= 6){
        System.out.println("reprovado "+ media);
        //se nao se media for maior ou iqual q 10
            }else if (media >= 10){
            System.out.println("aprovado com dintinçao " + media);
        }

    }
}
