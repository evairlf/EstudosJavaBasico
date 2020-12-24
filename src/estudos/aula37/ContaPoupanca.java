package estudos.aula37;

import java.time.LocalDate;
import java.time.Period;

public class ContaPoupanca extends ContaBancaria{
private double diaRendimento;
private double taxaPoupanca = 0.05;
LocalDate local = LocalDate.now();
LocalDate manipulada;
Period periodo;


public ContaPoupanca() {}



public ContaPoupanca(String nome, double saldo) {
	super(nome, saldo);
	super.metodoNum();
}


public void addDias(int numero) {
	this.manipulada = LocalDate.now().plusDays(numero);
}


public int retornaDias() {
	periodo = Period.between(local, manipulada);
	return periodo.getDays();
}

public double rendimentos() {
	try {
	return (getSaldo() * taxaPoupanca) * retornaDias();
	}catch(Exception e) {
		System.out.println("sem rendimentos");
	}
	return 0;
}

public double getTaxaPoupanca() {
	return taxaPoupanca;
}



public void setTaxaPoupanca(double taxaPoupanca) {
	this.taxaPoupanca = taxaPoupanca;
}



@Override
public String toString() {
	return "\nContaPoupanca\n"+"Rendimento diário: " + rendimentos() + "\nTaxa Poupanca: " + getTaxaPoupanca() + 
			"\nNome Cliente: " + getNomeCliente()
			+ "\nNumero da Conta: " + getNumConta() + "\nSaldo: " + getSaldo()+"\n----------------------------";
}


}