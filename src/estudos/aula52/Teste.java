package estudos.aula52;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato[] contatos = new Contato[10];
		Contato c;
		
		
		for(int i = 0;i<3;i++) {
			c = new Contato();
			System.out.println("Digite o nome: ");
			try {
				c.setNome(sc.next());
			}catch(Exception exc) {
				System.out.println(exc.getMessage());
			}
			
			
			System.out.println("Digite o DDD: ");
			try {
				c.setDdd(sc.nextInt());
			}catch(Exception exc) {
				System.out.println(exc.getMessage());
			}
			
			System.out.println("Digite o numero: ");
			try {
				c.setTelefone(sc.nextInt());
			}catch(Exception exc) {
				System.out.println(exc.getMessage());
			}
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
			System.out.println(agenda.toString()!=null);

	}

}