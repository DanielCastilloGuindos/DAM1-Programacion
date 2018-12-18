package actividades_05;

import java.util.Scanner;

public class Ejercicio2App {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("¿Que tabla quieres mostrar?");
		int numT = scan.nextInt();
		scan.nextLine();
		System.out.println("TABLA DEL NUMERO " + numT);
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + numT + " = " + (numT*i));
		}
	}
}