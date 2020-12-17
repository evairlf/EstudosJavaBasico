package estudos.aula19;

public class Exerc28 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		for(int i = 0, j = 9;i<a.length;i++,j--) {
			a[i] = (int) Math.round(Math.random()*50);
			b[j] = a[i];
		}
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]+"---"+b[i]);
		}

	}

}
