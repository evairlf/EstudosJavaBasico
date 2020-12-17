package estudos.aula17;

public class exx {
	public static boolean ePrimo(int inteiro) {
		for(int i = 3;i<=inteiro;i++) {
			if(inteiro%(i-1)==0) {
				return false;
			}
		}
		return true;
	}
}
