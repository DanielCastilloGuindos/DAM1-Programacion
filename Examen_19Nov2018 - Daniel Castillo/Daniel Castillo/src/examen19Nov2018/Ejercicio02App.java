package examen19Nov2018;

import java.util.Scanner;
/**
 * @author DanielCastilloGuindos
 *
 */
public class Ejercicio02App {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int[] anos = new int[5];
		System.out.println("Introduce 5 años:");
		for (int i = 0; i < anos.length; i++) {
			System.out.println("Introduce año nº " + (i+1) + ":");
			anos[i] = scan.nextInt();
			scan.nextLine();
		}
		for(int i = 0; i < anos.length; i++) {
			if((anos[i]%4) == 0 && (anos[i]%100) != 0) {
				System.out.println(anos[i] + " es bisiesto.");
			} else if((anos[i]%400) == 0){
				System.out.println(anos[i] + " es bisiesto.");
			} else {
				System.out.println(anos[i] + " no es bisiesto.");
			}
		}
	}
}