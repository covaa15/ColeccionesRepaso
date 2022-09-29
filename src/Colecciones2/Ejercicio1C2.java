package Colecciones2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ejercicio1C2 {

	public static void main(String[] args) throws IOException {
		Collection<String> cade = new LinkedHashSet<>();
		BufferedReader stdn = new BufferedReader(new InputStreamReader(System.in));
		int op = 0;
		do {
			menu();
			boolean sigue = false;
			do {
				try {
					op = Integer.parseInt(stdn.readLine());
					sigue = true;
				} catch (NumberFormatException e) {
					System.out.println("Por favor teclee un numero no una letra " + e.getMessage());
					System.out.println();
					menu();

				}
			} while (sigue != true);
			switch (op) {
			case 0:
				System.out.println("Ha salido del programa");
				break;
			case 1:
				añadir(cade, stdn);
				break;
			case 2:
				eliminarLasDeLongitudPar(cade);
				break;

			default:
				System.out.println("Error, el numero tecleado no es un valor valido");
			}
		} while (op != 0);

	}

	private static void eliminarLasDeLongitudPar(Collection<String> cade) {
		Iterator<String> i = cade.iterator();
		while (i.hasNext()) {
			String cad = (String) i.next();

			if (cad.length() % 2 == 0)
				i.remove();

		}
		System.out.println(cade);

	}

	private static void añadir(Collection<String> cade, BufferedReader stdn) throws IOException {
		String cad;
		System.out.println("Teclea una cadena");
		cad = stdn.readLine();
		cade.add(cad);
	}

	public static void menu() {
		System.out.println("Opciones:");
		System.out.println("Teclea 0 para salir del programa");
		System.out.println("Teclea 1 para añadir una cadena");
		System.out.println("Teclea 2 para eliminar los pares y mostrar los impares");
		System.out.println("Elige una opción");
	}
}
