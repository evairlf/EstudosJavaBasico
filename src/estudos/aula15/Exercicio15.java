package estudos.aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triangulo: ");
		int lado1 = sc.nextInt();
		System.out.println("Digite o segundo lado do triangulo: ");
		int lado2 = sc.nextInt();
		System.out.println("Digite o terceiro lado do triangulo: ");
		int lado3 = sc.nextInt();
		
		if(lado1==lado2 && lado2==lado3) {
			System.out.println("Triangulo Equil�tero!");
		}else if(lado1==lado2 || lado2==lado3 || lado1==lado3) {
			System.out.println("Triangulo Is�sceles!");
		}else if(lado1!=lado2 && lado2!=3 && lado1!=lado3) {
			System.out.println("Triangulo Escaleno!");
		}else if(lado1+lado2 > lado3 || lado2+lado3 > lado1 || lado1+lado3 > lado2) {
			System.out.println("� um tri�ngulo!");
			
		}
	}
}
