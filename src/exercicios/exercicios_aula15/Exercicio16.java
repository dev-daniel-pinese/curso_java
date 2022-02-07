package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a == 0){
            System.out.println("nao é equacao do segundo gral");
        }else {

        }
        int b = scan.nextInt();
        int c = scan.nextInt();

        double delta = (b*b)-(4*a*c);
        if (delta < 0){
            System.out.println("delta negativo");
        }else {
            double x1= ((-b )+ Math.sqrt(delta) )/(2*a);
            double x2= ((-b) - Math.sqrt(delta)) /(2*a);
            System.out.println("x1 = "+ x1);
            System.out.println("x2 = "+ x2);
        }
    }
}
