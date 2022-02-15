package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();
        //se o lado1 + lado2 maior que lado3 e
        if (((lado1 + lado2) >lado3)&&
                //o lado1 + lado3 maior que lado2 e
                ((lado1+lado3)>lado2)&&
                //o lado2 + lado1 maior que lado3 e
                ((lado2+lado3)>lado1)){
            //se lado1 for iqual lado2 e lado1 iqual lado3 e lado2 iqual lado3
            if (lado1==lado2 && lado1==lado3 && lado2==lado3){
                System.out.println("triangulo equilatrero");
                //se lado2 for ou diferente iqual lado1 e lado1 diferente iqual lado3 e lado3 diferente iqual lado2
            }else if (lado1!= lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("triangulo escaleno");
                //se lado1 for iqual lado2 ou lado1 iqual lado3 ou lado2 iqual lado3
            }else if (lado1==lado2 || lado1 == lado3 || lado2==lado3){
                System.out.println("triangulo isoseles");
            }
        }
    }
}
