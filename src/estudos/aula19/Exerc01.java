package estudos.aula19;

public class Exerc01 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		int[] b = new int[a.length];
		
		for(int i = 0;i<5;i++) {
			a[i]= i+1;
			b[i]=a[i];
			System.out.println(a[i]+"--"+b[i]);
		}

	}

}
