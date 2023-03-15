package EjerciciosDeClaseChor.EjercicioFormula;

public class piloto {
	
	private String nombre;
	private int experiencia;
	private String equipo;
	private int numeroDeVictorias;
	
	
	public piloto(String nombre, int experiencia, String equipo, int numeroDeVictorias) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.equipo = equipo;
		this.numeroDeVictorias = numeroDeVictorias;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	public String getEquipo() {
		return equipo;
	}


	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}


	public int getNumeroDeVictorias() {
		return numeroDeVictorias;
	}


	public void setNumeroDeVictorias(int numeroDeVictorias) {
		this.numeroDeVictorias = numeroDeVictorias;
	}
	


	

}
