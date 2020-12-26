package estudos.comparador.ordem.alfabetica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Testinhoa {

	public static void main(String[] args) {
		Teste a = new Teste();
		a.setDepto("3");
		Teste b = new Teste();
		b.setDepto("2");
		Teste c = new Teste();
		c.setDepto("1");

		ArrayList<Teste> testes = new ArrayList<>();
		testes.add(a);
		testes.add(b);
		testes.add(c);


		Collections.sort(testes, new Comparator<Object>(){
		    @Override
		    public int compare(Object o1, Object o2) {
		        Teste a1 = (Teste)o1;
		        Teste a2 = (Teste)o2;
		        return a1.getDepto()
		                .compareToIgnoreCase(a2.getDepto());
		    }
	});
		System.out.println(testes.toString());

	}
}