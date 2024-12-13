package vehiculos;
import java.util.ArrayList;
public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	protected static int CantidadVehiculos;
	 protected static ArrayList<Vehiculo> listaDeVehiculos = new ArrayList<>();
	 public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		listaDeVehiculos.add(this);
		CantidadVehiculos++;	
	}
	public String vehiculosPorTipo() {
		 return "Automoviles: " + Automovil.getCantidadVehiculos() + 
	               "\nCamionetas: " + Camioneta.getCantidadVehiculos() + 
	               "\nCamiones: " + Camion.getCantidadVehiculos();	}
	
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadmaxima) {
		this.velocidadMaxima = velocidadmaxima;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String placa) {
		this.placa = placa;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return this.traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public void setCantidadVehiculos(int vehiculos) {
		CantidadVehiculos = vehiculos;
	}
}
