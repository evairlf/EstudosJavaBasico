package estudos.aula24;

public class contaCorrente {
private int numero;
private double saldo;
private boolean especial;
private double limiteEspecial;

public contaCorrente(int numero, int saldo, boolean especial, int limiteEspecial) {
	this.numero = numero;
	this.saldo = saldo;
	this.especial = especial;
	this.limiteEspecial = limiteEspecial;
}

public void exibirDados() {
	System.out.println("Numero: "+numero);
	System.out.println("Saldo: "+saldo);
	System.out.println("Especial: "+especial);
	System.out.println("Limite Especial: "+limiteEspecial);
}
}