package estudos.aula15;
import java.util.Scanner;

/**
 * Desenvolva um algoritmo que leia 3 valores inteiros e efetue o cálculo das
 * raízes da equação de báscara. Se não foi possível calcular as raízes, mostre
 * uma mensagem correspondente. Obs.: não é possível divisão por 0 (zero) e raiz
 * quadrada de número negativo;
 */

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();
		double b,c;
		
		if(a==0) {
			System.out.println("A é igual a zero, portando não é uma equação do segundo grau!");
		}else {
			System.out.println("Digite o valor de B: ");
			b = sc.nextDouble();
			System.out.println("Digite o valor de C: ");
			c = sc.nextDouble();
			double delta = (b * b) + (-4 * (a * c));
			System.out.println("Delta: "+delta);
			if(delta < 0) {
				System.out.println("Delta é Negativo portanto não possui uma raiz real!");
			}else if(delta == 0) {
				double x3 = ((-(b) - Math.sqrt(delta)) / (2 * a)); 
	            System.out.printf("Delta possui somente uma raiz real: %.0f",x3);
			}else if(delta > 0) {
				double x1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
				double x2 = ((-(b) - Math.sqrt(delta)) / (2 * a));
				System.out.printf("Delta possui 2 raizes reais: \nX¹: %.0f X²: %.0f",x1,x2);
			}
		}
		
	}

}