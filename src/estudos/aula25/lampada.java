package estudos.aula25;

public class lampada {
private String marca;
private String modelo;
private int potencia;
private String voltagem;
private String tipo;
public lampada(String marca,String modelo,int potencia,String voltagem,String tipo) {
	this.marca = marca;
	this.modelo = modelo;
	this.potencia = potencia;
	this.tipo = tipo;
	this.voltagem = voltagem;
}
public void ligaEDesliga(boolean ligaOuDesliga) {
	if(ligaOuDesliga) {
		System.out.println("Lamps desligada!");
		ligaOuDesliga = false;
	}else {
		System.out.println("Lamps Ligada!");
		ligaOuDesliga = true;
	}
}
}