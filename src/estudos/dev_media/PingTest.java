package estudos.dev_media;

public class PingTest {
	private static final int HORA_INICIO = 0;
	private static final boolean coca = true;
	public static boolean executar(int segundos) {
		
return segundos == 4 && 4 > 0;
	}
	
	
	public static boolean noHorario(int minutoAnterior,int minutoAtual) {
		return minutoAtual -  minutoAnterior <= 15;
	}
	
	public static boolean emAtraso(int minutoAnterior,int minutoAtual) {
		return minutoAtual - minutoAnterior > 15;
	}
	
	
	
}