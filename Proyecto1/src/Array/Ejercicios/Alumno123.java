package Array.Ejercicios;

public class Alumno123 {
	private String nombreAlumno;
	private String apellidoAlumn;
	private Asignatura12 [] asignatura;

	public Alumno123(String nombreAlumno, String apellidoAlumn, Asignatura12 [] asignatura) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.apellidoAlumn = apellidoAlumn;
		this.asignatura = asignatura;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidoAlumn() {
		return apellidoAlumn;
	}

	public void setApellidoAlumn(String apellidoAlumn) {
		this.apellidoAlumn = apellidoAlumn;
	}

	public Asignatura12[] getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura12[] asignatura) {
		this.asignatura = asignatura;
	}

}
