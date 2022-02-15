package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com quantidade de  idades");
        int idades= scan.nextInt();

        int idade ;

        int soma =0;
        //o for vai percorrer o idades
        for (int i =0; i<idades;i++){
            System.out.println("entre com a idade da pessoa "+ (i+1));
            idade = scan.nextInt();
            soma+=idade;
        }
        double media = soma/ idades;
        //se a media maior que 0 e media menor ou iqual a 25
        if (media>= 0 && media <= 25){
            System.out.println("jovem");
            //se nao se a media maior que 26 e media menor ou iqual a 60
        }else if (media >= 26 && media <=60){
            System.out.println("adulta");
            //se nao se a media maior a 60
        }else if (media > 60){
            System.out.println("idosa");
        }

    }
}
