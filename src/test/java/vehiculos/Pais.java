package vehiculos;
import java.util.*;

public class Pais {
    private String nombre;
    private int ventas;  

    private static List<Pais> paises = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        this.ventas = 0;  
        paises.add(this);  
    }

    public void agregarVentas(int cantidad) {
        this.ventas += cantidad;
    }

    public static Pais paisMasVendedor() {
        Pais paisMasVendedor = null;
        int maxVentas = 0;

        for (Pais pais : paises) {
            if (pais.getVentas() > maxVentas) {
                maxVentas = pais.getVentas();
                paisMasVendedor = pais;
            }
        }

        return paisMasVendedor;
    }

   
    public String getNombre() {
        return nombre;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
}