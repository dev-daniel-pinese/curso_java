package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com a base");
        int base = scan.nextInt();
        System.out.println("entre com a potecia ");
        int pot = scan.nextInt();


        int resutado = base;
        //o for vai percorrer o pot
        for (int i=0; i<=pot; i++){
            //resultado vai receber vezes a base
            resutado *=base;

        }
        System.out.println(resutado);
    }
}
