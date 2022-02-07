package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o numero de notas:");
        int notas = scan.nextInt();

        double som= 0;
        double media;
        double nota;

        for (int i=0; i<notas;i++){
            System.out.println("entre com a nota "+ (i+1));
            nota = scan.nextDouble();
        }
        media = som / notas;
        System.out.println(som);
        System.out.println(media);
    }
}

