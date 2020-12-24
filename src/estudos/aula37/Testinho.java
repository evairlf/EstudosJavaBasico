package estudos.aula37;

import java.time.LocalDate;
import java.time.Period;

public class Testinho {

	public static void main(String[] args) {
		LocalDate local = LocalDate.now();
		LocalDate depois = LocalDate.now().plusDays(40);

		
		
		Period periodo = Period.between(local, depois);
				System.out.println(periodo.getDays());
	}

}
