package estudos.aula17;

public class Exerc15_16 {
	public static void main(String[] args){
		for(int a=0, b=1, i=0; a<800; b+=a, a=b-a, i++) {
			System.out.print(a + " ");
			
		}  
		System.exit(0);
	}
}