package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tamanho = scan.nextDouble();
        double velocidade = scan.nextDouble();
        double downlod;
        //o downlod recebe tamanho / veloidade
        downlod = tamanho/velocidade;
        System.out.println(downlod);
    }
}
