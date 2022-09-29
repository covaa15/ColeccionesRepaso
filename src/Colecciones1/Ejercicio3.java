package Colecciones1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader stdn=new BufferedReader(new InputStreamReader(System.in));
		Set<String> noSeRepiten=new HashSet<>();
		Set<String> seRepiten=new HashSet<>();
		
		System.out.print("> ");
		Scanner s= new Scanner(stdn.readLine());
		s.useDelimiter("\\P{Alpha}+");
		while (s.hasNext()) {
			String palabra=s.next();
			
			if (!noSeRepiten.add(palabra)) {
				noSeRepiten.remove(palabra);
				seRepiten.add(palabra);
				
			}
		}
		System.out.printf("Las que no se repiten: %s", noSeRepiten);
		System.out.printf("Las que  se repiten: %s", seRepiten);
	}

}
