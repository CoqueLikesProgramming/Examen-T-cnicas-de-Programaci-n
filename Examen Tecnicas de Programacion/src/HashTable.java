import java.util.HashMap;
import java.util.Map;
//import java.util.Set;

public class HashTable {

    public static void main(String[] args) {
        // Creamos una nueva tabla hash
        Map<String,Integer> tablaHash = new HashMap<String,Integer>();

        // Agregamos algunos elementos a la tabla hash
        tablaHash.put("Alvaro",56);
        tablaHash.put("Alvaro Jr", 21);
        tablaHash.put("Karina", 57);

        // Numero de entradas en el Mapa
        System.out.println("El número de entradas en el Mapa es : " + tablaHash.size());

        // Accedemos al ´value´ de un elemento de la tabla hash, dada la ´key´
        int edadAlvaroJr = tablaHash.get("Alvaro Jr");
        System.out.println("La edad de Alvaro Jr es: " + edadAlvaroJr);

        // Iteramos a TODOS los elementos de la tabla hash (Metodo 2)
        for (Map.Entry<String, Integer> entrada : tablaHash.entrySet()) {
            String nombre = entrada.getKey();
            int edad = entrada.getValue();
            System.out.println(nombre + " tiene " + edad + " años");
        }
    }
}
