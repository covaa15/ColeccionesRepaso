package Colecciones2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Método llamado negativosAbajoPositivosArriba que acepte una pila de números enteros como 
parámetro y la reorganice para que se queden debajo los negativos y encima los positivos. Usa una cola 
como estructura de datos auxiliar para realizar el proceso.
[23, -5, 37, 29, -19, -55, 89]
 */
public class Ejercicio5C2 {

	public static void main(String[] args) {
		Deque<Integer> numeros = new LinkedList<>();

		numeros.push(23);
		numeros.push(-5);
		numeros.push(37);
		numeros.push(29);
		numeros.push(-19);
		numeros.push(-55);
		numeros.push(89);

		System.out.println("Pila numeros al principio--> " + numeros + "\n");

		Queue<Integer> auxiliarPos = new LinkedList<Integer>();
		Queue<Integer> auxiliarNeg = new LinkedList<Integer>();

		auxiliarPos.offer(numeros.pop());

		while (!numeros.isEmpty()) {
			if (numeros.peek() > 0) {
				auxiliarPos.offer(numeros.pop());

			} else {
				auxiliarNeg.offer(numeros.pop());
			}

		}
		System.out.println("Cola auxiliar Positivos-> " + auxiliarPos);
		System.out.println("Cola auxiliar Negativos-> " + auxiliarNeg + "\n");

		while (!auxiliarPos.isEmpty()) {
			numeros.push(auxiliarPos.poll());
		}
		while (!auxiliarNeg.isEmpty()) {
			numeros.push(auxiliarNeg.poll());

		}
		System.out.println("Pila numeros al final--> " + numeros);
		System.out.println("Cola auxiliar de Positivos al final--> " + auxiliarPos);
		System.out.println("Pila auxiliar de Negativos al final--> " + auxiliarNeg);

	}

}
