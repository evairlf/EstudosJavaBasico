package estudos.aula15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tipo de combustivel A-Alcool/G-Gasolina");
		double gasolina = 2.50;
		double alcool = 1.90;
		double pagar;
		boolean sai = true;
		
		do {
			String combustivel = sc.next();
		if(combustivel.equalsIgnoreCase("G")||combustivel.equalsIgnoreCase("Gasolina")) {
			System.out.println("Quantos litros deseja abastecer?");
			double litrosGas = sc.nextInt();
			sai = false;
			
			if(litrosGas > 0 && litrosGas <=20) {
				pagar = gasolina*litrosGas-(litrosGas*0.04);
				System.out.printf("Foram abastecidos %.1f Litros de Gasolina\nValor a pagar: %.2f",litrosGas,pagar);
			}else if(litrosGas>20) {
				pagar = gasolina*litrosGas-(litrosGas*0.06);
				System.out.printf("Foram abastecidos %.1f Litros de Gasolina\nValor a pagar: %.2f",litrosGas,pagar);
			}
		}else if(combustivel.equalsIgnoreCase("A")||combustivel.equalsIgnoreCase("Alcool")) {
			System.out.println("Quantos litros deseja abastecer?");
			double litrosAlc = sc.nextInt();
			sai = false;
			
			if(litrosAlc > 0 && litrosAlc <=20) {
				pagar = alcool*litrosAlc-(litrosAlc*0.03);
				System.out.printf("Foram abastecidos %.1f Litros de Alcool\nValor a pagar: %.2f",litrosAlc,pagar);
			}else if(litrosAlc>20) {
				pagar = alcool*litrosAlc-(litrosAlc*0.05);
				System.out.printf("Foram abastecidos %.1f Litros de Alcool\nValor a pagar: %.2f",litrosAlc,pagar);
			}
		}else
			System.out.println("Digite o tipo de combustivel A-Alcool/G-Gasolina");
			sai = true;
		}while(sai == true);
}
}