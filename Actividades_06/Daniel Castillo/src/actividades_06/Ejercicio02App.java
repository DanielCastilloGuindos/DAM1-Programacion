package actividades_06;

import java.util.Scanner;

public class Ejercicio02App {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int num1,  num2, count;
		boolean exit = false;
		String result = "";
		do {
			int[] aNum1, aNum2;
			count = 0;
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			scan.nextLine();
			if (num1 == 0 && num2 == 0) {
				exit = true;
			} else if (num1 < 0 || num2 < 0 ) {
				System.out.println("Los numeros introducidos deben ser numeros positivos.");
			} else if (getSize(num1) > 1000 || getSize(num2) > 1000) {
				System.out.println("Los numeros introducidos deben contener menos de 1000 digitos.");
			} else {
				aNum1 = new int[getSize(num1)];
				aNum1 = getArrayOfNum(num1, getSize(num1));
				aNum2 = new int[getSize(num2)];
				aNum2 = getArrayOfNum(num2, getSize(num2));
				if (aNum1.length > aNum2.length) {
					count = getCount(aNum2, aNum1);
				} else {
					count = getCount(aNum1, aNum2);
				}
				result += count + "\n";
			}
		} while(!exit);
		System.out.println(result);
	}
	public static int getSize(int num) {
		int size = 0;
		int div = 1;
		while(true) {
			if(num > div) {
				size++;
				div*=10;
			} else {
				break;
			}
		}
		return size;
	}
	public static int[] getArrayOfNum(int num, int size) {
		int[] a = new int[size];
		int div = 1;
		int temp = num;
		for(int i = 1; i < size; i++) {
			div*=10;
		}
		for(int i = 0; i < a.length; i++) {
			a[i] = temp/div;
			temp= temp%div;
			div= div/10;
		}
		return a;
	}
	public static int getCount(int[] array1, int[] array2) {
		int count = 0, temp1 = 0, temp2 = 0;
		for(int i = array1.length-1, j = array2.length-1; i >= 0; i--, j--) {
			if (j<0) {
				temp1 = array1[i] + temp2;
			} else {
				temp1 = array1[i] + array2[j] + temp2;
			}
			if (temp1 > 9) {
				temp2 = temp1/10;
				count++;
			}
		}
		return count;
	}
}