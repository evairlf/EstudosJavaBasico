package estudos.aula44.figuras;

public class Cilindro extends Figura3D{
	private double raio;
	private double altura;
	
	
	
	public Cilindro() {
		super.setTipo("FIGURA 3D");
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		return Math.PI * Math.pow(raio, 2) * altura;
		
	}

	@Override
	public double calcularArea() {
		double areaBase = Math.PI * Math.pow(raio, 2);
		double areaLateral = 2 * Math.PI * raio * altura;
		double areaTotal = (2 * areaBase) * areaLateral;
		return areaTotal;
	}

	@Override
	public String toString() {
		return super.toString()+"\nRaio: " + raio + "\nAltura: " + altura + "\nVolume: " + calcularVolume()
				+ "\nArea: " + calcularArea();
	}

	
	
}
