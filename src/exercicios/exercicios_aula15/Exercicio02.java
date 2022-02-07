package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        if (n1 >= 0){
            System.out.println("é possitivo ");
        }else {
            System.out.println("é negativo ");
        }
    }
}
