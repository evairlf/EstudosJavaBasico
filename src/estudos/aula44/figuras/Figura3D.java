package estudos.aula44.figuras;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoVolumetrica, DimensaoSuperficial{

	@Override
	public String toString() {
		
		return super.toString() + "\nFigura 3D";
	}

}