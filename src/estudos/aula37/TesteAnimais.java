package estudos.aula37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class TesteAnimais {

	public static void main(String[] args) {
		ArrayList<Animal> animais = new ArrayList<Animal>();
		//QUE DESELEGANTE
		Peixe axolote = new Peixe();
		axolote.setNome("Axolote");
		axolote.setComprimento(23);
		axolote.setNomeCientifico("Ambystoma mexicanum");
		axolote.setVelocidade(1);
		animais.add(axolote);
		
		//CAMELO
		Mamifero camelo = new Mamifero();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo Caramelo");
		camelo.setVelocidade(2);
		camelo.setNomeCientifico("Camelus");
		camelo.setAlimento("Acácia");
		animais.add(camelo);
		
		//TUBARAO
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setNomeCientifico("Selachimorpha");
		tubarao.setVelocidade(1.5);
		animais.add(tubarao);
		
		//URSO CANADENSE
		Mamifero ursoCanadense = new Mamifero();
		ursoCanadense.setNome("Urso-Do-Canada");
		ursoCanadense.setNomeCientifico("Ursus arctos");
		ursoCanadense.setComprimento(180);
		ursoCanadense.setCor("Vermelho");
		ursoCanadense.setVelocidade(0.5);
		ursoCanadense.setAlimento("Mel");
		animais.add(ursoCanadense);
		
		//ORGANIZAR ARRAY DE OBJETOS
		Collections.sort(animais, new Comparator<Object>(){
		    public int compare(Object o1, Object o2) {
		        Animal a1 = (Animal) o1;
		        Animal a2 = (Animal) o2;
		        return a1.getTipo().compareTo(a2.getTipo());
		    }
	});

		System.out.println(animais.toString().replace("[", "").replace("]", "").replace(",", "\n-------------------------\n"));
	}
}