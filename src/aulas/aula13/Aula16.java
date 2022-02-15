package aulas.aula13;

import java.util.Scanner;

public class Aula16 {
    public static void main(String[] args) {
     int n = 1;
     int max = 10;

        System.out.println("contando ate " +max );
        //while se o resultado for verdadeiro execultao o codigo dentro do bloco
        while (n <= max ){
            System.out.println("valor de n "+ n);
            n++;
        }
        //do esse comando execulta obloco dentro do comando e depois avalia a expressao
        do {
            n++;
            System.out.println("valor de n "+ n);
            //se o n for menor que 11
        }while (n < 11);
    }
}
