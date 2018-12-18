package pistaDeAterrizaje;

import java.util.Scanner;

public class Ejercicio01App {
	private static Scanner Scan;
	public static void main(String[] args) {
		Scan = new Scanner(System.in);
		String[] input = new String[4];
		int[] a = new int[37];
		int[] b = new int[37];
		int numA = 0;
		int numB = 0;
		char posA = ' ';
		char posB = ' ';

		for(int i = 0, j = a.length-1; i < a.length; i++, j--) {
			a[i] = i;
			b[i] = j;
		}

		System.out.println("Introduce 4 pistas:");
		for(int i = 0; i < input.length; i++) {
			input[i] = Scan.nextLine();
		}

		for(int i = 0; i < input.length; i++) {
			switch(input[i].charAt(input[i].length()-1)) {
				case 'L':
					numA = Integer.parseInt(input[i].substring(0, input[i].length()-1));
					posA = 'L';
					posB = 'R';
					break;
				case 'R':
					numA = Integer.parseInt(input[i].substring(0, input[i].length()-1));
					posA = 'R';
					posB = 'L';
					break;
				case 'C':
					numA = Integer.parseInt(input[i].substring(0, input[i].length()-1));
					posA = 'C';
					posB = 'C';
					break;
				default:
					numA = Integer.parseInt(input[i].substring(0, input[i].length()));
					posA = ' ';
					posB = ' ';
					break;
			}

			if(numA <= 18 && numA > 0) {
				numB = numA+18;
				getReverse(numA, numB, posA, posB);
			} else if(numA > 18 && numA <=36){
				numB = numA-18;
				getReverse(numA, numB, posA, posB);
			} else if(numA == 0) {
				numB = 18;
				getReverse(numA, numB, posA, posB);
			} else {
				System.out.println("Grados incorrectos.");
			}
		}
	}
	public static void getReverse(int numA, int numB,char posA, char posB) {
		if(numA < 10) {
			System.out.print("0" + numA + "" + posA + ": ");
		} else {
			System.out.print(numA + "" + posA + ": ");
		}
		if(numB < 10) {
			System.out.println("0" + numB + "" + posB);
		} else {
			System.out.println(numB + "" + posB);
		}
	}
}