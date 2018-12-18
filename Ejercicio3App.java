package actividades_05;

import java.util.Scanner;

public class Ejercicio3App {
	private static Scanner Scan = new Scanner(System.in);
	private static int[][] idRunway = new int [18][2];
	private static String s1;
	private static String s2;
	private static String s3;
	private static String s4;
	public static void main(String[] args) {
		idRunway = getRellenarIdRunway();
		
		do {
			s1 = Scan.nextLine();
			s2 = Scan.nextLine();
			s3 = Scan.nextLine();
			s4 = Scan.nextLine();
			name(s1);
			name(s2);
			name(s3);
			name(s4);
			
		} while(true);
	}
	private static void name(String s) {
		int num = 0;
		char letter = ' ';
	}
	public static int[][] getRellenarIdRunway(){
		int [][] a = new int[18][2];
		for(int i = 0, cA = 1, cB = 19; i < a.length; i++, cA++ , cB++) {
			a[i][0] = cA;
			a[i][1] = cB;
		}
		return a;
	}
	public static void getMostrar() {
		for(int[] a : idRunway) {
			for (int b : a) {
				System.out.println(b);
			}
		}
	}
}