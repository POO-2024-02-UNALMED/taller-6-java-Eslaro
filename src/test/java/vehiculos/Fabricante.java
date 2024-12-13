package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;

    Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }
}