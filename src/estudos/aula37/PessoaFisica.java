package estudos.aula37;

public class PessoaFisica extends Pessoa {
private String cpf;
private double salario;

public PessoaFisica() {}

public PessoaFisica(String cpf, double salario) {
	super();
	this.cpf = cpf;
	this.salario = salario;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public double calculaImposto() {
	if(salario > 0 && salario <= 1400) {
		return 0;
	}else if(salario > 1400 && salario <=2100) {
		return salario * 0.10;
	}else if(salario > 2100 & salario <=2800) {
		return salario * 0.15;
	}else if(salario > 2800 && salario <= 3600) {
		return salario * 0.25;
	}else if(salario > 3600) {
		return salario * 0.3;
	}else {
		System.out.println("Salario invalido!");
		return (Double) null;
	}
	}

@Override
public String toString() {
	return "PessoaFisica\n------------------------------\nNome: " +getNome()+"\nCPF: " + cpf + "\nSalario: " + salario+"\nImposto a ser pago: "+calculaImposto();
}

}