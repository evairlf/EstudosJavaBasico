package estudos.aula37;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrai {

	public static void main(String[] args) {
		ArrayList<Integer> inte = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			if(i == 5) {
				inte.add(32);
			}
			inte.add(i);
		}
		
		
		/* System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
		    int i = 0;
		    int iterator = inte.hashCode();
		    while (iterator.hasNext()) {
		      System.out.printf("Posição %d- %s\n", i, iterator.next());
		      i++;
		    }*/

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}