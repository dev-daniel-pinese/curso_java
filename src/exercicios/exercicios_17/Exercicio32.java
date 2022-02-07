package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean fim = false;
        int cod;
        int qtd;
        double total = 0;
        String output = "";
        System.out.println("faca seu pedido:");
        do {
            System.out.println("digite o codigo ");
            cod = scan.nextInt();
            System.out.println("digite a quantidade");
            qtd = scan.nextInt();
            if (cod == 0 && qtd == 0) {
                fim = true;
            } else {
                if (cod == 100) {
                    output += "cachorro quente -> 1.20 *" + qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                } else if (cod == 101) {
                    output += "bauru simples-> 1.30 *" + qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                } else if (cod == 102) {
                    output += "bauru comovo-> 1.50 *" + qtd;
                    output += " = " + (1.5 * qtd) + "\n";
                    total += 1.5 * qtd;
                } else if (cod == 103) {
                    output += "hamburguer-> 1.20 *" + qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                } else if (cod == 104) {
                    output += "cheesebugue-> 1.30 *" + qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                } else if (cod == 105) {
                    output += "refrigerante-> 1.00 *" + qtd;
                    output += " = " + (1 * qtd) + "\n";
                    total += 1 * qtd;
                }
            }
        }   while (!fim) ;
        System.out.println(output);
        }
    }



