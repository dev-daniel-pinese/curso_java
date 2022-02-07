package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();
        if (((lado1 + lado2) >lado3)&&
                ((lado1+lado3)>lado2)&&
                ((lado2+lado3)>lado1)){
            if (lado1==lado2 && lado1==lado3 && lado2==lado3){
                System.out.println("triangulo equilatrero");
            }else if (lado1!= lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("triangulo equilatero");
            }else if (lado1==lado2 || lado1 == lado3 || lado2==lado3){
                System.out.println("triangulo isoseles");
            }
        }
    }
}
