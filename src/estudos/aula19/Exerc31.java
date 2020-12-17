package estudos.aula19;

public class Exerc31 {

	public static void main(String[] args) {
		int[] a = new int[20];
		int[] b = new int[a.length];
		
		for(int i = 0,j = 19 ,k =0 ;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*50);
			
			if(a[i]%2==0) {
				b[k]=a[i];
				k++;
			}else {
				b[j] = a[i];
				j--;
			}
			
				
			
		}
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+"--");

		}
		System.out.println("");
		for(int i = 0;i<a.length;i++) {

			System.out.print(b[i]+"--");
		}
	}

}
