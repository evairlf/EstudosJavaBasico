package estudos.aula19;

public class Exerc3 {

	public static void main(String[] args) {
		int[] a = new int[15];
		int[] b = new int[a.length];

		for(int i = 0;i<a.length;i++) {
			a[i]=i+1;
			b[i]=a[i]*a[i];
			System.out.println(a[i]+"--"+b[i]);
			
		}

	}

}
