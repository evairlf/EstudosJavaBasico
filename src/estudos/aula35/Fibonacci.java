package estudos.aula35;

public class Fibonacci {

	public Fibonacci() {
	}
	public static int fatorial(int num) {
		if(num==0) {
			return 1;
		}
		return num * fatorial(num - 1);
		
	}
	
	public static int fibonacci(int num) {
		if( num == 0 || num == 1) {
			return num;
		}
		
		return fibonacci(num-1) + fibonacci(num -2);
	}
	
	static int soma = 0;
	public static int somatorio(int num) {
		
		if(num == 0) {
			return num;
		}
		return num + somatorio(num-1);
	}
	
	public static int volta(int num) {
		if(num %2==0) {
			return num;
		}
		return volta(num-3);
	}
	
}