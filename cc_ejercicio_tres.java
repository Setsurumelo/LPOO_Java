import java.util.Scanner;

public class cc_ejercicio_tres {

	public static void main(String[] args) {
		
		boolean palindromo = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra: ");
		String palabra = scanner.nextLine();
		
		if (palindromo(palabra)) {
			System.out.println("La palabra es palindromo");
		}
		else {
			System.out.println("La palabra no es palindromo");
		}
				
	}
	
	public static boolean palindromo(String palabra) {
		palabra = palabra.toLowerCase().replaceAll("[^a-z]", "");
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
	}
	
}

/*

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        scanner.close();
    }

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().replaceAll("[^a-z]", ""); // Convertir a minúsculas y quitar caracteres no alfabéticos
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
*/