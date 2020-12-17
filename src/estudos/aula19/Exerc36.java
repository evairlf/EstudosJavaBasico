package estudos.aula19;

public class Exerc36 {

	public static void main(String[] args) {
		int[] a = new int[11];
		
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.pow(2, i);
			System.out.printf("Valor A : %d---%dº posição!\n",a[i],(i+1));
		}

	}

}
