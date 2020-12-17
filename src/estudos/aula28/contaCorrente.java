package estudos.aula28;

import java.text.DecimalFormat;

public class contaCorrente {
	DecimalFormat dc = new DecimalFormat("###,###.##");
	private String numero;
	private boolean especial = false;
	private double saldo;
	private double limiteEspecial;

	public contaCorrente(String numero, boolean especial, double saldo, double limiteEspecial) {
		this.numero = numero;
		this.especial = especial;
		this.saldo = saldo;
		this.limiteEspecial = limiteEspecial;

	}

	public contaCorrente(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public boolean getEspecial() {
		return especial;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSaldo() {
		return dc.format(saldo);
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public double saque(double saque) {
		if (getEspecial()) {
			if (saque <= saldo) {
				System.out.println("Saque feito com sucesso!");
				return saldo;
			} else if (saque <=(saldo+limiteEspecial)) {
				System.out.println("Saque feito com sucesso!");
				saldo -= saque;
				limiteEspecial += saldo;
				return saldo;
			} else {
				System.out.println("Saldo insuficiente!");
						return saldo;
			}
				
		} else if(saque <= saldo) {
			saldo -= saque;
			return saque;
		}else {
			System.out.println("Saldo insuficiente");
			return saldo;
		}
		}

	

	public boolean estaUsandoLimiteEspecial() {
		if (saldo < 0) {
			return true;
		} else {
			return false;
		}
	}
	public void depositar(double deposito) {
		saldo += deposito;
	}
}