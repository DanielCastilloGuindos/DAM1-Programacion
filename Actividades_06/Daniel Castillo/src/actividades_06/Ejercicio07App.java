package actividades_06;

import java.util.Scanner;

public class Ejercicio07App {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int numCasos, num, result = 0;
		int[] nums;
		numCasos = scan.nextInt();
		scan.nextLine();
		nums = new int[numCasos];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
			scan.nextLine();
		}
		for(int i = 0; i < nums.length; i++) {
			result = 1;
			num = nums[i];
			for(int j = 1; j <= num; j++) {
				result *= j;
			}
			result = getLastNumber(result, getSize(result));
			System.out.println(result);
		}
	}
	public static int getSize(int number) {
		int div = 10, resto = number, count = 0;
		while(resto > 10) {
			resto = resto/div;
			count++;
		}

		return count+1;
	}
	public static int getLastNumber(int number, int size){
		int[] a = new int[size];
		int div = 1, temp = number;
		for(int i = 1; i < size; i++) {
			div*= 10;
		}
		for(int i = 0; i < size; i++) {
			a[i] = temp/div;
			temp= temp%div;
			div= div/10;
		}
		return a[size-1];
	}
}