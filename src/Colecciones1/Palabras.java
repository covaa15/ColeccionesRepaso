package Colecciones1;

import java.util.HashMap;
import java.util.TreeSet;

public class Palabras {

	HashMap<Integer, TreeSet<String>> mapa;

	public Palabras() {
		mapa = new HashMap<>();
	}

	public Palabras(String palabras) {
		this();// El this(); equivale a --> mapa=new HashMap<>();
		addPalabras(palabras);
	}

	public void addPalabra(String palabra) {

	}

	public void addPalabras(String palabra) {

	}

	public static void main(String[] args) {
		Palabras p=new Palabras();

	}

}
