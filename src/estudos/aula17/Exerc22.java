package estudos.aula17;

import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos cds voce tem na cole��o?");
		int cds = sc.nextInt();
		double media = 0;
		double resultado;
		
		for (int i = 0; i < cds; i++) {
			System.out.println("Informe o valor do "+(i+1)+"� CD: ");
			double valor = sc.nextDouble();
			media += valor;
			
		}
		resultado = (double)media/cds;
		System.out.printf("A m�dia paga pelos cds � %.2f\n e o total de cds � %d",resultado,cds);
	}

}
