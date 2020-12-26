package estudos.comparador.ordem.alfabetica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class OrganizarArrays {

	public static void main(String[] args) {
		
		//ORGANIZA ARRAY NORMAL
		int[] cu = new int[30];
		for(int i = 0;i<30;i++) {
			int num = 0; 
			num = (int) (Math.random()*100);
			cu[i] = num;
		}
		
		System.out.println(Arrays.toString(cu));
		Arrays.sort(cu);
		System.out.println("ARRAY NORMAL");
		System.out.println(Arrays.toString(cu));
		System.out.println();
		
		//ORGANIZA ARRAY LIST
		ArrayList<Integer> numero = new ArrayList<Integer>();
		for(int i = 0;i<30;i++) {
			int num = 0; 
			num = (int) (Math.random()*100);
			numero.add(num);
		}
		System.out.println(numero.toString());
		System.out.println("ARRAY LIST ORGANIZADA");
		Collections.sort(numero, new Comparator<Object>(){
		    public int compare(Object o1, Object o2) {
		        Integer a1 = (Integer) o1;
		        Integer a2 = (Integer) o2;
		        return Integer.compare(a1, a2);
		    }
	});
		System.out.println(numero.toString());

	}

}
