package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2)/2;
        if (media >= 9 || media <= 10){
            System.out.println("aprovado com a");
        }else if (media >=7.5 || media <= 9 ){
            System.out.println("aprovado com b");
        }else if (media >= 6 || media <= 7.5 ){
            System.out.println("aprovado com c");
        }else  if (media >= 4 || media <=6){
            System.out.println("reprovado dom d");
        }else  if (media >= 0 || media <=4)
            System.out.println("reprovado com e");
    }
}
