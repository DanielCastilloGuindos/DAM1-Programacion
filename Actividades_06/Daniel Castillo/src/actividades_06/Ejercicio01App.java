package actividades_06;

import java.util.Scanner;

public class Ejercicio01App {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int numCasos, lado1, lado2;
		String result = "";
		numCasos = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < numCasos; i++) {
			lado1 = scan.nextInt();
			lado2 = scan.nextInt();
			scan.nextLine();
			if(lado1 > 0 && lado2 > 0) {
				result += (lado1*2 + lado2*2) + "\n";
			}
		}
		System.out.println(result);
	}
}