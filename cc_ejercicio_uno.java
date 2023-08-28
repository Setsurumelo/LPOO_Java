import java.util.Scanner;

public class cc_ejercicio_uno {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Su nombre es " + nombre);
		
		scanner.close();
	}
	
}
