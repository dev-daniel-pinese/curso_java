package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salar = scan.nextDouble();
        int perce = 0;
        //se sala menor ou iqual 2800
        if (salar <= 280){
            //perce recebe 20
            perce=20;
            //se sala menor ou iqual 2800 e sala menor ou iqual 700
        }else if (salar > 280 && salar <= 700){
            //perce recebe 15
            perce =15;
            //se sala menor iqual 700 e sala menor ou iqual 1500
        }else if (salar >= 700 && salar < 1500){
            //perce recebe 10
            perce = 10;
            //se sala maior ou iqual 1500
        }else if (salar >=1500){
            perce = 5;
        }
        //aumento recebe salar / 100 * perce
        double aumento = (salar / 100 )* perce;
        //salario ajustado recebe salar + perce
        double salarioajustado = salar+aumento;
        System.out.println("salario: "+ salar);
        System.out.println("percentual: "+perce);
        System.out.println("aumento: "+ aumento);
        System.out.println("salario ajustado: "+ salarioajustado);

    }
}
