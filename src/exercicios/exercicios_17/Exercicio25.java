package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lojas tabajara");
        boolean sair = false;
        String continuarcompra;
        int qtdprodutos;
        double preco;
        double total;
        String output;
        double valorapagar;
        double troco;

        do {
            System.out.println("deseja imformar uma nova compra?s/n");
            continuarcompra = scan.next();
            if (continuarcompra.equalsIgnoreCase("s")) {

                output="lojas tabajara/n";
                System.out.println("digite quantidade de produto");
                qtdprodutos = scan.nextInt();
                total=0;
                for (int i=1; i<= qtdprodutos;i++){
                    System.out.println("imformen preco do produtos "+ i);
                    preco = scan.nextDouble();
                  output += "produto "+ i +":R$ "+2.20 +"/n";
                }

                output+="total: R$ "+ total;

                System.out.println("total: R$ "+ total);
                System.out.println("entre com o valor pago");
                valorapagar=scan.nextInt();

                output += "dinheiro: R$ "+ valorapagar + "\n";

                troco=total-valorapagar;

                output += "trco: R$ "+ troco + "\n";
                System.out.println(output);
            }else {
                sair =true;
            }

        }while (!sair);
    }
}
