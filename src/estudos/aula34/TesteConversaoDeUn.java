package estudos.aula34;

import java.text.DecimalFormat;

public class TesteConversaoDeUn {
	static DecimalFormat dec = new DecimalFormat("###,###.##");
	public static void main(String[] args) {
		
		imprimeTela(ConversaoDeUnidades.metroEmPesQuadrados(10));
		imprimeTela(ConversaoDeUnidades.milhaQuadEmAcre(10));
		imprimeTela(ConversaoDeUnidades.pesQuadEmCmQuad(10));
		imprimeTela(ConversaoDeUnidades.acreEmPes(10));

	}
	
	private static void imprimeTela(double num) {
		System.out.println(dec.format(num));
	}
}
