package actividades_04;

import java.util.Scanner;

public class Ejercicio2App {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int[] nums = new int[getTamaño(Scan)];
		nums = getNumAleatorios(nums);
		setMostrarArray(nums);
		System.out.println("\nLa suma de los valores es :" + getSumarValores(nums));
	}
	public static int getTamaño(Scanner Scan) {
		System.out.println("Introduce el tamaño:");
		int Tamaño = Scan.nextInt();
		return Tamaño;
	}
	
	public static int[] getNumAleatorios(int[] x) {
		for(int i = 0; i < x.length; i++) {
			x[i] = (int)Math.round(Math.random()*9);
		}
		return x;
	}
	public static void setMostrarArray(int[] x) {
		System.out.println("Mostrar el array:");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
	public static int getSumarValores(int[] x) {
		int resultado = 0;
		for (int i : x) {
			resultado += i;
		}
		return resultado;
	}
}