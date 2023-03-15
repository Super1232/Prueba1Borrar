package Array.Ejercicios;

public class EjericicioAsignaturas {

	public static void main(String[] args) {

		Asignatura12 asignatura = new Asignatura12("Educacion Informatica", 8.5);
		Asignatura12 asignatura2 = new Asignatura12("Program", 6.8);

		Asignatura12[] AsignaturasAlumnoDe1 = { asignatura, asignatura2 };

		Alumno123 alumno1 = new Alumno123("Pedro", "Rodillo", AsignaturasAlumnoDe1);

		Asignatura12 asignaturaAlumno21 = new Asignatura12("Educacion Informatica", 3.5);
		Asignatura12 asignaturaAlumno22 = new Asignatura12("Program", 7.8);

		Asignatura12[] AsignaturasAlumnoDe2 = { asignaturaAlumno21, asignaturaAlumno22 };

		Alumno123 alumno2 = new Alumno123("Manel", "Pep", AsignaturasAlumnoDe2);

		// Creo el array alumno para asi
		Alumno123[] alumnos = { alumno1, alumno2 };
		// Aqui lo que hacemos es crear un array que contenga todo lo que se almacena en
		// las clases creadas de alumnoy luego coges y imprimes nombre
		System.out.print(alumnos[0].getNombreAlumno());
		System.out.print(" ");
		// Aqui lo que hago es irme al array donde he almacenado las notas y elegir la
		// nota que quiero sacar y hacemos lo mismo con alumno
		System.out.print(alumnos[0].getAsignatura()[0].getNombre());
		System.out.print(" ");
		System.out.print(alumnos[0].getAsignatura()[0].getNota());

		System.out.print(" ");
		System.out.print(alumnos[0].getAsignatura()[1].getNombre());
		System.out.print(" ");
		System.out.println(alumnos[0].getAsignatura()[1].getNota());

		System.out.print(alumnos[1].getNombreAlumno());
		System.out.print(" ");
		System.out.print(alumnos[1].getAsignatura()[1].getNombre());
		System.out.print(" ");
		System.out.print(alumnos[1].getAsignatura()[0].getNota());
		System.out.print(" ");
		System.out.print(alumnos[1].getAsignatura()[1].getNombre());
		System.out.print(" ");
		System.out.println(alumnos[1].getAsignatura()[1].getNota());

		// Lo hacemos de otra forma mas optimizada utilizando un bucle
		for (Alumno123 alumno : alumnos) {
			System.out.println(alumno.getNombreAlumno());
			Asignatura12[] asignaturaAlumno = alumno.getAsignatura();
			for (Asignatura12 asignatura12 : asignaturaAlumno) {
				System.out.println("\t" + asignatura.getNombre() + ",nota" + asignatura.getNota());
			}

		}

	}

}
