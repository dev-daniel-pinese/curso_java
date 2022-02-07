package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = nota1+nota2/2;
        if (media >= 7){
            System.out.println("aprovado "+ media);
        }else if (media <= 6){
        System.out.println("reprovado "+ media);
            }else if (media >= 10){
            System.out.println("aprovado com dintinçao " + media);
        }

    }
}
