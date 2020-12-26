package estudos.aula37;

public class Peixe extends Animal{
private String caracteristicas;


public Peixe() {
	setTipo("Peixe");
	setAmbiente("Mar");
	setPatas(0);
	setCor("Cinzenta");
	this.caracteristicas = "Barbatanas e cauda";
}

public String getCaracteristicas() {
	return caracteristicas;
}

public void setCaracteristicas(String caracteristicas) {
	this.caracteristicas = caracteristicas;
}



@Override
public String toString() {
	return "Peixe "+super.toString()+"\nCaracteristicas: " + getCaracteristicas();
}



}