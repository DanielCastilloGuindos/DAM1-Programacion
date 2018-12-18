package actividades_06;

import java.util.Scanner;

public class Ejercicio04App {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int num, temp, numR = 0, div;
		int [] array;

		System.out.println("Introduce un numero:");
		num = scan.nextInt();
		scan.nextLine();

		temp = num;
		array =new int[getCifras(num)];
		div = getDiv(array.length);

		for(int i = 0, j = div, pos = array.length-1; i < array.length; i++, j/=10, pos--) {
			array[pos] = temp / j;
			temp%=j;
		}

		for (int i : array) {
			numR += i*div;
			div/=10;
		}

		if(num == numR) {
			System.out.println(num + " es un numero capicua.");
		} else {
			System.out.println(num + " no es un numero capicua.");
		}
	}

	public static int getCifras(int num) {
		int cifras = 0, div = 1;

		while(true) {
			if((num/div) > 0) {
				cifras++;
				div*=10;
			} else {
				break;
			}
		}
		return cifras;
	}

	public static int getDiv(int cifras) {
		int div = 1;

		for(int i = 1; i < cifras ;i++) {
			div*=10;
		}
		return div;
	}
}