package estudos.aula37;

public class Mamifero extends Animal{
private String alimento;

public Mamifero() {
	setTipo("Mamifero");
	setAmbiente("Terra");
}

public String getAlimento() {
	return alimento;
}

public void setAlimento(String alimento) {
	this.alimento = alimento;
}




@Override
public String toString() {
	
	return "Mamifero "+super.toString()+"\nAlimento: "+alimento;
}


}
