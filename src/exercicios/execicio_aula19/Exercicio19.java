package exercicios.execicio_aula19;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas1 = new double[5];
        double[] notas2 = new double[notas1.length];
        double[] resul = new double[notas1.length];
        for (int i = 0; i < notas1.length; i++) {
            System.out.println("entre com a nota 1 do aluno ");
            notas1[i] = scan.nextDouble();
            System.out.println("entre com a nota 2 do aluno ");
            notas2[i] = scan.nextDouble();

            resul[i] = (notas1[i] + notas2[i]) / 2;
        }
        System.out.println("notas 1");
        //for para percorrer nota1
        for (int i = 0; i < notas1.length; i++) {
            System.out.println(notas1[i] + " ");
        }
        System.out.println();
        //for para percorrer a nota 2
        System.out.println("notas 2");
        for (int i = 0; i < notas2.length; i++) {
            System.out.println(notas2[i] + " ");
        }
        System.out.println("");
        //for para percorrer o resultado
        System.out.println("resultado");
        for (int i = 0; i < resul.length; i++) {
            System.out.println(resul[i] + " ");
            //se o resultado posicao i for maior ou iqual a 7
            if (resul[i]>= 7){
                System.out.println(resul[i] + " - aprovado");
            }else {
                System.out.println(resul[i] + " - reprovado");


            }
        }
    }
}
