package actividades_03;

import java.util.Scanner;

public class ArraysApp {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int[] newArray = new int[10];
		String var1 = "HolaMundo!";
		
		System.out.println("Pide valores y muestra el array:");
		setMostrarArray(setRellenarArray(newArray, Scan));
		
		System.out.println("\nMuestra el array al reves:");
		setMostrarArray(setArrayAlReves(newArray));

		System.out.println("\nMuestra el String caracter por caracter:");
		setMostarCadena(var1);
		
		System.out.println("\nMuestra el String al reves:");
		setCadenaAlReves(var1);
	}
	
	public static int[] setRellenarArray(int[] a, Scanner Scan) {
		for(int i = 0; i < a.length; i++) {
			System.out.println("Posicion nº " + (i+1) + ":");
			a[i] = Scan.nextInt();
			Scan.nextLine();
		}
		return a;
	}
	public static void setMostrarArray(int[] a) {
		for (int i: a) {
			System.out.print(i + " ");
		}
	}
	public static int[] setArrayAlReves(int[] a) {
		int[] x = new int[a.length];
		for (int i = a.length-1, pos = 0; i+1 > 0; i--, pos++) {
			x[pos] = a[i];
		}
		return x;
	}
	
	public static void setMostarCadena(String a) {
		for(int i = 0; i< a.length();i++) {
			System.out.print(a.charAt(i) + " ");
		}
	}
	public static void setCadenaAlReves(String a) {
		for(int i = a.length()-1; i>= 0;i--) {
			System.out.print(a.charAt(i));
		}
	}
}