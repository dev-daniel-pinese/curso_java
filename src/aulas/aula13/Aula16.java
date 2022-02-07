package aulas.aula13;

import java.util.Scanner;

public class Aula16 {
    public static void main(String[] args) {
     int n = 1;
     int max = 10;

        System.out.println("contando ate " +max );
        while (n <= max ){
            System.out.println("valor de n "+ n);
            n++;
        }
        do {
            n++;
            System.out.println("valor de n "+ n);
        }while (n < 11);
    }
}
