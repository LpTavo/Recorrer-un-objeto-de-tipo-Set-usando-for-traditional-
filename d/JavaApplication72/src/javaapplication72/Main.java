import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear un conjunto de números
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        // Recorrer el conjunto usando for tradicional
        System.out.println("Recorrer el conjunto usando for tradicional:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        
        // Recorrer el conjunto usando foreach
        System.out.println("\nRecorrer el conjunto usando foreach:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        
        // Recorrer el conjunto usando while
        System.out.println("\nRecorrer el conjunto usando while:");
        numbers.forEach(number -> {
            System.out.println(number);
        });
        
        // Recorrer el conjunto usando do-while (no es muy común pero se puede hacer)
        System.out.println("\nRecorrer el conjunto usando do-while:");
        Iterator<Integer> iterator = numbers.iterator();
        do {
            Integer number = iterator.next();
            System.out.println(number);
        } while (iterator.hasNext());
    }
}
