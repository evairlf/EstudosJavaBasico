package estudos.aula13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("qual o diametro do circulo?");
		int circulo = sc.nextInt();
		double raio = (circulo*circulo*Math.PI);
		System.out.println("O raio do circulo é: "+raio);
	}

}
