package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com a qtd de temperatura");
        int qtdTempera= scan.nextInt();
        double temp;
        double soma = 0 ;
        //o max_value é o maior valor
        double menor = Double.MAX_VALUE;
        //o min_value é o menor valor
        double maior = Double.MIN_VALUE;
        //for i recebe 1 ; i se for menor ou iqual que qtdtempera ; e i recebe 1
    for (int i = 1 ;i <=qtdTempera;i++){
            System.out.println("entre com a temperatura " + i);
            temp = scan.nextDouble();
            soma+= temp;
            //se o temp for maior que maior
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
