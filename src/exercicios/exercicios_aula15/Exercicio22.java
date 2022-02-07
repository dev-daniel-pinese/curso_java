package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pesototal = 0;
        System.out.println("o peso do morango");
        double morango = scan.nextDouble();
        double precomorango = 0;
        System.out.println("entre com o peso da maca");
        double maca = scan.nextDouble();
        double precomaca = 0;
        double valortotal = 0;
        double valorConDesc = 0;
        if (morango <= 5) {
            precomorango = morango * 2.5;
        } else {
            precomorango = morango * 2.2;
        }
        if (maca <= 5) {
            precomaca = maca * 1.8;
        } else {
            precomaca = maca * 1.5;
        }
        valortotal = precomaca + precomorango;
        System.out.println("preco maca" + precomaca);
        System.out.println("preco morango" + precomorango);
        System.out.println("valor total:" + valortotal);
        pesototal = morango + maca;
        System.out.println("peso total: "+pesototal);
        if (pesototal > 25) {
            valorConDesc = (valortotal / 100) * 10;
            System.out.println("valor com desconto" + valorConDesc);
        }else {
            System.out.println(valortotal);
        }

    }
}
