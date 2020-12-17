package estudos.aula19;

public class Exerc30 {

	public static void main(String[] args) {
		int qtdImpar;
		int qtdPar;
		int[] a = new int[20];
		int[] b = new int[20];
		int[] c = new int[20];
		
		for(int i = 0;i<a.length;i++) {
			a[i] = (int)Math.round(Math.random()*100);
			
			if(a[i]%2==0) {
				b[i] = a[i];
				System.out.println("Par!");
			}else {
				c[i] = a[i];
				System.out.println("Impar!");
			}
		}

	}

}
