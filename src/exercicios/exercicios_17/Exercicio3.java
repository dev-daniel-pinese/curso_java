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
        //o do vai executa o bloco dentro do comando e depois avalia a espressao.
        // o bloco deixa de ser executado apos a expressao fica falsa

        do {
            System.out.println("entre com o nome");
            nome = scan.next();
            //se o nome for maior ou iqual a 3
            if (nome.length()>=3) {
                infovalida = true;
            }else {
                System.out.println("o nome precisa no minimo 3 caracteres.");
            }
            //o while caso verdadeira executa o bloco
        }while (!infovalida);

        infovalida= false;
        //o do vai executa o bloco dentro do comando e depois avalia a espressao.
        // o bloco deixa de ser executado apos a expressao fica falsa
        do {
            System.out.println("entre com a idade");
            idade = scan.nextInt();
            //se a idade for maior ou iqual 0 e idade for menor ou iqual 150
            if (idade >= 0 && idade <= 150) {
                infovalida = true;
            } else {
                System.out.println("idade preicisa ser entre 0 e 150");
            }
            //o while caso verdadeira executa o bloco
        }while (!infovalida);
        infovalida= false;
        //o do vai executa o bloco dentro do comando e depois avalia a espressao.
        // o bloco deixa de ser executado apos a expressao fica falsa
        do {
            System.out.println("entre com o seu salario ");
            salario = scan.nextDouble();
            //se o salario for maior que 0
            if (salario > 0) {
                infovalida = true;
            } else {
                System.out.println("tem preicisa ser maior de 0");
            }
            //o while caso verdadeira executa o bloco
        }while (!infovalida);

        infovalida= false;
        //o do vai executa o bloco dentro do comando e depois avalia a espressao.
        // o bloco deixa de ser executado apos a expressao fica falsa
        do {
            System.out.println("entre com o seu sexo ");
            sexo = scan.next();
            //se o sexo for f feminino ou m masculo
            if (sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")) {
                infovalida = true;
            } else {
                System.out.println("o sexo tem que ser f ou m");
            }
            //o while caso verdadeira executa o bloco
        }while (!infovalida);
        infovalida= false;
        //o do vai executa o bloco dentro do comando e depois avalia a espressao.
        // o bloco deixa de ser executado apos a expressao fica falsa
        do {
            System.out.println("entre com o seu estado civil ");
            estadocivil = scan.next();
            if (estadocivil.equalsIgnoreCase("s")||estadocivil.equalsIgnoreCase("c")||estadocivil.equalsIgnoreCase("v")||estadocivil.equalsIgnoreCase("d")){

                infovalida = true;
            } else {
                System.out.println("o estdo civil tem que ser s,c,v,d");
            }
           //o while caso verdadeira executa o bloco
        }while (!infovalida);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(estadocivil);
    }
}
