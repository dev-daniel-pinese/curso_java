package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infovalida = false;
        String nome;
        int idade;
        double salario ;
        String sexo;
        String estadocivil;

        do {
            System.out.println("entre com o nome");
            nome = scan.next();
            if (nome.length()>=3) {
                infovalida = true;
            }else {
                System.out.println("o nome precisa no minimo 3 caracteres.");
            }
        }while (!infovalida);

        infovalida= false;
        do {
            System.out.println("entre com a idade");
            idade = scan.nextInt();
            if (idade >= 0 && idade <= 150) {
                infovalida = true;
            } else {
                System.out.println("idade preicisa ser entre 0 e 150");
            }
        }while (!infovalida);
        infovalida= false;
        do {
            System.out.println("entre com o seu salario ");
            salario = scan.nextDouble();
            if (salario > 0) {
                infovalida = true;
            } else {
                System.out.println("tem preicisa ser maior de 0");
            }
        }while (!infovalida);

        infovalida= false;
        do {
            System.out.println("entre com o seu sexo ");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")) {
                infovalida = true;
            } else {
                System.out.println("o sexo tem que ser f ou m");
            }
        }while (!infovalida);
        infovalida= false;
        do {
            System.out.println("entre com o seu estado civil ");
            estadocivil = scan.next();
            if (estadocivil.equalsIgnoreCase("s")||estadocivil.equalsIgnoreCase("c")||estadocivil.equalsIgnoreCase("v")||estadocivil.equalsIgnoreCase("d")){

                infovalida = true;
            } else {
                System.out.println("o estdo civil tem que ser s,c,v,d");
            }
        }while (!infovalida);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(estadocivil);
    }
}
