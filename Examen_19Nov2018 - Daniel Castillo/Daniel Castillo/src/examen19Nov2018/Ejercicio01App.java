package examen19Nov2018;

import java.util.Scanner;
/**
 * @author DanielCastilloGuindos
 *
 */
public class Ejercicio01App {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int numAlum;
		int [] notas = new int[6];
		int nota = 0;
		float notaMedia = 0;
		String nombre;
		String[] Salida;
		int count = 0;

		System.out.println("Introduce cantidad de alumnos:");
		numAlum = scan.nextInt();
		scan.nextLine();

		Salida = new String[numAlum];

		for(int i = 0; i < numAlum; i++) {
			nota = 0;
			notaMedia = 0;
			System.out.println("Nombre del alumno:");
			nombre = scan.nextLine();
			System.out.println("Bases de datos:");
			notas[0] = scan.nextInt();
			scan.nextLine();
			System.out.println("Programacion:");
			notas[1] = scan.nextInt();
			scan.nextLine();
			System.out.println("Entornos de Desarrollo:");
			notas[2] = scan.nextInt();
			scan.nextLine();
			System.out.println("Formacion y Orientacion Laboral:");
			notas[3] = scan.nextInt();
			scan.nextLine();
			System.out.println("Lenguaje de Marcas:");
			notas[4] = scan.nextInt();
			scan.nextLine();
			System.out.println("Sistemas Operativos:");
			notas[5] = scan.nextInt();
			scan.nextLine();

			for (int j : notas) {
				nota += j;
			}

			notaMedia = (float)nota / 6;

			if(notaMedia < 5) {
				Salida[count++] = nombre + " tiene una nota media de " + notaMedia + ". No apto para pasar a 2º DAM.";
			} else if (notaMedia >= 5){
				Salida[count++] = nombre + " tiene una nota media de " + notaMedia + ". Apto para pasar a 2º DAM.";
			}
		}

		for (int i = 0; i < Salida.length; i++) {
			System.out.println(Salida[i]);
		}
	}
}