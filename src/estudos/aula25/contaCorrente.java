package estudos.aula25;

import java.text.DecimalFormat;

public class contaCorrente {
	private int numero;
	private double saldo;
	private boolean especial;
	private double limite;
	DecimalFormat dc = new DecimalFormat("###,###.##");
	
	public contaCorrente(int numero, double saldo, boolean especial, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
	}

	public double realizaSaque(double saque) {
		if (especial) {
			if (saque <= (saldo+limite)) {
				saldo = saldo - saque;
				System.out.println("Saque realizado com sucesso!");
				System.out.println("Saque: "+saque);
				System.out.println("Saldo: "+dc.format(saldo));
			}else {
				System.out.println("Saldo insuficiente!");
			}
		} else {
			if (saque <= saldo) {
				saldo = saldo - saque;
				System.out.println("Saque realizado com sucesso!");
				System.out.println("Saque: "+saque);
				System.out.println("Saldo: "+dc.format(saldo));
			} else {
				System.out.println("Saldo insuficiente!");
			}
		}
		return saldo;
	}

	public void depositarDinheiro(double deposito) {

		saldo = saldo + deposito;
	}

	public double consultarSaldo() {
		return saldo;
	}
	
	public boolean consultarChequeEspecial() {
		if(especial) {
			System.out.println("Conta contem cheque especial: "+limite);
			especial = true;
		}else {
			System.out.println("Conta não contem cheque especial!");
			especial = false;
		}
		return especial;
	}
}