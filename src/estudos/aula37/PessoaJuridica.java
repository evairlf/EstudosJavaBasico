package estudos.aula37;

import java.text.DecimalFormat;


public class PessoaJuridica extends Pessoa {
DecimalFormat dc = new DecimalFormat("###,###.##");
private String cnpj;
private long rendaBruta;

public String getCNPJ() {
	
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public double getRendaBruta() {
	return rendaBruta;
}
public void setRendaBruta(long rendaBruta) {
	this.rendaBruta = rendaBruta;
}

public long impostoASerPago() {
	return (long) (rendaBruta * 0.10);
}
@Override
public String toString() {
	return "Pessoa Juridica\n------------------------------\nNome Empresa:" + getNome()+"\nCNPJ: " + cnpj + "\nRenda Bruta: " + dc.format(rendaBruta)+"\nImposto a ser pago: "+dc.format(impostoASerPago());
}

}