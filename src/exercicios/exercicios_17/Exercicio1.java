package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean notavalida = false;
        //o do vai executa o bloco dentro do comando e depois avalia a espressao.
        // o bloco deixa de ser executado apos a expressao fica falsa
        do {
            System.out.println("entre om nota");
            double nota = scan.nextDouble();
            if (nota >=0 && nota <=10){
                notavalida = true;
                System.out.println("vc digitou " + nota);
            }else {
                System.out.println("nota invalida digite novamente");
            }
        //o while caso verdadeira executa o bloco
        }while (!notavalida);
    }
}