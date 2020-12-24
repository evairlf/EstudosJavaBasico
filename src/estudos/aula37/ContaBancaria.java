package estudos.aula37;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;

	public ContaBancaria() {
		metodoNum();
	}

	public ContaBancaria(String nome, double saldo) {
		this.nomeCliente = nome;
		this.saldo = saldo;

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public void metodoNum() {
		this.numConta = (int) (Math.random() + 567);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double saque) {
		if (saque <= saldo) {
			saldo -= saque;
		} else {
			System.out.println("SALDO INSUFICIENTE!");
		}
	}

	public void depositar(double deposito) {
		saldo += deposito;
	}

	@Override
	public String toString() {
		return "Conta Bancaria Comum\nNome do Cliente: " + getNomeCliente() + "\nNº da Conta: " + getNumConta()
				+ "\nSaldo: " + getSaldo()+"\n----------------------------";
	}

}