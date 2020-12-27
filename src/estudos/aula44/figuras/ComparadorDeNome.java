package estudos.aula44.figuras;

import java.util.Comparator;

public class ComparadorDeNome implements Comparator<FiguraGeometrica> {

	@Override
	public int compare(FiguraGeometrica o1, FiguraGeometrica o2) {
		return o1.getTipo().compareTo(o2.getTipo());
	}
}