package exercicios.exercicios_aula15;

import java.util.Scanner;

public class EXercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        if (n1 > n2 ) {
            System.out.println("esse é o maior numero "+ n1);
        }else {
            if (n2 > n1){
                System.out.println("esse é o maior numero "+ n2);
            }

        }
    }
}
