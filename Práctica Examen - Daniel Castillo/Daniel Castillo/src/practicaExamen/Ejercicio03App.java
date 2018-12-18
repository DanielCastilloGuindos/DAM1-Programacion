package practicaExamen;

import java.util.Scanner;
/**
 * @author DanielCastilloGuindos
 *
 */
public class Ejercicio03App {
	private static Scanner Scan;
	public static void main(String[] args) {
		Scan = new Scanner(System.in);
		int num1;
		int num2;
		int[] nums;

		System.out.println("Introduce primer numero:");
		num1 = Scan.nextInt();
		Scan.nextLine();
		System.out.println("Introduce segundo numero:");
		num2 = Scan.nextInt();
		Scan.nextLine();

		if(num1 < num2) {
			nums = new int[getTamaño(num1, num2)];
			setArray(num1, num2, nums);
			getPrimosYNoPrimos(nums);
		} else if(num2 < num1) {
			nums = new int[getTamaño(num2, num1)];
			setArray(num2, num1, nums);
			getPrimosYNoPrimos(nums);
		} else {
			System.out.println("Ambos numeros son iguales. No hay valores intermedios.");
		}
	}
	
	public static int getTamaño(int numMin, int numMax){
		return (numMax - numMin) + 1;
	}
	public static void setArray(int numMin, int numMax, int[] arr){
		for(int i = 0, v = numMin; i < arr.length; i++, v++) {
			arr[i] = v;			
		}
	}
	public static void getPrimosYNoPrimos(int[] arr){
		boolean primo;
		for(int i = 0; i < arr.length; i++){
			primo = true;
			for(int a = 2; a < arr[i]-1; a++) {
				if((arr[i]%a) == 0) {
					primo = false;
				}
			}
			if(primo) {
				System.out.println(arr[i] + " es primo.");
			} else if(!primo) {
				System.out.println(arr[i] + " no es primo.");
			}
		}
	}
}