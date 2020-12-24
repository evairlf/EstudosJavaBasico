package estudos.aula37;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TesteContas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ContaBancaria> lista = new ArrayList<ContaBancaria>();
		boolean sair = false;
		int opcao;
		String operacao = null;

		while (!sair) {
			boolean comida = true;
			System.out.print("1 -> Conta Comum\n2 -> Conta Bancaria especial" + "\n3 -> Conta Poupanca");
			opcao = sc.nextInt();
			switch (opcao) {
			
			case 1:
				ContaBancaria conta = new ContaBancaria();
				System.out.println("Digite seu nome: ");
				sc.next();
				conta.setNomeCliente(sc.nextLine());
				System.out.println("Digite o saldo: ");
				conta.setSaldo(sc.nextDouble());
				conta.metodoNum();
				comida = true;
				do {
					// verifica se quer fazer alguma coisa
					System.out.print("\n1 -> Saque\n2 -> Deposito");
					opcao = sc.nextInt();
					switch (opcao) {

					case 1:
						System.out.println("Digite o valor a sacar: ");
						conta.sacar(sc.nextDouble());
						System.out.println(conta.getSaldo());
						break;

					case 2:
						System.out.println("Digite o deposito: ");
						conta.depositar(sc.nextDouble());
						System.out.println(conta.getSaldo());
						break;

					}
					System.out.println("Deseja efeturar mais alguma operação?");
					operacao = sc.next();
					if (operacao.equalsIgnoreCase("S") || operacao.equalsIgnoreCase("Sim")) {

					} else {
						System.out.println("Obrigada por utilizar nossos serviços!");
						comida = false;
					}
					
				} while (comida);
				lista.add(conta);
				break;
			case 2:
				ContaEspecial especial = new ContaEspecial();
				System.out.println("Digite seu nome: ");
				especial.setNomeCliente(sc.nextLine());
				especial.setNomeCliente(sc.nextLine());
				System.out.println("Digite o saldo: ");
				especial.setSaldo(sc.nextDouble());
				especial.metodoNum();
				System.out.println("Digite o seu limite: ");
				especial.setLimite(sc.nextDouble());
				comida = true;
				do {
					// verifica se quer fazer alguma coisa
					System.out.print("\n1 -> Saque\n2 -> Deposito\n3 -> Ver saldo: ");
					opcao = sc.nextInt();
					switch (opcao) {

					case 1:
						System.out.println("Digite o valor a sacar: ");
						especial.sacar(sc.nextDouble());
						System.out.println(especial.getSaldo());
						break;

					case 2:
						System.out.println("Digite o deposito: ");
						especial.depositar(sc.nextDouble());
						System.out.println(especial.getSaldo());
						break;
						
					case 3:
						System.out.println(especial.getSaldo());
						break;

					}
					System.out.println("Deseja efeturar mais alguma operação?");
					operacao = sc.next();
					if (operacao.equalsIgnoreCase("S") || operacao.equalsIgnoreCase("Sim")) {

					} else {
						System.out.println("Obrigada por utilizar nossos serviços!");
						comida = false;
					}
					
					
				} while (comida);
				lista.add(especial);
				break;
				
			case 3:
				ContaPoupanca poupanca = new ContaPoupanca();
				System.out.println("Digite seu nome: ");
				poupanca.setNomeCliente(sc.nextLine());
				poupanca.setNomeCliente(sc.nextLine());
				System.out.println("Digite o saldo: ");
				poupanca.setSaldo(sc.nextDouble());
				poupanca.metodoNum();
				comida = true;
				do {
					// verifica se quer fazer alguma coisa
					System.out.print("\n1 -> Saque\n2 -> Deposito\n3 -> Ver saldo: \n4 -> Adcionar dias: \n5 -> ver Rendimentos:  ");
					opcao = sc.nextInt();
					switch (opcao) {

					case 1:
						System.out.println("Digite o valor a sacar: ");
						poupanca.sacar(sc.nextDouble());
						System.out.println(poupanca.getSaldo());
						break;

					case 2:
						System.out.println("Digite o deposito: ");
						poupanca.depositar(sc.nextDouble());
						System.out.println(poupanca.getSaldo());
						break;
						
					case 3:
						System.out.println(poupanca.getSaldo());
						break;
						
					case 4:
						System.out.println("Digite quantos dias deseja adcionar: ");
						poupanca.addDias(sc.nextInt());
						poupanca.retornaDias();
						break;
						
					case 5:
						System.out.println(poupanca.rendimentos());
						break;

					}
					System.out.println("Deseja efeturar mais alguma operação?");
					operacao = sc.next();
					if (operacao.equalsIgnoreCase("S") || operacao.equalsIgnoreCase("Sim")) {

					} else {
						System.out.println("Obrigada por utilizar nossos serviços!");
						comida = false;
					}
					
					
				} while (comida);
				lista.add(poupanca);
				break;
			}
			System.out.println("Deseja Criar outra conta?");
			operacao = sc.next();
			if (operacao.equalsIgnoreCase("S") || operacao.equalsIgnoreCase("Sim")) {

			} else {
				System.out.println("Obrigada por utilizar nossos serviços!");
				sair = true;
			}
		}
		System.out.println("Print das Contas");
		System.out.println("-------------------");
		System.out.println(lista.toString().replace("[", "").replace("]", ""));

	}
}