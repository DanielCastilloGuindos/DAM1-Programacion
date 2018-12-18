package actividades_05;

import java.util.Scanner;

public class Ejercicio1ClasesApp {
	private static Scanner Scan;
	private static Player p1 = new Player();
	private static Player p2 = new Player();
	private static String Option;
	private static boolean opcionValida = false;
	public static void main(String[] args) {
		Scan = new Scanner(System.in);
		System.out.println("PIEDRA PAPEL TIJERA");
		do{
			getValidateOptions(p1);
			getValidateOptions(p2);
			getResult(p1.getMov(), p2.getMov());
		} while(false);
	}
	public static void getValidateOptions(Player p) {
		opcionValida = false;
		do {
			System.out.println("Introduce opcion Player " + "" + ":[ piedra | papel | tijeras ]");
			Option = Scan.next();
			Scan.nextLine();
			switch(Option.toLowerCase()) {
				case "piedra":
				case "papel":
				case "tijeras":
					opcionValida = true;
					p.setMov(Option);
					break;
				default:
					System.out.println("Opcion No Valida");
					break;
			}
		} while(!opcionValida);
	}
	public static void getResult(String oP1, String oP2) {
		if(oP1.equalsIgnoreCase(oP2)) {
			System.out.println("Empate.");
		} else if(oP1.equalsIgnoreCase("tijeras") && oP2.equalsIgnoreCase("papel")) {
			System.out.println("Gana player 1.");
		} else if(oP1.equalsIgnoreCase("tijeras") && oP2.equalsIgnoreCase("piedra")) {
			System.out.println("Gana player 2.");
		} else if(oP1.equalsIgnoreCase("piedra") && oP2.equalsIgnoreCase("tijeras")) {
			System.out.println("Gana player 1.");
		} else if(oP1.equalsIgnoreCase("piedra") && oP2.equalsIgnoreCase("papel")) {
			System.out.println("Gana player 2.");
		} else if(oP1.equalsIgnoreCase("papel") && oP2.equalsIgnoreCase("piedra")) {
			System.out.println("Gana player 1.");
		} else if(oP1.equalsIgnoreCase("papel") && oP2.equalsIgnoreCase("tijeras")) {
			System.out.println("Gana player 2.");
		} else {
			System.out.println("Error no esperado.");
		}
	}
}

class Player{
	private int live;
	private String mov;
	private boolean status;
	public Player() {
		this.live = 2;
		this.status = true;
	}
	public void setliveLose(){
		if(status) {
			this.live--;
			if(this.live <= 0) {
				this.status = false;
			}
		} else {
			System.out.println("Error.");
		}
	}
	public int getLive(){
		return this.live;
	}
	public void setMov(String movPosible) {
		this.mov = movPosible;
	}
	public String getMov() {
		return this.mov;
	}
	public boolean getStatus() {
		return this.status;
	}
}