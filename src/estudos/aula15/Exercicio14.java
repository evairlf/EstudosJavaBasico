package estudos.aula15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		double media = (nota1+nota2)/2;
		
		if(media <= 4) {
			System.out.printf("Suas notas são: \nNota 1: %.2f\nNota 2: %.2f\nMedia: %.2f - E\nREPROVADO!",nota1,nota2,media);	
		}else if(media > 4 && media <=6) {
			System.out.printf("Suas notas são: \nNota 1: %.2f\nNota 2: %.2f\nMedia: %.2f - D\nREPROVADO!",nota1,nota2,media);
		}else if(media >6 && media <= 7.5) {
			System.out.printf("Suas notas são: \nNota 1: %.2f\nNota 2: %.2f\nMedia: %.2f - C\nAPROVADO PARABENS!",nota1,nota2,media);
		}else if(media > 7.5 && media <=9) {
			System.out.printf("Suas notas são: \nNota 1: %.2f\nNota 2: %.2f\nMedia: %.2f - B\nAPROVADO PARABENS!",nota1,nota2,media);
		}else if(media > 9 && media <=10) {
			System.out.printf("Suas notas são: \nNota 1: %.2f\nNota 2: %.2f\nMedia: %.2f - A\nAPROVADO PARABENS!",nota1,nota2,media);
		}
		
	}

}
