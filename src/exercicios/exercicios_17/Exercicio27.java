package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com a qtd de temperatura");
        int qtdTempera= scan.nextInt();
        double temp;
        double soma = 0 ;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
    for (int i = 1 ;i <=qtdTempera;i++){
            System.out.println("entre com a temperatura " + i);
            temp = scan.nextDouble();
            soma+= temp;

            if (temp > maior){
                maior = temp;
            }
        if (temp < menor){
            menor = temp;
        }
        System.out.println("media: "+(soma/qtdTempera));
        System.out.println("menor temperatura "+ menor);
        System.out.println("maior temperatura "+ maior);
    }}
}
