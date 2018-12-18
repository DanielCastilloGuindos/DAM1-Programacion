package practicaExamen;

import java.util.Scanner;
/**
 * @author DanielCastilloGuindos
 *
 */
public class Ejercicio02App {
	private static Scanner Scan;
	public static void main(String[] args) {
		Scan = new Scanner(System.in);
		int num;
		int resultDivisores = 0;
		String textDivisores = "";

		System.out.println("Introduce un numero:");
		num = Scan.nextInt();
		Scan.nextLine();

		for(int i = 1; i < num; i++) {
			if((num%i) == 0) {
				resultDivisores += i;
				textDivisores += i + " + ";
			}
		}

		if(resultDivisores == num) {
			System.out.println(num + " es un numero perfecto.");
			System.out.println(num + " = " + textDivisores);
		} else {
			System.out.println(num + " no es numero perfecto.");
		}
	}
}