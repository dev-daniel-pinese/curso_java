package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        //a media recebe nota+nota2 /2
        double media = (nota1+nota2)/2;
        //se a media maior ou iqual 9 ou  media menor ou iqual 10
        if (media >= 9 || media <= 10){
            System.out.println("aprovado com a");
            //se a media maior ou iqual 7.5 ou  media menor ou iqual 9
        }else if (media >=7.5 || media <= 9 ){
            System.out.println("aprovado com b");
            //se a media maior ou iqual 6 ou  media menor ou iqual 7.5
        }else if (media >= 6 || media <= 7.5 ){
            System.out.println("aprovado com c");
            //se a media maior ou iqual 4 ou  media menor ou iqual 6
        }else  if (media >= 4 || media <=6){
            System.out.println("reprovado dom d");
            //se a media maior ou iqual 0 ou  media menor ou iqual 4
        }else  if (media >= 0 || media <=4)
            System.out.println("reprovado com e");
    }
}
