package estudos.aula19;

public class Exerc32 {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		for(int i = 0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*10);
			System.out.println("Tabuada do: "+a[i]);
			for(int j = 1;j<=10;j++) {
				System.out.println(a[i]+" X "+j+" = "+a[i]*j);
			}
			System.out.println("--------------");
			
		}

	}

}
