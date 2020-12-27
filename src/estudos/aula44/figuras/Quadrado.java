package estudos.aula44.figuras;

public class Quadrado extends Figura2D {
	private int lado;
	
	
	public Quadrado() {
		super.setTipo("Figura2D");
	}
	
	public int getLado() {
		return lado;
	}



	public void setLado(int lado) {
		this.lado = lado;
	}



	@Override
	public double calcularArea() {
		return (int) Math.pow(lado, 2);
	}



	@Override
	public String toString() {
		return super.toString() + "\nArea:" + calcularArea();
	}



	
	
}