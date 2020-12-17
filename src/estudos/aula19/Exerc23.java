package estudos.aula19;

public class Exerc23 {

	public static void main(String[] args) {
		int[] a = new int[10];
		boolean palindromo= true;
		
		
		for(int i = 0,j = a.length;i<a.length;i++,j--) {
			if(i<5) {
				a[i] = i+1;
			}else {
				a[i]= j;
			}
			System.out.println(a[i]);
		}
		for(int i = 0, j = 9;i<a.length;i++,j--) {
				if(a[i]!=a[j]) {
					palindromo = false;
					System.out.println(a[i]+"!="+a[j]);
			}
		}
		if(palindromo) {
			System.out.println("é um Palíndromo!");
		}
	}

}
