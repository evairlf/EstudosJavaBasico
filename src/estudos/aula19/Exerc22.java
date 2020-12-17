package estudos.aula19;

public class Exerc22 {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		for(int i = 0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*21);

			
		}
		for(int i = 0;i<a.length;i++) {
			if(a[i]%2==1) {
				System.out.println("Loop de verificação encerrado! Existe um elemento que nao é par no vetor!");
				break;
			}
		}
	}

}