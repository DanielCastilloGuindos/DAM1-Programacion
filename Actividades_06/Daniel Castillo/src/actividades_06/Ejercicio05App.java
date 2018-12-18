package actividades_06;

import java.util.Scanner;

public class Ejercicio05App {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int EXIT = 6174, numCasos, num1, num2, result = 0, numIntentos;
		int[] nums;
		int[] numAr1 = new int[4];
		int[] numAr2 = new int[4];

		System.out.println("Introduce numero de casos de prueba:");
		numCasos = scan.nextInt();
		scan.nextLine();

		nums = new int[numCasos];

		for(int i = 0; i < numCasos; i++) {
			System.out.println("Introduce un numero de cuatro cifras:");
			nums[i] = scan.nextInt();
			scan.nextLine();
		}

		for(int i = 0; i < numCasos; i++) {
			num1 = nums[i];
			numIntentos = 0;
			System.out.println("-------------------" + num1 + "-------------------");
			do {
				numIntentos++;
				numAr1 = getArray(num1);
				numAr1 = getArrayOrdenado(numAr1);
				numAr2 = getArrayReverse(numAr1);
				num1 = getNumOfArray(numAr1);
				num2 = getNumOfArray(numAr2);

				if(num1 > num2) {
					result = num1 - num2;
					System.out.println(num1 + " - " + num2 + " = " + result);
				} else if(num2 > num1) {
					result = num2 - num1;
					System.out.println(num2 + " - " + num1 + " = " + result);
				}
				num1 = result;
			} while(result != EXIT);

			System.out.println("Nº de vueltas dadas hasta llegar a 6174: " + numIntentos);
		}
	}

	public static int[] getArray(int num) {
		int[] a = new int[4];
		int div = 1000, temp = num;

		for(int i = 0; i < 4; i++) {
			a[i] = temp/div;
			temp= temp%div;
			div= div/10;
		}

		return a;
	}

	public static int[] getArrayOrdenado(int[] array) {
		int[] arrayOr = new int[array.length];
		int tempPos, tempRep;

		for(int i = 0; i < array.length; i++) {
			tempPos = 0;
			tempRep = 0;

			for(int j = 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					tempPos++;
				}
			}

			for(int j = 0; j < array.length; j++) {
				if (array[i] == arrayOr[j]) {
					tempRep++;
				}
			}

			arrayOr[tempPos+tempRep] = array[i];
		}

		return arrayOr;
	}

	public static int[] getArrayReverse(int[] array){
		int[] arrayRev = new int[array.length];

		for(int i = 0, j = array.length-1; i < 4; i++, j--) {
			arrayRev[j] = array[i];
		}

		return arrayRev;
	}

	public static int getNumOfArray(int[] array) {
		int num = 0, mult = 1;

		for(int i = 1; i < array.length; i++) {
			mult *= 10;
		}

		for(int i = 0; i < array.length; i++) {
			num += array[i] * mult;
			mult/=10;
		}

		return num;
	}
}