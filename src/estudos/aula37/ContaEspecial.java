package estudos.aula37;

public class ContaEspecial extends ContaBancaria{
private double limite;

public ContaEspecial() {}

public ContaEspecial(String nome,double saldo,double limite) {
	super(nome, saldo);
	this.limite = limite;
}

public double getLimite() {
	return limite;
}

public void setLimite(double limite) {
	this.limite = limite;
}

public boolean usandoLimite() {
	if(getSaldo() < 0) {
		return true;
	}else {
		return false;
	}
}

public void sacar(double saque) {
	if (saque <= getSaldo()) {
		setSaldo(getSaldo() - saque) ;
	} else if(saque <= (getSaldo()+limite)) {
		setSaldo(getSaldo() - saque) ;
		System.out.println("Saque efetuado com sucesso!");
		limite += getSaldo();
	}else {
		System.out.println("SALDO INSUFICIENTE!");
	}
}

@Override
public String toString() {
	return "\nContaEspecial\nNome Cliente: "+ getNomeCliente() +"\nNumero Conta: " + getNumConta() + "\nSaldo: " + getSaldo() + "\nUsando limite Especial?"+usandoLimite()+
			"\nLimite Especial: "+limite+"\n----------------------------";
}

}