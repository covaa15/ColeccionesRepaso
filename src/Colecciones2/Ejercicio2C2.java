package Colecciones2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*Método llamado contieneImpares que acepte un conjunto de números enteros y retorne true si 
contiene al menos un número impar o false en caso contrario.*/

public class Ejercicio2C2 {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> numeros = new ArrayList<>();
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
				anadir(numeros, stdn);// añadir
				break;
			case 2:
				contieneImpares(numeros);// impar
				break;

			default:
				System.out.println("Error, el numero tecleado no es un valor valido");
			}
		} while (op != 0);
	}

	public static void menu() {
		System.out.println("Opciones:");
		System.out.println("Teclea 0 para salir del programa");
		System.out.println("Teclea 1 para añadir un numero");
		System.out.println("Teclea 2 para comprobar si hay impares");
	}

	private static void contieneImpares(ArrayList<Integer> numeros) {
		Iterator<Integer> i = numeros.iterator();
		boolean impar = false;

		while (i.hasNext()) {
			int nume = i.next();
			if (nume % 2 != 0) {
				impar = true;

			}
		}
		System.out.print(impar + " -> ");
		System.out.print(numeros + "\n");
		if (impar = true) {
			numeros.clear();
		}

	}

	private static void anadir(Collection<Integer> numeros, BufferedReader stdn) throws IOException {
		System.out.println("Introduce un numero");

		int num;
		num = Integer.parseInt(stdn.readLine());
		numeros.add(num);

	}

}
