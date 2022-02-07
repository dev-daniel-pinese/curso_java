package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String turno = scan.next();
        switch (turno){
            case "m":
            case "M": System.out.println("bom dia!");break;
            case "v":
            case "V": System.out.println("boa tarde!");break;
            case "n":
            case "N": System.out.println("bom noite!");break;
            default: System.out.println("valor invalido");
        }
    }
}
