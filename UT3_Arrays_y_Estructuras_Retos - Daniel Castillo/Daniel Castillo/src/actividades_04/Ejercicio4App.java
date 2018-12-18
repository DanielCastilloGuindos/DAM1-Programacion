package actividades_04;

public class Ejercicio4App {
	public static void main(String[] args) {
		int[] nums = new int[100];
		nums = getRellenar(nums);
		System.out.println("Mostrar array:");
		setMostrarArray(nums);
		System.out.println("Mostrar suma total:");
		System.out.println(getSumaTotal(nums));
		System.out.println("Mostrar media:");
		System.out.println(getMedia(getSumaTotal(nums), nums.length));
	}
	public static void setMostrarArray(int[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
	public static int[] getRellenar(int[] x) {
		for(int i = 0; i<x.length;i++) {
			x[i] = i+1;
		}
		return x;
	}
	public static int getSumaTotal(int[] x) {
		int result = 0;
		for(int i = 0; i<x.length;i++) {
			result += x[i];
		}
		return result;
	}
	public static int getMedia(int numSumaTotal, int tamaño){
		return numSumaTotal/tamaño;
	}
}