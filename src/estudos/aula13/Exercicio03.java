package estudos.aula13;

import java.util.Scanner;

public class Exercicio03 {
public static void main(String[]Args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro número: ");
	int num1 = sc.nextInt();
	System.out.println("Digite o segundo número: ");
	int num2 = sc.nextInt();
	int soma = num1+num2;
	int modulo = soma%2;
	
	System.out.println("A soma dos dois números é: "+ soma+"\n\rE o resto da divisão por 2 é: "+modulo);
}
}
