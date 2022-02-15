package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        //se o numero 1 for maior ou iqual 0
        if (n1 >= 0){
            System.out.println("é possitivo ");
            //se nao for 0 ou iqual é negativo
        }else {
            System.out.println("é negativo ");
        }
    }
}
