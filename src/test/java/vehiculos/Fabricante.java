package vehiculos;
import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    private int cantidadVehiculosVendidos;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.cantidadVehiculosVendidos = 0;
        fabricantes.add(this);
    }

    public void incrementarVentas() {
        this.cantidadVehiculosVendidos++;
    }

    public static ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public int getCantidadVehiculosVendidos() {
        return cantidadVehiculosVendidos;
    }

    // Método para encontrar la fábrica con más ventas
    public static Fabricante fabricaMayorVentas() {
        int maxVentas = 0;
        Fabricante fabricaMasVendedora = null;

        // Iterar por cada fabricante
        for (Fabricante fabricante : fabricantes) {
            if (fabricante.getCantidadVehiculosVendidos() > maxVentas) {
                maxVentas = fabricante.getCantidadVehiculosVendidos();
                fabricaMasVendedora = fabricante;
            }
        }

        return fabricaMasVendedora;
    }
}