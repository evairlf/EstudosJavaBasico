package estudos.aula13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos MB tem o Download?");
		double mega = sc.nextDouble();
		System.out.println("Qual a velocidade da internet?");
		double velo = sc.nextDouble()/8;
		
		double tempin = mega/velo/60;
		System.out.println(""+velo);
		System.out.printf("O Download terminará em: %.1f Minutos",tempin);
	}

}