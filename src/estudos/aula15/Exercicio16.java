package estudos.aula15;
import java.util.Scanner;

/**
 * Desenvolva um algoritmo que leia 3 valores inteiros e efetue o c�lculo das
 * ra�zes da equa��o de b�scara. Se n�o foi poss�vel calcular as ra�zes, mostre
 * uma mensagem correspondente. Obs.: n�o � poss�vel divis�o por 0 (zero) e raiz
 * quadrada de n�mero negativo;
 */

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();
		double b,c;
		
		if(a==0) {
			System.out.println("A � igual a zero, portando n�o � uma equa��o do segundo grau!");
		}else {
			System.out.println("Digite o valor de B: ");
			b = sc.nextDouble();
			System.out.println("Digite o valor de C: ");
			c = sc.nextDouble();
			double delta = (b * b) + (-4 * (a * c));
			System.out.println("Delta: "+delta);
			if(delta < 0) {
				System.out.println("Delta � Negativo portanto n�o possui uma raiz real!");
			}else if(delta == 0) {
				double x3 = ((-(b) - Math.sqrt(delta)) / (2 * a)); 
	            System.out.printf("Delta possui somente uma raiz real: %.0f",x3);
			}else if(delta > 0) {
				double x1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
				double x2 = ((-(b) - Math.sqrt(delta)) / (2 * a));
				System.out.printf("Delta possui 2 raizes reais: \nX�: %.0f X�: %.0f",x1,x2);
			}
		}
		
	}

}