package estudos.aula15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario do coolaborador que será reajustado: ");
		double salario = sc.nextDouble();
		double aumento = 0;
		
		if(salario <= 280) {
			aumento = salario*0.2;
			System.out.printf("O salario antes do aumento era: %.2fRS\nforam acrescentados 20 porcento de aumento equivalente a: %.2fRS\nO salário atual é: %.2f\n",salario,aumento,(salario+aumento));
					}else if(salario >280 && salario<700) {
			aumento = salario*0.15;
			System.out.printf("O salario antes do aumento era: %.2fRS\nforam acrescentados 15 porcento de aumento equivalente a: %.2fRS\nO salário atual é: %.2f\n",salario,aumento,(salario+aumento));
					}else if(salario >700 && salario < 1500) {
			aumento = salario*0.1;
			System.out.printf("O salario antes do aumento era: %.2fRS\nforam acrescentados 10 porcento de aumento equivalente a: %.2fRS\nO salário atual é: %.2f\n",salario,aumento,(salario+aumento));
					}else if(salario >= 1500) {
			aumento = salario*0.05;
			System.out.printf("O salario antes do aumento era: %.2fRS\nforam acrescentados 5 porcento de aumento equivalente a: %.2fRS\nO salário atual é: %.2f\n",salario,aumento,(salario+aumento));
					
		}
		}
		}