
import java.util.Scanner;

	public class FactorialNumero {
	
	private int num;
	private int factorial = 1;
	
	public void leerNumero() {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = lectura.nextInt();
		calcularFactorial(num);
			
		}
	
	public void calcularFactorial(int num) {
		for (int i = 1; i <= num; i++) {
			factorial=factorial*i;
		}
		
		System.out.println("El factorial de " + num + " es: " + factorial);
		
		
	}	
	
	//public void calcularSumatorio(int num) {
		
	}

}
