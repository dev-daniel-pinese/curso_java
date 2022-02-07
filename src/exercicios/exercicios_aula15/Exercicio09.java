package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        if (n1<= n2 && n1<=n3 && n2<= n3) {
            System.out.println(n3 + "-" + n2 + "-" + n3);
        }else if (n1<= n2 && n1<=n3 && n3<= n2) {
            System.out.println(n3 + "-" + n1 + "-" + n2);
        }else if (n2<= n1 && n2<=n3 && n1<= n3) {
                    System.out.println(n3 + "-" + n1 + "-" + n2);
        }else if (n2<= n1 && n2<=n3 && n3<= n1) {
            System.out.println(n2 + "-" + n3 + "-" + n1);
        }else if (n3<= n1 && n3<=n2 && n1<= n2) {
            System.out.println(n1 + "-" + n3 + "-" + n2);
        }else if (n3<= n1 && n3<=n2 && n2<= n1) {
            System.out.println(n2 + "-" + n3 + "-" + n1);


            {
                    {
                }
            }
        }
    }
}
