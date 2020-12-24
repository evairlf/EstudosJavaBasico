package estudos.aula34;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Calculadora {
	public Calculadora() {
		
	}
	
	public static double somar(double valor1,double valor2) {
		return valor1 + valor2;
	}
	public static double somar(double valor1, double valor2, double valor3) {
		return valor1 + valor2 + valor3;
	}
	
	public static double subtrarir(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	public static double subtrair(double valor1, double valor2, double valor3) {
		return valor1 - valor2 - valor3;
	}
	
	public static double multiplicar(double valor1, double valor2) {
		try {
			return valor1*valor2;
		}catch(Exception ex) {
			return 0;
		}
	}
	
	public static double multiplicar(double valor1, double valor2, double valor3) {
		try {
			return valor1 * valor2* valor3;
		}catch(Exception ex){
			return 0;
		}
		
	}
	
	public static double elevarAPotencia(double numerador, double potencia) {
		double resultado = 1;
		try {
		for(int i = 0;i<potencia;i++) {
			resultado *= numerador;
		}
		return resultado;
		}catch(Exception ex) {
			return 1;
		}
		}
		
	public static int fatorial(int num) {
		if(num == 0) {
			return 1;
		}
		int resultado = 1;
		for(int i = num;i>1;i--) {
			resultado *= i;
		}
		return resultado;
	}
			
	}