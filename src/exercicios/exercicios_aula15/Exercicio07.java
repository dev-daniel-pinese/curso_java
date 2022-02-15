package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        //se n1 maior n2 e n1 maior que n3
        if (n1 > n2 && n1>n3){
            System.out.println("o maior numero é "+ n1);
            //se nao
        }else {
            //se n2 maior n1 e n2 maior que n3
            if (n2 > n1 && n2 > n3) {
                System.out.println("o maior numero é " + n2);
                //se nao
            } else {

            }
            //se n3 maior n2 e n3 maior que n1
            if (n3 > n2 && n3 > n1){
                System.out.println("o maior numero é " + n3);
                //se nao
            }else {

            }
            //se n1 menor n2 e n1 menor que n3
            if (n1 < n2 && n1<n3){
                System.out.println("o menor numero é "+ n1);
                //se nao
            }else {
                //se n2 menor n1 e n2 menor que n3
                if (n2 < n1 && n2 < n3) {
                    System.out.println("o menor numero é " + n2);
                    //se nao
                } else {

                }
                //se n3 menor n2 e n3 menor que n1
                if (n3 < n2 && n3 < n1)
                    System.out.println("o menor numero é " + n3);
            }
        }
    }
}



