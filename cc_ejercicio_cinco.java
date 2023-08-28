import java.util.Arrays;
import java.util.Scanner;

public class cc_ejercicio_cinco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la primera cadena: ");
        String palabra1 = scanner.nextLine();

        System.out.println("Ingresa la segunda cadena: ");
        String palabra2 = scanner.nextLine();

        if (esAnagrama(palabra1, palabra2)) 
        {
            System.out.println("Las cadenas son anagramas.");
        } 
        else 
        {
            System.out.println("Las cadenas no son anagramas.");
        }

        scanner.close();
    }

    public static boolean esAnagrama(String cadena1, String cadena2) {
        cadena1 = cadena1.replaceAll("\\s", "").toLowerCase();
        cadena2 = cadena2.replaceAll("\\s", "").toLowerCase();

        if (cadena1.length() != cadena2.length()) {
            return false;
        }

        char[] arreglo1 = cadena1.toCharArray();
        char[] arreglo2 = cadena2.toCharArray();
        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        return Arrays.equals(arreglo1, arreglo2);

       
	}

}