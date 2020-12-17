package estudos.aula20;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] agenda = new String[30][24];
		boolean confirm = true;
		boolean sair = true;
		char confirma;
		int hora;
		int dia;
		
		do {
			dia = 0;
			hora = 0;
		System.out.println("Digite o dia que quer agendar algo: ");
		dia = sc.nextInt();
		System.out.println("Digite a hora do dia que deseja: ");
		hora = sc.nextInt();
		do {
		if(dia<30 && hora<24) {
			do {
				System.out.println("Digite o compromisso: ");
				agenda[dia][hora] = sc.nextLine();
				agenda[dia][hora] += sc.nextLine();
				System.out.println("Compromisso registrado com sucesso!");
				System.out.println("Deseja registrar outro?");
				confirma = sc.next().charAt(0);
				if(confirma == 's' || confirma == 'S') {
					sair = true;
					confirm = false;
				}else {
					System.out.println("Tah vlw flw");
					sair = false;
					confirm = false;
				}
			}while(confirm);
		}else {
			System.out.println("Nº invalido!");
			System.out.println("Deseja tentar novamente?");
			confirma = sc.next().charAt(0);
			if(confirma == 's' || confirma == 'S') {
				sair = true;
				confirm = true;
			}else {
				System.out.println("Tah vlw flw");
				sair = false;
				confirm = false;
			}
		}
		}while(confirm);
	}while(sair);
		System.out.println("Qual dia e hora voce deseja consultar?");
		dia = sc.nextInt();
		System.out.println("Agora a hora: ");
		hora = sc.nextInt();
		
		if(hora == 0) {
		for(;dia<agenda.length;) {
			System.out.println("Compromisso dia -- "+(dia+1));
			for(int j = 0;j<24;j++) {
				System.out.println("Hora :"+(j+1)+" Compromisso: "+agenda[dia][j]);
			}
		}
	}else {
		for(;dia<dia;) {
			System.out.println("Compromisso dia -- "+(dia));
			for(int j = 0;j<24;j++) {
				System.out.println("Hora :"+(j+1)+" Compromisso: "+agenda[dia][hora]);
			}
		}
	}
		}
}