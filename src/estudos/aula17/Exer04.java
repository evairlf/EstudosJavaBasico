package estudos.aula17;

public class Exer04 {

	public static void main(String[] args) {
		
		int pais1 = 80000;
		int pais2 = 200000;
		int ano = 0;
		
		for(;pais1<pais2;) {
			
			pais1 +=pais1*0.03;
			pais2 +=pais2*0.015;
			ano++;
		}
		System.out.println("Sao nescessários "+ano+" Anos para que o pais1 alcance a população do pais2");
	}

}
