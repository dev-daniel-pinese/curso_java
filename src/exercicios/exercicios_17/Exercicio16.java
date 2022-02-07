package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o termo da serie de fibonacci");
        int n = scan.nextInt();

        int primeiro =1;
        int segundo = 1;
        int proximo=0;

        while (proximo <= 500) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = primeiro;

            System.out.println(proximo);
        }
    }
}
