package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        //se n1 menor iqual n2 e n1 menor iqual n1 menor iqual que n3
        if (n1<= n2 && n1<=n3 && n2<= n3) {
            System.out.println(n3 + "-" + n2 + "-" + n3);
            //se n1 menor ou iqual n2 e n1 menor ou iqual n3 menor ou iqual n3 menor ou iqual que n2
        }else if (n1<= n2 && n1<=n3 && n3<= n2) {
            System.out.println(n3 + "-" + n1 + "-" + n2);
            //se n2 menor ou iqual n1 e n2 menor ou iqual n3 menor ou iqual n1 menor ou iqual que n3
        }else if (n2<= n1 && n2<=n3 && n1<= n3) {
                    System.out.println(n3 + "-" + n1 + "-" + n2);
                    //se n1 menor ou iqual n2 e n1 menor ou iqual n3 menor ou iqual n3 menor ou iqual que n1
        }else if (n2<= n1 && n2<=n3 && n3<= n1) {
            System.out.println(n2 + "-" + n3 + "-" + n1);
            //se n3 menor ou iqual n1 e n2 menor ou iqual n3 menor ou iqual n1 menor ou iqual que n2
        }else if (n3<= n1 && n3<=n2 && n1<= n2) {
            System.out.println(n1 + "-" + n3 + "-" + n2);
            //se n3 menor ou iqual n1 e n2 menor ou iqual n3 menor ou iqual n2 menor ou iqual que n1
        }else if (n3<= n1 && n3<=n2 && n2<= n1) {
            System.out.println(n2 + "-" + n3 + "-" + n1);


            {
                    {
                }
            }
        }
    }
}
