package actividades_04;

import java.util.Scanner;

public class Ejercicio3App {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño:");
		int[] nums = new int[getTamaño(Scan)];

		System.out.println("Introduce limite de numero:");
		nums = getNumAleatoriosPrimos(Scan, nums);
		setMostrarArray(nums);
		
		System.out.println("\nEl numero maximo es:");
		getMayorNumero(nums);
	}
	public static void setMostrarArray(int[] x) {
		System.out.println("Mostrar el array:");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
	public static int getTamaño(Scanner Scan) {
		int Tamaño = Scan.nextInt();
		return Tamaño;
	}
	public static int[] getNumAleatoriosPrimos(Scanner Scan, int[] x) {
		int i = 0;
		int limit = Scan.nextInt();
		int num = 0;
		boolean primo = true;
		while(i < x.length) {
			num = (int)Math.round(Math.random()*limit);
			for(int a = 2; a < num; a++){
				if((num%a) == 0){
					primo = false;
					break;
				} else {
					if(a==(num - 1))
						primo = true;
				}
			}
			if(primo) {
				x[i] = num;
				i++;
			}
		}
		return x;
	}
	public static void getMayorNumero(int[] x) {
		int maxNum = 0;
		for (int i : x) {
			if(i > maxNum) {
				maxNum = i;
			}
		}
		System.out.println(maxNum);
	}
}