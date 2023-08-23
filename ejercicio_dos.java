
public class ejercicio_dos {
// Me ayudo ChatGPT
	public static void main(String[] args) {
	
		for (int num = 50; num <= 100; num++) {
            boolean numprimo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    numprimo = false;
                    break;
                }
            }

            if (numprimo) {
                System.out.println("El número " + num + " es primo.");
            } else {
                System.out.print("El número " + num + " no es primo. Sus divisores son: ");
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        }
		
	}
	
}
