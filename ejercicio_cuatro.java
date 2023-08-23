import java.util.Scanner;

public class ejercicio_cuatro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero y luego toque enter: ");
		double primer_num = scanner.nextDouble();
		
		System.out.println("Ingrese si es + ; - ; * ; /");
		char signo = scanner.next().charAt(0);
		
		System.out.println("Ingrese el segundo numero y luego ingrese enter: ");
		double segundo_num = scanner.nextDouble();
		
		double resultado = 0.0;
		
		switch (signo) {
        case '+':
            resultado = primer_num + segundo_num;
            break;
        case '-':
            resultado = primer_num - segundo_num;
            break;
        case '*':
            resultado = primer_num * segundo_num;
            break;
        case '/':
            if (segundo_num != 0) {
                resultado = primer_num / segundo_num;
            } else {
                System.out.println("Error: No se puede dividir por cero.");
                System.exit(0);
            }
            break;
        default:
            System.out.println("Operador no válido.");
            System.exit(0);
    }

    System.out.println("El resultado es: " + resultado);

    scanner.close();
}
}
