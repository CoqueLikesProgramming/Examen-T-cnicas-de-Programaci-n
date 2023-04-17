import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class GrafosPuertosAristas {

    private Map<String, List<Arista>> grafo;

    public GrafosPuertosAristas() {
        // Creamos una tabla hash que sera el grafo
        this.grafo = new HashMap<String,List<Arista>>();
    }

    public void addPuerto(String puerto) {
        this.grafo.put(puerto, new ArrayList<>());
    }

    public ArrayList<String> getPuertoOrigen() {
        ArrayList<String> Puertos = new ArrayList<String>();
        for (Map.Entry<String, List<Arista>> entrada : grafo.entrySet()) {
            String nombrePuerto = entrada.getKey();
            Puertos.add(nombrePuerto);
        }
        return Puertos;
    }

    public void addArista(String puertoOrigen, String puertoDestino, int distancia) {
        Arista aristaOrigenDestino = new Arista(puertoDestino,distancia);
        this.grafo.get(puertoOrigen).add(aristaOrigenDestino);

        Arista aristaDestinoOrigen = new Arista(puertoOrigen,distancia);
        this.grafo.get(puertoDestino).add(aristaDestinoOrigen);
    }

    public String puertoConMasAristas() {
        String puertoMasAristas = "";
        int maxAristas = 0;

        for (String puerto : grafo.keySet()) {
            try {
                int numAristas = grafo.get(puerto).size();
                if (numAristas > maxAristas) {
                    maxAristas = numAristas;
                    puertoMasAristas = puerto;
                }
            } catch (NullPointerException e) {
                continue;
            }
        }

        eliminarPuerto(puertoMasAristas);
        return puertoMasAristas;
    }

    private void eliminarPuerto(String puerto) {
        List<Arista> aristas = grafo.get(puerto);
        try {
            for (Arista arista : aristas) {
                String puertoDestino = arista.getPuertoDestino();
                List<Arista> aristasDestino = grafo.get(puertoDestino);
                for (int i = 0; i < aristasDestino.size(); i++) {
                    if (aristasDestino.get(i).getPuertoDestino().equals(puerto)) {
                        aristasDestino.remove(i);
                        break;
                    }
                }
            }
        } catch (NullPointerException e) {

        }
        grafo.remove(puerto);
    }

    private class Arista {
        private String puertoDestino;
        private int distancia;

        public Arista(String puertoDestino, int distancia) {
            this.puertoDestino = puertoDestino;
            this.distancia = distancia;
        }

        public String getPuertoDestino() {
            return this.puertoDestino;
        }

        public int getDistancia() {
            return this.distancia;
        }
    }

    public static void main(String[] args) {

        // Nombres de los puertos
        String madero = new String("Madero");
        String rodas = new String("Rodas");
        String p1 = new String("P1");
        String p2 = new String("P2");
        String p3 = new String("P3");
        String p4 = new String("P4");
        String p5 = new String("P5");

        // Creamos el grafo y agregamos los puertos
        GrafosPuertosAristas miGrafo = new GrafosPuertosAristas();

        // Agregamos los puertos
        miGrafo.addPuerto(madero);
        miGrafo.addPuerto(rodas);
        miGrafo.addPuerto(p1);
        miGrafo.addPuerto(p2);
        miGrafo.addPuerto(p3);
        miGrafo.addPuerto(p4);
        miGrafo.addPuerto(p5);

        // Agregamos los puertos
        miGrafo.addArista(madero, rodas, 4000);
        miGrafo.addArista(rodas, madero, 4000); // distancia madero-rodas = distancia rodas-madero, por lo que grafo no dirigido (como dice enunciado)
        miGrafo.addArista(p5, p4, 40);
        miGrafo.addArista(p5, p3, 400);
        miGrafo.addArista(p5, p2, 20);
        miGrafo.addArista(p5, p1, 200);

        // Imprimimos la lista de puertos inicial
        ArrayList<String> listaPuertos = miGrafo.getPuertoOrigen();
        for (String elemento : listaPuertos) {
            System.out.println(elemento);
        }

        // Eliminamos el puerto con más aristas
        // Puerto puertoConMasAristas = grafo.puertoConMasAristas();
        String puertoConMasAristas = miGrafo.puertoConMasAristas();
        miGrafo.eliminarPuerto(puertoConMasAristas);
        System.out.println("Puerto con más aristas eliminado: " + puertoConMasAristas);

        // Imprimimos los puertos restantes
        System.out.println("Puertos restantes:");
        ArrayList<String> puertos = miGrafo.getPuertoOrigen();
        for (String puerto : puertos) {
            System.out.println(puerto);
        }
    }
}