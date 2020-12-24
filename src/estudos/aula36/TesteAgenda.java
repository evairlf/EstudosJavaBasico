package estudos.aula36;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteAgenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda: ");
		String nome = sc.nextLine();
		Agenda agenda = new Agenda(nome);
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0;i<contatos.length;i++) {
			System.out.println("Informações do "+(i+1)+"º Contato: ");
			Contato c = new Contato();
			System.out.println("Digite o nome: ");
			c.setNome(sc.nextLine());
			System.out.println("Digite o email: ");
			c.setEmail(sc.nextLine());
			System.out.println("Digite o telefone: ");
			c.setTelefone(sc.nextLine());
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
		if(agenda != null) {
		System.out.println(agenda.exibeInformacao());
		}
		}
	}