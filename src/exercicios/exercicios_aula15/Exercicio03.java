package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sexo= scan.next();

        if (sexo.equalsIgnoreCase("f")  ){
            System.out.println("f - feminino "+ sexo);
        }else if (sexo.equalsIgnoreCase("m")  ){
            System.out.println("m - masulino");
        }else {
            System.out.println("sexo invalido");
        }
    }
}
