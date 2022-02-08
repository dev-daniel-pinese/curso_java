package aulas.aula18;


import java.util.Scanner;

public class Aula18 {

    public static void main(String[] args) {

		/*Scanner scan = new Scanner(System.in);
		//o brek serve para sair do loop

		System.out.println("Entre com um número");
		int num = scan.nextInt();// uma variavel inteiro

		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		//for é um loop e vai aumentar 1+1
		for (int i=num; i<=max; i++){
		//
			System.out.println(i);
			//o if é o se se for aquilo é aquilo
			if (i % 7 == 0){
				System.out.println("O valor de i é: " + i);
				//
				break;
			}
		}*/
         //
		/*for (int i=0; i<=4; i++){
		//o  rotulo 1 ta indentivicado
			rotulo1: {
			//
				rotulo2: {
				//
					rotulo3: {
					//
						if (i == 1){
						//o brek so nao vai para o loop ele tabem vai executar
							break rotulo1;
						}
						if (i == 2){
						//
							break rotulo2;
							//
						}
						if (i == 3){
						//
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println(i);
		}*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i=num; i<=max; i++){
            if (i % 7 == 0){
                continue;//se o numero for dividiveu pelo numero nao vai aparecer
            }
            System.out.println("O valor de i é: " + i);
        }

    }

}