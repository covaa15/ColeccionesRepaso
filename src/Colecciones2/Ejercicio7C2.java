package Colecciones2;

import java.util.Deque;
import java.util.LinkedList;

/*
 * Método llamado eliminarSiMayoresEncima que acepte una pila de números enteros como 
parámetro y elimine de ella los elementos que tienen por encima alguno cuyo valor sea mayor.
Por ejemplo, suponiendo que una pila almacena los siguientes números:
[6, 22, 17, 17, 10, 7, 9, 14, 5, 12, 7, 2]  Tope

Los números 5, 9, 7, 10 y 6 deben eliminarse porque todos ellos tienen algún número mayor por encima. 
Sólo se permite el uso de otras pilas o colas para solucionar este problema.
 */
public class Ejercicio7C2 {

	public static void main(String[] args) {
		Deque<Integer> numeros = new LinkedList<Integer>();

		numeros.push(6);
		numeros.push(22);
		numeros.push(17);
		numeros.push(17);
		numeros.push(10);
		numeros.push(7);
		numeros.push(9);
		numeros.push(14);
		numeros.push(5);
		numeros.push(12);
		numeros.push(7);
		numeros.push(2);

		System.out.println("Pila numeros al principio--> " + numeros + "\n");

		eliminarSiMayoresEncima(numeros);

	}

	private static void eliminarSiMayoresEncima(Deque<Integer> numeros) {
		Deque<Integer> auxiliar = new LinkedList<Integer>();
		auxiliar.push(numeros.pop());

		while (!numeros.isEmpty()) {

			if (numeros.peek() >= auxiliar.peek()) {

				auxiliar.push(numeros.pop());

			} else {

				numeros.pop();
			}

		}
		System.out.println("Pila auxiliar--> " + auxiliar);
		System.out.println("Pila numeros--> " + numeros + "\n");

		while (!auxiliar.isEmpty()) {
			numeros.push(auxiliar.peek());
			auxiliar.pop();
		}
		System.out.println("Pila numeros al final--> " + numeros);
		System.out.println("Pila auxiliar al final--> " + auxiliar);
	}

}
