package estudos.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat();
		double soma = 0;
		int estatico = 1;
		String output= "S = ";
		System.out.println("Digite quantas vezes quer fazer a sequencia: ");
		int sequencia = sc.nextInt();
		
		
		for(int i = 1, j=1;i<=sequencia;i++,j+=2) {
			output += estatico+"/"+j;
			soma+= estatico/j;
			if(i<sequencia) {
				output +=" + ";
			}
		}
		output+=" = "+soma;
		System.out.println(output);
	}

}
