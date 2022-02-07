package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        if (n1 %2 == 0){
            System.out.println("é par");
        }else {
            System.out.println("é impar");
        }
    }
}
