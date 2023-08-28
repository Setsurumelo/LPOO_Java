import java.util.Scanner;

public class cc_ejercicio_cuatro {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una cadena de caracteres: ");
		String palabra = scanner.nextLine();
		
		System.out.println("Ingrese el caracter que quiere reemplazar: ");
		char caracterViejo = scanner.next().charAt(0);
		
		System.out.println("Ingrese el caracter que va a reemplazar al anterior: ");
		char caracterNuevo = scanner.next().charAt(0);

		String nuevaPalabra = reemplazaCaracter(palabra, caracterViejo, caracterNuevo);
		
        System.out.println("Cadena resultante: " + nuevaPalabra);

        scanner.close();

	}

	public static String reemplazaCaracter(String cadena, char caracterOriginal, char caracterReemplazo) {
        return cadena.replace(caracterOriginal, caracterReemplazo);
    }
	
}