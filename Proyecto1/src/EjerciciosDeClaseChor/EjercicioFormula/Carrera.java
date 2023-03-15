package EjerciciosDeClaseChor.EjercicioFormula;

public class Carrera {
	private String nombre;
	private String nombreCircuito;
	public int parrilladeSalida;
	public int distancia;
	
	
	public Carrera(String nombre, String nombreCircuito, int parrilladeSalida, int distancia) {
		super();
		this.nombre = nombre;
		this.nombreCircuito = nombreCircuito;
		this.parrilladeSalida = parrilladeSalida;
		this.distancia = distancia;
	}


	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNombreCircuito() {
		return nombreCircuito;
	}


	public void setNombreCircuito(String nombreCircuito) {
		this.nombreCircuito = nombreCircuito;
	}


	public int getParrilladeSalida() {
		return parrilladeSalida;
	}


	public void setParrilladeSalida(int parrilladeSalida) {
		this.parrilladeSalida = parrilladeSalida;
	}


	public int getDistancia() {
		return distancia;
	}


	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	
	
	
}
