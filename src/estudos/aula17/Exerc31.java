package estudos.aula17;

public class Exerc31 {

	public static void main(String[] args) {
		
		double salario = 1000.00;
		double aumento = 0.15;
		
		
		for(int i=1996;i<2020 ;i++) {
		System.out.printf("Salario Atual: %.2f \n",salario+(salario*aumento));
		aumento *=2;
		}
	}

}
