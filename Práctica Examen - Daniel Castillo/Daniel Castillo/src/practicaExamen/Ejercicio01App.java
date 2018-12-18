package practicaExamen;

import java.util.Scanner;
/**
 * @author DanielCastilloGuindos
 *
 */
public class Ejercicio01App {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String Nombre;
		int Edad;
		float Salario;

		System.out.println("Introduce nombre:");
		Nombre = scan.next();
		scan.nextLine();
		System.out.println("Introduce edad:");
		Edad = scan.nextInt();
		scan.nextLine();
		System.out.println("Introduce salario:");
		Salario = scan.nextFloat();
		scan.nextLine();

		if(Edad < 16) {
			System.out.println(Nombre + " no tiene edad para trabajar.");
		} else {
			if (Edad >= 16 && Edad < 19) {
				Salario += Salario * 3 / 100;
			} else if (Edad >= 19 && Edad <= 50) {
				Salario += Salario * 5 / 100;
			} else if (Edad >= 51 && Edad <= 60) {
				Salario += Salario * 10 / 100;
			} else if (Edad > 60) {
				Salario += Salario * 15 / 100;
			}
			System.out.println("Nombre: " + Nombre + "\nEdad: " + Edad + "\nSalario: " + Salario);
		}
	}
}