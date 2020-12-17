package estudos.aula17;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadastro: ");
		boolean confirmacao = false;
		
		do {
			System.out.println("Digite seu Nome: ");
			String nome = sc.nextLine();
			if(String.valueOf(nome).length()<3){
				System.out.println("Nome inválido!");
				continue;
			}
			System.out.println("Digite a Idade: ");
			int idade = sc.nextInt();
			if ( idade < 0 || idade > 150) {
				System.out.println("Idade Invalida");
				continue;
			}
			System.out.println("Digite o Salário: ");
			double salario = sc.nextDouble();
			if(salario <= 0) {
				System.out.println("Salário Invalido!");
				continue;
			}
			System.out.println("Digite o sexo: M-Masculino F-Feminino");
			String sexo = sc.next();
			if(sexo.charAt(0) != ('M') && sexo.charAt(0) != ('m') && sexo.charAt(0) != ('F') && sexo.charAt(0)!=('f')){
				System.out.println("Sexo Invalido!");
				continue;
			}
			System.out.println("Digite o estado civil: ");
			String estadoCiv = sc.next();
			if(estadoCiv.charAt(0) != ('S') && estadoCiv.charAt(0) != ('C') && estadoCiv.charAt(0) != ('V') && estadoCiv.charAt(0) != ('D')) {
				System.out.println("Estado Civil Invalido!");
				continue;
			}
			System.out.println("---Dados Cadastrados---");
			System.out.println("Nome: "+nome);
			System.out.println("Idade: "+idade);
			System.out.printf("Salario: %.2f\n",salario);
			System.out.println("Sexo: "+sexo);
			System.out.println("estado Civil: "+estadoCiv);
			confirmacao = true;
			
		}while(confirmacao == false);

	}

}
