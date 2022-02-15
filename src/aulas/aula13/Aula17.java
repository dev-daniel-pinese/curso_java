package aulas.aula13;

public class Aula17 {
    public static void main(String[] args) {
        //o for vai percorrer se for menor ou igual a 5
        for (int i =0; i <=5 ; i++){
            System.out.println(i);
        }
        //o for vai percorrer o j e o n
        for (int n =0,j =10; n < j ;n++,j--){
            System.out.println(n+" = "+ j);
        }
        int cont = 0;
        for (; cont <5;);
        System.out.println(cont);
        cont += 2;
    }
}
