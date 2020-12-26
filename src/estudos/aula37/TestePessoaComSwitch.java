package estudos.aula37;

import java.util.ArrayList;
import java.util.Scanner;


public class TestePessoaComSwitch {
private static boolean sair = false;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(!sair) {
			System.out.println("-------------------");
			System.out.println("Bem vindo(a) à Tortura");
			System.out.println("-------------------");
			System.out.println("Menu \n1 -> Pessoa Juridica: \n2 -> Pessoa Fisica: \n3 -> Exibir Lista: ");
			int opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				PessoaJuridica pessoaJ = new PessoaJuridica();
				System.out.println("Digite o nome");
				pessoaJ.setNome(sc.nextLine());
				pessoaJ.setNome(sc.nextLine());
				System.out.println("Digite o CNPJ");
				pessoaJ.setCnpj(sc.next());
				System.out.println("Digite o rendimento bruto");
				pessoaJ.setRendaBruta(sc.nextLong());
				System.out.print("Imposto a ser pago: "+pessoaJ.impostoASerPago()+"\n");
				pessoas.add(pessoaJ);
				System.out.println("Deseja Realizar mais alguma operação?");
				retorna(sc.next());
				break;
				
			case 2:
				PessoaFisica pessoaF = new PessoaFisica();
				System.out.println("Digite o nome");
				pessoaF.setNome(sc.next());
				pessoaF.setNome(sc.nextLine());
				System.out.println("Digite o CPF");
				pessoaF.setCpf(sc.next());
				System.out.println("Digite o salario");
				pessoaF.setSalario(sc.nextDouble());
				System.out.println("Imposto a ser pago: "+pessoaF.calculaImposto()+"\n");
				pessoas.add(pessoaF);
				System.out.println("Deseja Realizar mais alguma operação?");
				retorna(sc.next());
				break;
				
			case 3:
				if(pessoas.isEmpty()) {
					System.out.println("TA NULL QUER MOSTRAR QUE LISTA COROI?");
				}else {
					System.out.println(pessoas.toString().replace("]", "").replace("[", "").replace(",", "\n------------------------------\n"));
					System.out.println("Deseja Realizar mais alguma operação?");
					retorna(sc.next());
				}
				
				break;
			}
		}
		
	}
	public static void retorna(String retorno) {
		
		if(retorno.equalsIgnoreCase("Sim")||retorno.equalsIgnoreCase("Claro")||retorno.toUpperCase().charAt(0) == 'S') {
			sair = false;
		}else {
			System.out.println("Obrigada pela preferencia!");
			sair = true;
		}
	}
}
