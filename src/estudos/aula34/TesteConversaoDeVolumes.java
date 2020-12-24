package estudos.aula34;

import java.text.DecimalFormat;

public class TesteConversaoDeVolumes {
	static DecimalFormat dec = new DecimalFormat("###,###.##");
	public static void main(String[] args) {
		imprimeNaTela(ConversaoDeVolumes.litroEmCmCubico(10));
		imprimeNaTela(ConversaoDeVolumes.metroCubicoEmLitros(10));
		imprimeNaTela(ConversaoDeVolumes.metroCubicoEmPesCub(10));
		imprimeNaTela(ConversaoDeVolumes.galaoAmericanoEmPolCub(10));
		imprimeNaTela(ConversaoDeVolumes.galaoAmericanoEmLitros(10));

	}
	
	private static void imprimeNaTela(double num) {
		System.out.println(dec.format(num));
	}
}
