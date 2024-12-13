package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;

    private static ArrayList<Pais> paises = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this); 
    }

    public static Pais paisMasVendedor() {
        if (paises.isEmpty()) {
            return null; 
        }

        Pais paisMasVendedor = null;
        int maxVentas = 0;

        for (Pais pais : paises) {
            int ventasPorPais = 0;

            for (Fabricante fabricante : Fabricante.getFabricantes()) {
                if (fabricante.getPais().equals(pais)) {
                    ventasPorPais += fabricante.getCantidadVehiculosVendidos();
                }
            }

            if (ventasPorPais > maxVentas) {
                maxVentas = ventasPorPais;
                paisMasVendedor = pais;
            }
        }

        return paisMasVendedor;
    }

    public String getNombre() {
        return nombre;
    }
}