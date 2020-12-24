package estudos.aula34;

public class Contador {
 private static int contador;
 public Contador() {
	 contador++;
 }
 
 public static void zeraContador() {
	 contador = 0;
 }
 
 public static void incrementaContador() {
	 contador++;
 }
 
 public static int retornaValor() {
	 return contador;
 }
}
