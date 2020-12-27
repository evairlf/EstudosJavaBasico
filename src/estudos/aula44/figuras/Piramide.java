package estudos.aula44.figuras;

public class Piramide extends Figura3D{
	private double altura;
	private double arestaBase;
	private double apotema;
	private int numPolBi;
	private Figura2D base;

	public Piramide() {
		super.setTipo("Figura3D");
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public int getNumPolBi() {
		return numPolBi;
	}

	public void setNumPolBi(int numPolBi) {
		this.numPolBi = numPolBi;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
		}
		

	@Override
	public double calcularVolume() {
		if(base != null) {
		return (base.calcularArea() * altura)/3;
		}
		return 0;
	}

	@Override
	public double calcularArea() {
		if(base != null) {
			return (numPolBi * ((arestaBase*apotema)/2)) + base.calcularArea();
		}
		return 0;
	}
	

	@Override
	public String toString() {
		return super.toString()+"\nAltura: " + altura + "\nAresta Base: " + arestaBase + "\nApotema: " + apotema + "\nNumero Poligono Base:"
				+ numPolBi + "\nBase: " + base  +"\nArea: "+calcularArea()+"\nVolume: "+calcularVolume();
	}
	
	

}