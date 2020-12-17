package estudos.aula19;


public class Exerc21 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int percent0 = 0;
		int percent1 = 0;
		
		for(int i = 0;i<a.length;i++) {
			a[i] = (int)Math.round(Math.random()*1);
			if(a[i]==0) {
				percent0++;
			}else {
				percent1++;
			}
		}
		System.out.println("A porcentagem de 0's é :"+percent0*10+"%\nA porcentagem de 1's é: "+percent1*10+"%");
	}

}
