package estudos.aula17;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		int base = sc.nextInt();
		System.out.println("Digite o expoente: ");
		int expoente = sc.nextInt();
		int resultado = 1;
		
		for(int i=0;i<expoente;i++) {
			resultado *=base;
		}
		
		System.out.println("Resultado: "+resultado);

	}

}
