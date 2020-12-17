package estudos.aula19;

public class Exerc29 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[a.length+b.length];
		
		
		for(int i = 0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*50);
			b[i] = (int) Math.round(Math.random()*50);
		}
		for(int i = 0,j = 0;i<c.length;i++) {
			if(i<10) {
				c[i] = a[i];
				System.out.println("A: "+a[i]+" C recebe A -- C: "+c[i]);
			}else {
				c[i] = b[j];
				System.out.println("C: "+b[j]+" C recebe B -- C: "+c[i]);
				j++;
			}
			
		}
	}

}
