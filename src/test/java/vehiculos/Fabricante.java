package vehiculos;
import java.util.*;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas;

    private static List<Fabricante> fabricantes = new ArrayList<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ventas = 0; 
        fabricantes.add(this);  
    }

    public void agregarVentas(int cantidad) {
        this.ventas += cantidad;
    }

    public static Fabricante fabricaMayorVentas() {
        if (fabricantes.isEmpty()) {
            return null; 
        }

        Fabricante fabricanteMayorVentas = null;
        int maxVentas = 0;

   
        for (Fabricante fabricante : fabricantes) {
            if (fabricante.getVentas() > maxVentas) {
                maxVentas = fabricante.getVentas();
                fabricanteMayorVentas = fabricante;
            }
        }
        return fabricanteMayorVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVentas() {
        return ventas;
    }

    public Pais getPais() {
        return pais;
    }
}