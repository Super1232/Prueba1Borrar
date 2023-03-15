package EjerciciosDeClaseChor.EjercicioFormula;

public class CochesF1 {
	
	private String escuderia;
	private String motor;
	private int numero;
	private piloto piloto;
	public int velocidad;
	public int avance;
	
	
	public CochesF1(String escuderia, String motor, int numero, piloto piloto, int velocidad, int avance) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.velocidad = velocidad;
		this.avance = avance;
	}
	
	

	
	public String getEscuderia() {
		return escuderia;
	}




	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}




	public String getMotor() {
		return motor;
	}




	public void setMotor(String motor) {
		this.motor = motor;
	}




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	public piloto getPiloto() {
		return piloto;
	}




	public void setPiloto(piloto piloto) {
		this.piloto = piloto;
	}




	public int getVelocidad() {
		return velocidad;
	}




	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}




	public int getAvance() {
		return avance;
	}




	public void setAvance(int avance) {
		this.avance = avance;
	}




	public void correr() {
		int numero = (int)(Math.random()*10+1);
		avance = avance + numero + velocidad + piloto.getExperiencia();
		
	}
	
	
	


}
