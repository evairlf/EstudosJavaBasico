package estudos.aula13;

import java.util.Scanner;

public class Exercicio03 {
public static void main(String[]Args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro n�mero: ");
	int num1 = sc.nextInt();
	System.out.println("Digite o segundo n�mero: ");
	int num2 = sc.nextInt();
	int soma = num1+num2;
	int modulo = soma%2;
	
	System.out.println("A soma dos dois n�meros �: "+ soma+"\n\rE o resto da divis�o por 2 �: "+modulo);
}
}
