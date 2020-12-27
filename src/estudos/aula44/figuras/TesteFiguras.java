package estudos.aula44.figuras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import estudos.aula37.Animal;

public class TesteFiguras{
	public static ArrayList<FiguraGeometrica> figuras;

	public static void main(String[] args) {
		figuras = new ArrayList<FiguraGeometrica>();

		Circulo circulo = new Circulo();
		circulo.setCor("PRETIS");
		circulo.setNome("CIRCULÃO");
		circulo.setRaio(100);
		circulo.calcularArea();
		figuras.add(circulo);

		Quadrado quadrado = new Quadrado();
		quadrado.setCor("VEIIIDII");
		quadrado.setNome("QUADRADUUU");
		quadrado.setLado(5);
		figuras.add(quadrado);

		Piramide piramide = new Piramide();
		piramide.setNome("PIRAMIDE");
		piramide.setCor("AREIA");
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setNumPolBi(2);
		piramide.setArestaBase(4);
		piramide.setBase(quadrado);
		figuras.add(piramide);

		Triangulo triangulo = new Triangulo();
		triangulo.setCor("EGIPITIA");
		triangulo.setNome("TRINGULO");
		triangulo.setAltura(10);
		triangulo.setBase(10);
		figuras.add(triangulo);

		// Figuras 3D

		Cubo cubo = new Cubo();
		cubo.setCor("COR DE CUBO");
		cubo.setNome("CLEBER CUBO");
		cubo.setLado(5);
		figuras.add(cubo);

		Cilindro cilindro = new Cilindro();
		cilindro.setCor("AMARELO");
		cilindro.setNome("CILINDO");
		cilindro.setAltura(5);
		cilindro.setRaio(7);
		figuras.add(cilindro);
		
		Collections.sort(figuras,new ComparadorDeNome());

		for (Iterator<FiguraGeometrica> iterator = figuras.iterator(); iterator.hasNext();) {
			FiguraGeometrica fig = iterator.next();
			System.out.println("---------------------------------");
			if (fig instanceof Figura2D) {
				System.out.println(((Figura2D) fig).toString().replace("Figura 2D", "Tipo: Figura 2D"));
				System.out.println(fig.getNome());
				System.out.println(((Figura2D) fig).calcularArea());
			}
			if (fig instanceof Figura3D) {
				System.out.println(fig.getNome().replace("Figura 3D", "Tipo: Figura 3D"));
				System.out.println("Area: " + ((Figura3D) fig).calcularArea());
				System.out.println("Volume: " + ((Figura3D) fig).calcularVolume());
			}

		}

		/*
		 * for(FiguraGeometrica figura : figuras) {
		 * System.out.println("----------------------------");
		 * System.out.println(figura.getNome());
		 * 
		 * if(figura instanceof Figura2D) { Figura2D f2d = (Figura2D) figura;
		 * System.out.println(f2d.calcularArea()); } if(figura instanceof Figura3D) {
		 * Figura3D f3d = (Figura3D) figura; System.out.println(f3d.calcularArea());
		 * System.out.println(f3d.calcularVolume()); } }
		 */

		/*
		 * System.out.println("Figuras Geometricas"); for(int i =
		 * 0;i<figuras.size();i++) { if(figuras.get(i) instanceof Figura2D) {
		 * System.out.println(figuras.get(i)); }else if(figuras.get(i) instanceof
		 * Figura3D) { System.out.println(figuras.get(i)); } }
		 */

		
	}

}