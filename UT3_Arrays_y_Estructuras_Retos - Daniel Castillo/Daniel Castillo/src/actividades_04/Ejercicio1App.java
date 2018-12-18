package actividades_04;

import java.util.Scanner;

public class Ejercicio1App {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int[] nums = new int[10];
		setMostrar(getRellenar(nums, Scan));
	}
	
	public static int[] getRellenar(int[] nums, Scanner Scan) {
		System.out.println("Rellenando array:");
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Posicion nº" + (i+1) + ":");
			nums[i] = Scan.nextInt();
		}
		return nums;
	}
	
	public static void setMostrar(int[] nums) {
		System.out.println("Mostrar array:");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}