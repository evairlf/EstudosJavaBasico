package estudos.aula15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o turno em que estuda: \nM-Matutino, V-Vespertino, N-Noturno\n");
		String turno = sc.next();
		
		if(turno.equalsIgnoreCase("Matutino")||turno.equalsIgnoreCase("M")) {
			System.out.println("Bom Dia!");
		}else if(turno.equalsIgnoreCase("Vespertino")||turno.equalsIgnoreCase("V")) {
			System.out.println("Boa Tarde!");
		}else if(turno.equalsIgnoreCase("Noturno")||turno.equalsIgnoreCase("N")) {
			System.out.println("Boa Noite!");
		}else {
			System.out.println("Valor Inválido!");
		}
	}

}
