package estudos.aula17;

public class Exerc23 {

	public static void main(String[] args) {
		
		double valor = 1.99;
		System.out.println("Loja Quase Dois - Tabela de preços: ");
		for(int i = 1;i<=50;i++) {
			System.out.printf("%d- R$ %.2f\n",i,(valor*i));
		}
		

	}

}
