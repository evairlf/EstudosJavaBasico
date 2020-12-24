package estudos.aula34;

import java.text.DecimalFormat;

public class TesteConversaoUnTempo {
	static DecimalFormat dec = new DecimalFormat("###,###.##");
	public static void main(String[] args) {
		imprimeTela(ConversaoDeUnTempo.minutoEmSeg(10));
		imprimeTela(ConversaoDeUnTempo.horaEmMin(10));
		imprimeTela(ConversaoDeUnTempo.diaEmHoras(10));
		imprimeTela(ConversaoDeUnTempo.semanaEmDias(10));
		imprimeTela(ConversaoDeUnTempo.mesEmDias(10));
		imprimeTela(ConversaoDeUnTempo.anoEmDias(10));

	}
	static void imprimeTela(double num) {
		System.out.println(dec.format(num));
	}
}