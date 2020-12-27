package estudos.aula44.figuras;

public class Circulo extends Figura2D{
	private int raio;
	
	public Circulo() {
		super.setTipo("Figura2D");
	}
	
	public int getRaio() {
		return raio;
	}



	public void setRaio(int raio) {
		this.raio = raio;
	}


	public double calcularArea() {
		double area = Math.pow(raio, 2)*Math.PI;
		return Math.round(area);
	}



	@Override
	public String toString() {
		return super.toString()+"\nRaio: " + raio + "\nArea: " + calcularArea();
	}



}