package actividades_04;

import java.util.Scanner;

public class Ejercicio5App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		char[] chars = new char[27];
		int posicion = 0;
		char charSelected = ' ';
		String stringTotal = "";
		getRellenar(chars);
		do {
			System.out.println("Indica posicion:");
			posicion = Scan.nextInt();
			Scan.nextLine();
			if(posicion>=1 && posicion<=27) {
				charSelected = getCharSelected(chars, posicion);
				stringTotal += String.valueOf(charSelected);
			} else {
				System.out.println("Posicion no valida.");
			}
		} while(posicion != -1);
		System.out.println("Cadena a sacar:\n" + stringTotal);
	}
	
	public static void getRellenar(char[] arrayChar) {
		arrayChar[0] = 'A';
		arrayChar[1] = 'B';
		arrayChar[2] = 'C';
		arrayChar[3] = 'D';
		arrayChar[4] = 'E';
		arrayChar[5] = 'F';
		arrayChar[6] = 'G';
		arrayChar[7] = 'H';
		arrayChar[8] = 'I';
		arrayChar[9] = 'J';
		arrayChar[10] = 'K';
		arrayChar[11] = 'L';
		arrayChar[12] = 'M';
		arrayChar[13] = 'N';
		arrayChar[14] = 'Ñ';
		arrayChar[15] = 'O';
		arrayChar[16] = 'P';
		arrayChar[17] = 'Q';
		arrayChar[18] = 'R';
		arrayChar[19] = 'S';
		arrayChar[20] = 'T';
		arrayChar[21] = 'U';
		arrayChar[22] = 'V';
		arrayChar[23] = 'W';
		arrayChar[24] = 'X';
		arrayChar[25] = 'Y';
		arrayChar[26] = 'Z';
	}
	public static char getCharSelected(char[] arrayChar, int pos) {
		return arrayChar[pos-1];
	}
}