package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int pares = 0;
        int impares=0;
        //o for vai percorrer o 10
        for (int i = 0; i<10;i++){
            System.out.println("entre com um numero");
            num = scan.nextInt();
            //se o num com a porcentage de 2 iqual a 0
            if (num% 2==0){
                //pare recebe 1
                pares++;
            }else {
                //senao impares recebe 1
                impares++;
            }
            System.out.println(pares);
            System.out.println(impares);
        }
    }
}
