package estudos.aula17;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas deseja registrar na Turma?");
		int numPessoas = sc.nextInt();
		int media = 0;
		int resultado;
		
		for(int i = 0;i<numPessoas;i++) {
			System.out.println("Digite a idade do "+(i+1)+"� Individuo: ");
			media += sc.nextInt();
		}
		resultado = media/numPessoas;
		if(resultado >0 && resultado < 26) {
			System.out.println("A m�dia de idade da turma � : "+resultado+" Turma Jovem!");
		}else if(resultado <= 60) {
			System.out.println("A m�dia de idade da turma �: "+resultado+" Turma Adulta!");
		}else {
			System.out.println("A m�dia de idade da turma �: "+resultado+" Turma Idosa!");
		}
	}

}
