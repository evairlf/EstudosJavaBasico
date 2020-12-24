package estudos.dev_media;

public class DescontoAniversario {

		private static int dia = 10;
		private static int mes = 20;
		private final double cu = 0;

		public static boolean permiteDesconto(int diaAniversario, int mesAniversario) {
			return dia == diaAniversario && mes == mesAniversario;
		}
	}