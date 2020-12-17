package estudos.aula24;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteClasses {

	public static void main(String[] args) throws Exception{
		SimpleDateFormat formato = new SimpleDateFormat();
		lampada lamp = new lampada("Froisfrorecenti",100,"LED",26.52);
		livroDeLivraria lvd = new livroDeLivraria("Porque os passaros peidam","Paulo Cordeilo","Agosto","Ficção",250.42);
		livroDeBiblioteca lvb = new livroDeBiblioteca("A rainha grilo","dimocracia","outubro","bobagem","15/09/1995","14/08/1999");
		contaCorrente conta = new contaCorrente(4124124,412,true,421412);
		
		lamp.exibeDados();
		System.out.println();
		lvd.exibirDados();
		System.out.println();
		lvb.exibirDados();
		System.out.println();
		conta.exibirDados();
	}

}
