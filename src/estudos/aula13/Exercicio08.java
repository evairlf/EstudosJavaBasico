package estudos.aula13;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[]Args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Quanto voce ganha por hora?");
	
	double horas = sc.nextDouble();
	
	System.out.println("Quantas horas voce trabalha no mês?");
	
	int horasMes = sc.nextInt();
	double salario = horas*horasMes;
	double salarioImpRenda = salario*0.11;
	double salarioInss = salario*0.08;
	double salarioSindicato = salario*0.05;
	double descontototal = salarioImpRenda+salarioInss+salarioSindicato;
	double salarioLiquido = salario - descontototal;
	
	System.out.printf("\nNeste mês voce ganhou bruto: %.2f Reais",salario);
	System.out.printf("\nNeste mês voce ganhou com desconto de Imposto de Renda: %.2f",salarioImpRenda," Reais");
	System.out.printf("\nNeste mês voce ganhou com desconto INSS: %.2f Reais",salarioInss);
	System.out.printf("\nNeste mês voce ganhou com desconto do sindicato: %.2f Reais",salarioSindicato);
	System.out.printf("\nNeste mês voce ganhou Liquido: %.2f Reais",salarioLiquido);
	System.out.printf("\nNeste mês o governo roubou: %.2f Reais",descontototal);
}
}