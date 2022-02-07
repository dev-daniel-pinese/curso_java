package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ano = scan.nextInt();
        if ((ano % 400 == 0 || ano% 4 == 0 && ano % 100 !=0)){
            System.out.println("e bissesto");
        }else {
            System.out.println("nao é bissesto");
        }
    }
}
