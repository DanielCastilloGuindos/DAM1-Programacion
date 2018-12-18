package actividades_07;

import java.util.Scanner;

public class Ejercicio01App {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String cadena;
		int numEspacios = 0, numLetras = 0, numCasos;
		System.out.println("Introduce numero de casos:");
		numCasos = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < numCasos; i++) {
			System.out.println("Introduce cadena:");
			cadena = scan.nextLine();
			System.out.println("Cadena sin espacios:");
			for (int j = 0; j < cadena.length(); j++) {
				if (cadena.charAt(j) != ' ') {
					System.out.print(cadena.charAt(j));
					numLetras++;
				} else {
					numEspacios++;
				}
			}
			System.out.println("\nNº de espacios: " + numEspacios + "\nNº de letras: " + numLetras);
		}
	}
}