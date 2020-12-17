package estudos.aula15;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[]Args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas horas trabalha no mês: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Digite quanto ganha a hora: ");
		double hora = sc.nextDouble();
		double salario = (double)horasTrabalhadas*hora;
		double ir;
		double fgts = salario*0.11;
		double inss = salario*0.1;
		
		if(salario >900 && salario<=1500) {
			ir = salario*0.5;
			System.out.printf("Salario bruto: %.2fRS\nDesconto IR %.2fRS\nDesconto INSS: %.2f\nFGTS: %.2f\nTotal de Descontos: %.2f\nSalário Liquido: %.2f",salario,ir,inss,fgts,(ir+inss),(salario-(ir+inss)));
					}else if(salario > 1500 && salario <= 2500) {
			ir = salario*0.1;
			System.out.printf("Salario bruto: %.2fRS\nDesconto IR %.2fRS\nDesconto INSS: %.2f\nFGTS: %.2f\nTotal de Descontos: %.2f\nSalário Liquido: %.2f",salario,ir,inss,fgts,(ir+inss),(salario-(ir+inss)));
					}else if(salario >2500) {
			ir = salario*0.2;
			System.out.printf("Salario bruto: %.2fRS\nDesconto IR %.2fRS\nDesconto INSS: %.2f\nFGTS: %.2f\nTotal de Descontos: %.2f\nSalário Liquido: %.2f",salario,ir,inss,fgts,(ir+inss),(salario-(ir+inss)));
					}else {
						System.out.println("Informação invalida!");
					
		}
	}
}
