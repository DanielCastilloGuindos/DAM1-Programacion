package actividades_06;

import java.util.Scanner;

public class Ejercicio06App {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int num;

		System.out.println("Introduce cuantas veces quieres que se muestre 'hola mundo':");
		num = scan.nextInt();
		scan.nextLine();

		for(int i = 0; i < num; i++) {
			System.out.println("Hola mundo.");
		}
	}
}