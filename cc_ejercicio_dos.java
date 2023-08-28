import java.util.Scanner;

public class cc_ejercicio_dos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        int vocales = vocales(palabra);

        System.out.println("La palabra tiene " + vocales + " vocales.");

        scanner.close();

	}
	
	public static int vocales(String cadena) {
		
        int contador = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = Character.toLowerCase(cadena.charAt(i));
        
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        
        }
        
        return contador;
    }

}