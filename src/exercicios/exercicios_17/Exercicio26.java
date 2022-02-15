package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num+ "! = " +num+ "");

        System.out.println(num+ "! =");

        int fatorial =1;
        //o for vai percorrer se for maior que 1
        for (int i= num; i>1; i--){
            fatorial *= i;
            System.out.print(i + " . ");
        }
        System.out.print("1 = " + fatorial);
    }
}
