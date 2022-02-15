package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String turno = scan.next();
        switch (turno){
            //case se for m bom dia
            case "m":
            case "M": System.out.println("bom dia!");break;
            //case se for v boa tarde
            case "v":
            case "V": System.out.println("boa tarde!");break;
            //case se for n bom noite
            case "n":
            case "N": System.out.println("bom noite!");break;
            default: System.out.println("valor invalido");
        }
    }
}
