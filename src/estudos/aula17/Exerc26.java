package estudos.aula17;

import java.util.Scanner;

public class Exerc26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero inteiro que quer fazer o fatorial: ");
		int fatorial = sc.nextInt();
		System.out.print(fatorial+"! = ");
		int resultado = 0;
		
		for(int i = 0;i<fatorial;i++) {
			resultado *=(fatorial-i);
			if(fatorial-i==1) {
			System.out.print((fatorial-i));
			}else {
				System.out.print((fatorial-i)+" . ");
			}
		}
		System.out.print(" = "+resultado);
	}
}
