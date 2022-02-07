package exercicios.exercicios_17;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valido = false;
        double popA ;
        double popB ;
        double taxaA;
        double taxab;
        do {
            System.out.println("entre com a populacao A:");
            popA = scan.nextDouble();
            if (popA > 0){
                valido = true;
            }else {
                System.out.println("populacao a precisa ser maior que 0.");
            }
        }while (!valido);
        do {
            System.out.println("entre com a populacao B:");
            popB = scan.nextDouble();
            if (popB > 0){
                valido = true;
            }else {
                System.out.println("populacao B precisa ser maior que 0.");
            }
        }while (!valido);
        do {
            System.out.println("entre com a taxa A:");
            taxaA = scan.nextDouble();
            if (taxaA > 0){
                valido = true;
            }else {
                System.out.println("a taxa precisa ser maior que 0.");
            }
        }while (!valido);

        do {
            System.out.println("entre com a taxa b:");
            taxab = scan.nextDouble();
            if (taxab > 0){
                valido = true;
            }else {
                System.out.println("a taxa B precisa ser maior que 0.");
            }
        }while (!valido);





        int cont = 0;
    while (popA < popB) {
            popA += (popA / 100) *taxaA;
            popB += (popB / 100)*taxab;
            cont++;
        }
        System.out.println("populacao a"+ popA);
        System.out.println("populacao a"+ popB);
        System.out.println("qtd anos " +cont);

    }
}
