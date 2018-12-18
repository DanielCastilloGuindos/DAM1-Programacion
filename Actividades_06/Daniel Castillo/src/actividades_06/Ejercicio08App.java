package actividades_06;

import java.util.Scanner;

public class Ejercicio08App {
	private static Scanner scan;

	public static void main(String[] args){
		scan = new Scanner(System.in);
		int strongHobbit, temp1, numEslabon, viajesSobrantes;
		String Resultados = "";

		do{
			viajesSobrantes = 0;
			strongHobbit = scan.nextInt();
			numEslabon = scan.nextInt();
			scan.nextLine();

			if(strongHobbit == 0 && numEslabon == 0){
				break;
			}

			temp1 = strongHobbit;

			if(numEslabon > strongHobbit){
				strongHobbit*=2;
			}

			while(strongHobbit < numEslabon){
				numEslabon = numEslabon-strongHobbit;
				strongHobbit = temp1;
				viajesSobrantes++;
			}

			Resultados += viajesSobrantes + "\n";
		} while(true);
		
		System.out.println(Resultados);
		
	}
}