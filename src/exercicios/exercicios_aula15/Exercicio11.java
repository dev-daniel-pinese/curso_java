package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salar = scan.nextDouble();
        int perce = 0;
        if (salar <= 280){
            perce=20;
        }else if (salar > 280 && salar <= 700){
            perce =15;
        }else if (salar >= 700 && salar < 1500){
            perce = 10;
        }else if (salar >=1500){
            perce = 5;
        }
        double aumento = (salar / 100 )* perce;
        double salarioajustado = salar+aumento;
        System.out.println("salario: "+ salar);
        System.out.println("percentual: "+perce);
        System.out.println("aumento: "+ aumento);
        System.out.println("salario ajustado: "+ salarioajustado);

    }
}
