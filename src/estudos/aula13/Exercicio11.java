package estudos.aula13;

import java.util.Scanner;

public class Exercicio11 {
public static void main(String[]Args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um Número inteiro: ");
	int num1 = sc.nextInt();
	System.out.println("Digite outro Número inteiro: ");
	int num2 = sc.nextInt();
	System.out.println("Digite um Número Real: ");
	double num3 = sc.nextDouble();
	double produto = ((double)num1*2+((double)num2/2));
	double somatri = (double)num1*3+num3;
	double elevado = Math.pow(num3, 3);
	System.out.printf("\nO Resultado do produto do dobro do primeiro com metado do segundo é: %.2f",produto);
	System.out.printf("\nO Soma do triplo do primeiro com o terceiro: %.2f",somatri);
	System.out.printf("\nO terceiro elevado ao cubo: %.2f",elevado);
	}

}