package exercicios.exercicios_aula15;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();


            if (n1 < n2 && n1<n3){
        System.out.println("o menor preco é "+ n1);
    }else {
        if (n2 < n1 && n2 < n3) {
            System.out.println("o menor preco é " + n2);
        } else {

        }
        if (n3 < n2 && n3 < n1)
            System.out.println("o menor preco é " + n3);
    }
}
    }
