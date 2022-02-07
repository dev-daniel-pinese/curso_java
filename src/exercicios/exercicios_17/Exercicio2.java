package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infovalidas= false;
        do{
            System.out.println("entre com o nome do usuario");
            String nome = scan.next();
            System.out.println("entre coma senha ");
            String senha = scan.next();
            if (nome.equalsIgnoreCase(senha)){
                infovalidas = false;
                System.out.println("senha igua do usuaario digite novamente");
            }else {
                infovalidas=true;
                System.out.println("senha e usuario valido");
            }

        }while (!infovalidas);
    }
}
