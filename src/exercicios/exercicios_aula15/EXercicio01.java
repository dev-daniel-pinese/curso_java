package exercicios.exercicios_aula15;

import java.util.Scanner;

public class EXercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        //o if se o numero 1 for maior que o numero2
        if (n1 > n2 ) {
            System.out.println("esse é o maior numero "+ n1);
            //o else é se nao
        }else {
            //se o numero2  for maior que o numer1
            if (n2 > n1){
                System.out.println("esse é o maior numero "+ n2);
            }
        }
    }
}
