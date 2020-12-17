package estudos.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc32 {

	public static void main(String[] args) {
		DecimalFormat dec = new DecimalFormat("##,##");
		System.out.println("Especificação Código Preço\nCachorro Quente 100 R$ 1,20\nBauru Simples 101 R$ 1,30\nBauru com ovo 102 R$ 1,50\n"
				+ "Hambúrguer 103 R$ 1,20\nCheeseburguer 104 R$ 1,30\nRefrigerante 105 R$ 1,00\nDIGITE 00 para encerrar o pedido!");
	
		Scanner sc = new Scanner(System.in);
		double resultado = 0;
		boolean sair = true;
		String output = "Nota Fiscal: \n";
		
		do {
		System.out.println("informe o código do pedido: ");
		int suitich = sc.nextInt();
		
		System.out.println("Digite a quantidade que deseja: ");
		int pedido = sc.nextInt();
		
		switch(suitich) {
		
			
			
			case 100:output += "\nCachorro Quente "+pedido+"UN R$"+dec.format(pedido*1.20);
			resultado += (pedido*1.20);break;
		    case 101:output += "\nBauru Simples "+pedido+"UN R$"+dec.format(pedido*1.30);
		    resultado += pedido*1.30;break;
			case 102:output += "\nBauru com ovo "+pedido+"UN R$"+dec.format(pedido*1.50);
			resultado += pedido*1.50;break;
			case 103:output += "\nHambúrguer "+pedido+"UN R$"+dec.format(pedido*1.20);
			resultado += pedido*1.20;break;
			case 104:output += "\nCheeseburguer"+pedido+"UN R$"+dec.format(pedido*1.30);
			resultado += pedido*1.30;break;
			case 105:output += "\nRefrigerante"+pedido+"UN R$"+dec.format(pedido*1.00);
			resultado += (pedido*1.20);break;
			case 00: System.out.println("Pedido Encerrado!\n");
			sair = false;
			default: continue;
		}
		}while(sair);
		output += "\nvalor total a pagar: R$"+dec.format(resultado);
		System.out.printf(output);
	}
}