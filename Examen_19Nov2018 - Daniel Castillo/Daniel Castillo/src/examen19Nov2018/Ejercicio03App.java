package examen19Nov2018;

import java.util.Scanner;
/**
 * @author DanielCastilloGuindos
 *
 */
public class Ejercicio03App {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String a;
		char [] arrayA;
		char [] arrayB;
		boolean palindromo = true;

		System.out.println("Introduce una frase o palabra.");
		a = scan.nextLine();
		a.toLowerCase();
		arrayA = new char [a.length()];
		arrayB = new char [a.length()];

		for(int i = 0, j = a.length()-1; i < a.length(); i++, j--) {
			arrayA[i] = a.charAt(i);
			arrayB[i] = a.charAt(j);
		}

		for(int i = 0; i < arrayA.length; i++) {
			if(arrayA[i] != arrayB[i]) {
				palindromo = false;
			}
		}

		if(palindromo) {
			System.out.println("Es palindromo.");
		} else {
			System.out.println("No es palindromo.");
		}

		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i]);
		}
		System.out.print("\n");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i]);
		}
		System.out.print("\n");
	}
}