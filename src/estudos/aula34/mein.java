package estudos.aula34;

import estudos.dev_media.Calculadora;
import estudos.dev_media.Fatura;

public class mein {

	public static void main(String[] args) {
		Contador contador = new Contador();
		System.out.println(Contador.retornaValor());
		Contador.incrementaContador();
		System.out.println(Contador.retornaValor());
		Contador.zeraContador();
		System.out.println(Contador.retornaValor());
	}
		
}