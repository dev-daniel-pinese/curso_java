package exercicios.exercicios_aula11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        double n3 = scan.nextInt();
        //o primeiro resultado vai receber (numero1*2) * (numero2/2)
        int resul1 = (n1*2)* (n2/2);
        //o segundo resultado vai receber (numero1*3)+ n3
        double resul2 = (n1 * 3) + n3;
        //o resultado 3 vai receber n3 elevado por 3
        double resul3 = Math.pow(n3, 3);
        System.out.println("primeiro resultado "+ resul1);
        System.out.println("segundo resultado "+ resul2);
        System.out.println("terceiro resultado "+ resul3);
    }
}
