package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        switch (dia){
            //case se for 1 é domingo
            case 1: System.out.println("domingo");break;
            //case se for 2 é segunda
            case 2: System.out.println("segunda");break;
            //case se for 3 é terca
            case 3: System.out.println("terca");break;
            //case se for 4 é quarta
            case 4: System.out.println("quarta");break;
            //case se for 5 é quinta
            case 5: System.out.println("quinta");break;
            //case se for 6 é sexta
            case 6: System.out.println("sexta");break;
            //case se for 7 é sabado
            case 7: System.out.println("sabado");break;
            default: System.out.println("nao é um dia da semana ");

        }
    }
}
