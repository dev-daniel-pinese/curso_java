package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letra = scan.next();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")||
         letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||
         letra.equalsIgnoreCase("u")){
            System.out.println("é vogal");
        }else {
            System.out.println("é consuante");
        }
}
}
