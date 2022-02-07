package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o numero de turmas");
        int numturmas = scan.nextInt();

        int numaluno;
        int soma = 0;
        boolean ivalido = true;

        for (int i=1; i <=numturmas; i++){
            do {
                System.out.println("entre com o numero de alunos da turma " + i);
                numaluno = scan.nextInt();

                if (numaluno <= 40) {
                    ivalido = false;
                }else {
                    System.out.println("numero de alunos invalido gite de novo");
                }

            } while (ivalido);
            soma += numaluno;
        }
        double media =soma/ numturmas;
        System.out.println(media);
    }
}
