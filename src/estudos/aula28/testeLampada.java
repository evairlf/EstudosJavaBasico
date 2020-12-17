package estudos.aula28;

public class testeLampada {

	public static void main(String[] args) {
		lampada lampada = new lampada();
		lampada.ligaDesliga();
		lampada.ligaDesliga();
		System.out.println("Ela está ligada? "+lampada.getLigada());
		lampada.ligaDesliga();
		System.out.println("Ela está ligada? "+lampada.getLigada());
	}

}
