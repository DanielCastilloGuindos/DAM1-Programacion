package actividades_05;

import java.util.Scanner;

public class Ejercicio1App {
	private static Scanner Scan;
	public static void main(String[] args) {
		Scan = new Scanner(System.in);
		String OptionPlayer1 = "";
		int PointPlayer1 = 0;
		String OptionPlayer2 = "";
		int PointPlayer2 = 0;
		boolean opcionValida = false;
		System.out.println("PIEDRA PAPEL TIJERA");
		do{
			do {
				System.out.println("Introduce opcion Player1:[ piedra | papel | tijeras ]");
				OptionPlayer1 = Scan.next();
				Scan.nextLine();
				switch(OptionPlayer1.toLowerCase()) {
					case "piedra":
					case "papel":
					case "tijeras":
						opcionValida = true;
						break;
					default:
						System.out.println("Opcion No Valida");
						break;
				}
			} while(!opcionValida);
			opcionValida = false;
			
			do {
				System.out.println("Introduce opcion Player2:[ piedra | papel | tijeras ]");
				OptionPlayer2 = Scan.next();
				Scan.nextLine();
				switch(OptionPlayer2.toLowerCase()) {
					case "piedra":
					case "papel":
					case "tijeras":
						opcionValida = true;
						break;
					default:
						System.out.println("Opcion No Valida");
						break;
				}
			} while(!opcionValida);
			opcionValida = false;
			
			if(OptionPlayer1.equalsIgnoreCase(OptionPlayer2)) {
				System.out.println("Empate.");
			} else if(OptionPlayer1.equalsIgnoreCase("tijeras") && OptionPlayer2.equalsIgnoreCase("papel")) {
				System.out.println("Gana player 1.");
				PointPlayer1++;
			} else if(OptionPlayer1.equalsIgnoreCase("tijeras") && OptionPlayer2.equalsIgnoreCase("piedra")) {
				System.out.println("Gana player 2.");
				PointPlayer2++;
			} else if(OptionPlayer1.equalsIgnoreCase("piedra") && OptionPlayer2.equalsIgnoreCase("tijeras")) {
				System.out.println("Gana player 1.");
				PointPlayer1++;
			} else if(OptionPlayer1.equalsIgnoreCase("piedra") && OptionPlayer2.equalsIgnoreCase("papel")) {
				System.out.println("Gana player 2.");
				PointPlayer2++;
			} else if(OptionPlayer1.equalsIgnoreCase("papel") && OptionPlayer2.equalsIgnoreCase("piedra")) {
				System.out.println("Gana player 1.");
				PointPlayer1++;
			} else if(OptionPlayer1.equalsIgnoreCase("papel") && OptionPlayer2.equalsIgnoreCase("tijeras")) {
				System.out.println("Gana player 2.");
				PointPlayer2++;
			} else {
				System.out.println("Error no esperado.");
			}
		} while((PointPlayer1+PointPlayer2) < 3);
		
		if(PointPlayer1 > PointPlayer2) {
			System.out.println("¡Gana Player 1!");
		} else {
			System.out.println("¡Gana Player 2!");
		}
	}
}