package estudos.aula44.figuras;

public class Cubo extends Figura3D{
	private double lado;
	
	
	public Cubo() {
		super.setTipo("Figura3D");
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
		
	}

	@Override
	public double calcularArea() {
		return 6*Math.pow(lado, 2);
	}

	@Override
	public String toString() {
		return super.toString()+"\nArea: "+calcularArea()+"\nVolume: "+calcularVolume();
	}
	
}