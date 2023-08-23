import java.util.ArrayList;
import java.util.List;

public class ejercicio_cinco {
    
	public static void main(String[] args) {
		
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Ana");

        System.out.println("Lista de nombres:");
        
        for (String nombre : nombres) {
        	
            System.out.println(nombre);
        
        }
    }
	
}


