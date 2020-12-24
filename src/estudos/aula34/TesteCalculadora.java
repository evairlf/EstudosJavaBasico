package estudos.aula34;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class TesteCalculadora {
	static DecimalFormat dec = new DecimalFormat("###,###.##");
	public static void main(String[] args) {
		
	
		imprimirTela(Calculadora.elevarAPotencia(2, 7));
		imprimirTela(Calculadora.multiplicar(2, 3));
		imprimirTela(Calculadora.fatorial(0));
		
		
	}
	
	static void imprimirTela(double num) {
		System.out.println(dec.format(num));
	}

}
