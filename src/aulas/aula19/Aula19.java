package aulas.aula19;

import java.util.Scanner;

public class Aula19 {
    public static void main(String[] args) {
        double tempdia001 =31.3;
        double tempdia002 =32;
        double tempdia003 =33.7;
        double tempdia004 =34;
        double tempdia005 =33.1;
        //
        double[]temperaturas = new double[365];//precis explicar o numero de posicao
        temperaturas[0]=31.3;
        temperaturas[1]=32;
        temperaturas[2]=33.7;
        temperaturas[3]=34;
        temperaturas[4]=33.2;

        System.out.println("o valor da temperatura do dia 1 é " +temperaturas[0]);
        System.out.println("o tamanho do array: "+ temperaturas.length);
        System.out.println("valores de array: "+ temperaturas);

        for (int i =0; i<temperaturas.length;i++){
            System.out.println("o valor da temperatura do dia "+ (i+1)+ " é "+ temperaturas[i]);
        }
    }
}
