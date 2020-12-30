package estudos.aula52;

import java.util.Random;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Agenda agenda = new Agenda();
		Contato[] contatos = new Contato[3];
		int opcao = 0;
		String nome = null;
		boolean coco = false;
		int id = 0;
		Contato cont = new Contato();

		/*
		 * cont.setDdd(51); cont.setNome("SurupiSurupi"); cont.setTelefone(998607070);
		 * contatos[0] = cont; agenda.setContatos(contatos);
		 */

		try {
			System.out.println("Digite o nome da agenda: ");
			agenda.setNome(sc.nextLine());
			if (agenda.getNome().equals("")) {
				agenda.setNome("Nome Padrão");
			}
		} catch (Exception exc) {

			System.out.println(exc.getMessage());
			exc.printStackTrace();

		}

		while (!coco) {

			do {
				System.out.println("O que deseja fazer?");
				System.out.println("Menu: \n1 -> Consultar Contato\n2 -> Cadastrar Contato\n3 -> Sair");
				try {
					opcao = sc.nextInt();
					if (opcao < 0 || opcao > 3) {
						coco = true;
					} else {
						coco = false;
					}
				} catch (Exception exc) {
				}
			} while (coco);
			switch (opcao) {
			case 1:
				try {
					agenda.getContato(0).getNome();
				} catch (Exception exc) {
					System.out.println("Lista de Contatos vazia!");
					break;
				}
				System.out.println("Digite o nome do contato");
				nome = sc.nextLine();
				try {
					nome = sc.nextLine();
				} catch (Exception exc) {
					System.out.println("Nome invalido!");
				}
				if (nome != null) {
					for (int i = 0; i < agenda.getContatos().length; i++) {
						if (agenda.getContato(i) != null) {
							if (agenda.getContato(i).getNome().equalsIgnoreCase(nome)) {
								System.out.println("Dados do Contato: ");
								System.out.println(agenda.getContato(i).toString());
								System.out.println();
							} else {
								System.out.println("Contato não consta na Agenda: " + agenda.getNome());
								System.out.println();
							}
						}
					}
				} else {
					System.out.println("Nome nao digitado!");
				}

				break;
			case 2:
				
				do {
					try {
						System.out.println("Insira o nome do novo contato: ");
						nome += sc.nextLine();
						nome += sc.nextLine();
						cont.setNome(nome.replace("null", ""));
						
					} catch (Exception exc) {
						
						System.out.println("Nome invalido!");
						continue;
					}
					try {
						System.out.println("Insira o DDD: ");
						cont.setDdd(sc.nextInt());
					} catch (Exception exc) {
						System.out.println("DDD invalido!");
						continue;
					}
					try {
						System.out.println("Insira o numero do novo contato: ");
						cont.setTelefone(sc.nextInt());
					} catch (Exception exc) {
						System.out.println("Numero Invalido!");
						continue;
					}
					do {
					System.out.println("Tudo ok?" + cont.toString());
					char confir = sc.next().toUpperCase().charAt(0);
					if (confir == 'S') {
						if(agenda.getContador()>3) {
							System.out.println("Sem espaço para mais contatos!");
						}
						cont.setIdentificador(agenda.getContador());
						contatos[id] = cont;
						id++;
						
						coco = false;
					} else {
						System.out.println("Digite novamente!");
					}
					}while(coco);
					
				} while (coco);
				agenda.setContatos(contatos);
				break;
			case 3:
				System.out.println("Obrigado por usar este programa!");
				coco = true;
				break;

			}

		}
		System.out.println(agenda.toString());
	}

}