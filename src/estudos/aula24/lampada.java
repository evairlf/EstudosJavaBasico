package estudos.aula24;

public class lampada {
private String marca;
private int potencia;
private String tipo;
private double valor;

public lampada(String marca,int potencia,String tipo,double valor) {
	this.marca = marca;
	this.potencia = potencia;
	this.tipo = tipo;
	this.valor = valor;	
}
void exibeDados() {
	System.out.println("Nome: "+marca);
	System.out.println("potencia: "+potencia);
	System.out.println("Tipo: "+tipo);
	System.out.println("Valor: "+valor+"W");
}

}