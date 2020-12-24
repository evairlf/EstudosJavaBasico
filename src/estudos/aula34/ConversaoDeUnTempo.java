package estudos.aula34;

public class ConversaoDeUnTempo {

	
	public static int minutoEmSeg(int min) {
		return min * 60;
	}
	
	public static int horaEmMin(int hora) {
		return hora * 60;
	}
	
	public static int diaEmHoras(int dia) {
		return dia * 24;
	}
	
	public static int semanaEmDias(int semana) {
		return semana * 7;
	}
	
	public static int mesEmDias(int mes) {
		return mes * 30;
	}
	
	public static double anoEmDias(int ano) {
		return ano * 365.25;
	}
}
