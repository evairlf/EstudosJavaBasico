package estudos.aula19;

public class Exerc24 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		for(int i = 0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*45);
			if(a[i]%2==0) {
				b[i] = 1;
			}else {
				b[i] = 0;
			}
			System.out.println(b[i]);
		}

	}

}
