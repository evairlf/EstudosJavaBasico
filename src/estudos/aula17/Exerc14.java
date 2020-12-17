package estudos.aula17;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 10 numeros inteiros: ");
		int[] inteiros = new int[10];
		int countPar = 0;
		int countImpar = 0;
		int soma = 0;
		
		for(int i = 0;i<10;i++) {
			inteiros[i] = sc.nextInt();
			soma += inteiros[i];
			if(inteiros[i]%2==0) {
				countPar++;
			}else {
				countImpar++;
			}
		}
		System.out.println("A soma dos números é: "+soma+"\nPares: "+countPar+"\nImpares: "+countImpar);
	}

}
