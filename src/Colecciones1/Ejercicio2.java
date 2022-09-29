package Colecciones1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Integer> numeros = new LinkedList<>();
		System.out.println("original");
		for (int i = 0; i < 100; i++)

			numeros.add((int) Math.round(Math.random() * 99 + 1));

		numeros.forEach((nombre) -> System.out.println(nombre));// Esto es una expresion landa

		Set<Integer> sinRepetidos = new HashSet<>(numeros);

		System.out.printf("\n Sin repetidos (%d elementos)\n", sinRepetidos.size());
		for (int n : sinRepetidos)
			System.out.println(n);

		Set<Integer> ordenados = new TreeSet<>(numeros);
		System.out.printf("\n Sin repetidos y ordenados (%d elementos)\n", ordenados.size());

		Iterator<Integer> i = ordenados.iterator();
		while (i.hasNext())
			System.out.println(i.next());

	}

}
