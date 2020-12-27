package estudos.aula44.figuras;

public class Triangulo extends Figura2D{
	private double altura;
	private double base;
	
	
	public Triangulo() {
		super.setTipo("Figura2D");
	}
	
	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	@Override
	public double calcularArea() {
		return ((altura*base)/2);
	}



	@Override
	public String toString() {
		return super.toString()+"\nAltura: " + altura + "\nBase: " + base + "\nArea: " + calcularArea();
	}
	
	
	
}