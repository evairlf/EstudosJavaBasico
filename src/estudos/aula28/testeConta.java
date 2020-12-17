package estudos.aula28;

import java.text.DecimalFormat;

public class testeConta {
	public static void main(String[] args) {
		DecimalFormat dc = new DecimalFormat("###,###.##");
		contaCorrente conta = new contaCorrente("32-1234/x", 500.54);
		contaCorrente conta2 = new contaCorrente("32-1234/x",true,500, 500.54);
		conta.saque(510);
		System.out.println("Saldo: "+conta.getSaldo());
		conta.depositar(500);
		System.out.println("Saldo: "+conta.getSaldo());
		conta.saque(720.32);
		System.out.println("Saldo: "+conta.getSaldo());

		System.out.println("Conta 2:");
		
		System.out.println("Saldo: "+conta2.getSaldo());
		conta2.saque(510);
		System.out.println("Saldo: "+conta2.getSaldo());
		conta2.saque(300);
		if(conta2.estaUsandoLimiteEspecial()) {
			System.out.println("Limite restante: "+dc.format(conta2.getLimiteEspecial()));
		}
		System.out.println("Saldo: "+conta2.getSaldo());
	}
}