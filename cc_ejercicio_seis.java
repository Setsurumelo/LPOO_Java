import java.util.Scanner;

public class cc_ejercicio_seis {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        String cadenaMasLarga = "";
        int longitudMaxima = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresa la palabra #" + i + ": ");
            String palabra = scanner.nextLine();

            if (palabra.length() > longitudMaxima) {
                longitudMaxima = palabra.length();
                cadenaMasLarga = palabra;
            }
        }

        System.out.println("La cadena más larga es: " + cadenaMasLarga);

        scanner.close();

	}

}