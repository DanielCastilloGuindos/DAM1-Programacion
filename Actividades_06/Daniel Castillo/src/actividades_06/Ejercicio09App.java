package actividades_06;

import java.util.Scanner;

public class Ejercicio09App {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int numCasos, up, down;
		int[][] nums;
	
		numCasos = scan.nextInt();
		scan.nextLine();
	
		nums = new int[numCasos][];
	
		for(int i = 0; i < numCasos; i++) {
			int size = scan.nextInt();
			scan.nextLine();
	
			nums[i] = new int[size];
	
			for(int j = 0; j < size; j++) {
				nums[i][j] = scan.nextInt();
			}
			scan.nextLine();
		}
	
		for(int i = 0; i < nums.length; i++) {
			int temp1, temp2;
			up = 0;
			down = 0;

			for(int j = 0; j < nums[i].length-1; j++) {
				temp1 = nums[i][j];
				temp2 = nums[i][j+1];
	
				if (temp1 < temp2) {
					up++;
				} else if (temp1 > temp2) {
					down++;
				}
			}
	
			System.out.println(up + " " + down);
		}
	}
}