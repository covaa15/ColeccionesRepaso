package Colecciones1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {

		LinkedHashSet<String> nombres = new LinkedHashSet<>();
		BufferedReader stdn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Teclea la cantidad de nombres que vas a introducir");
		int num = Integer.parseInt(stdn.readLine());

		for (int i = 0; i < num; i++) {
			System.out.println("Nombre: ");
			nombres.add(stdn.readLine());

		}
		System.out.println(nombres);
	}

}
