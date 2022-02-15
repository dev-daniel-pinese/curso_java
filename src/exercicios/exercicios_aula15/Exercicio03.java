package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sexo= scan.next();
        //se o sexo for f é feminino
        if (sexo.equalsIgnoreCase("f")  ){
            System.out.println("f - feminino "+ sexo);
            //se nao se se sexo for m masculino
        }else if (sexo.equalsIgnoreCase("m")  ){
            System.out.println("m - masulino");
            //se nao for nenhum dos dois sexo invalido
        }else {
            System.out.println("sexo invalido");
        }
    }
}
