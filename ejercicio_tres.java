import java.util.Scanner;

public class ejercicio_tres {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero;
		boolean primo = false;
		
		while (!primo) {
			
			System.out.println("Ingrese un numero: ");
			numero = scanner.nextInt();
			
			if(numero > 100 && EsPrimo(numero)) {
				primo = true;
			}
			else {
				System.out.println("El numero no es primo.\n");
			}
			
		}
		
		scanner.close();
		System.out.println("El numero es primo.");
	}

	public static boolean EsPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
