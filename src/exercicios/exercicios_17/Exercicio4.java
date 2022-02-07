package exercicios.exercicios_17;

public class Exercicio4 {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int cont = 0;
        while (popA <= popB) {
            popA += (popA / 100) *3;
            popB += (popB / 100)*1.5;
        }
        System.out.println("populacao a"+ popA);
        System.out.println("populacao a"+ popB);
        System.out.println("qtd anos " +cont);
    }
}