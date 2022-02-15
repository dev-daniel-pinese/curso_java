package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        String opera = scan.next();
        double resultado = 0;
        boolean valido = true;
        switch (opera){
            //case + resutado resebe n1 + n2
            case "+":resultado= n1+n2;break;
            //case - resutado resebe n1  n2
            case "-":resultado= n1-n2;break;
            //case * resutado resebe n1 * n2
            case "*":resultado= n1*n2;break;
            //case / resutado resebe n1 / n2
            case "/":resultado= n1/n2;break;
            default:System.out.println("nao é operacao");valido = false;

            }
        if (valido){
            //se resultado com porcentagen de 2 iqual 0
            if (resultado % 2 == 0){
                System.out.println("o numero "+ resultado+ " é par");
            }else {
                System.out.println("o numero "+ resultado+ " é impar");
            }
            //se resultado for maior ou iqual a 0
            if (resultado >= 0){
                System.out.println(resultado+" é positivo");
            }else {
                System.out.println(resultado+" é negativo");
            }
                System.out.println(resultado);
        }
    }
}
