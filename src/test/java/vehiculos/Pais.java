package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private static ArrayList<Pais> paises = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public static Pais paisMasVendedor() {
        Pais paisMasVendido = null;
        int maxVentas = 0;

        // Iterar por cada país
        for (Pais pais : paises) {
            int ventasPais = 0;

            for (Fabricante fabricante : Fabricante.getFabricantes()) {
                if (fabricante.getPais() == pais) {
                    ventasPais += fabricante.getCantidadVehiculosVendidos();
                }
            }

            // Actualizar país con más ventas
            if (ventasPais > maxVentas) {
                maxVentas = ventasPais;
                paisMasVendido = pais;
            }
        }

        return paisMasVendido;
    }
}