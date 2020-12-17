package estudos.aula17;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempTot = 1;
		boolean sair = false;
		double media = 0;
		double resultado;
		double maior = 0;
		double menor = 60;
		int numDigitados = 0;
		
		
		for(int i = 0;i<tempTot;i++)
			System.out.println("---Se quiser sair digite (Sair)----");
		do {
			System.out.println("Digite a temperatura: ");
			
			String temp = sc.next();
			if(temp.equalsIgnoreCase("sair")!= true) {
				media +=Double.parseDouble(temp);
				System.out.println("Temperatura registrada!");
				numDigitados++;
				if(Double.parseDouble(temp)>maior) {
					maior = Double.parseDouble(temp);
					
				}
				if(Double.parseDouble(temp)<menor) {
					menor = Double.parseDouble(temp);
					
				}
				
			}else {
				sair = true;
				tempTot = tempTot - 1;
			}
			
			
		}while(sair == false);
		resultado = media/numDigitados;
		System.out.printf("Resultado da temperatura média: %.1fC°\nMaior: %.1fC°\nMenor: %.1fC°",resultado,maior,menor);
	}

}
