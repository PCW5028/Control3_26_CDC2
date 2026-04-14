package is.c3.model.entities;

import java.util.logging.Logger;

import is.c3.model.Pelicula;

/**
 * Datos de un tipo particular de Libro: una Novela 
 */
public class PeliculaCine implements Pelicula, Comparable<PeliculaCine> {
	private static Logger log = Logger.getLogger(PeliculaCine.class.getName());
	private String director;
	private String titulo;
	private int duracion;

	// Constructor
	public PeliculaCine(String titulo, String director, int duracion) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
	}

	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String getDirector() {
		return director;
	}

	@Override
	public void setDirector(String director) {
		this.director = director;
		
	}

	@Override
	public int getDuracion() {
		return duracion;
	}

	@Override
	public void setDuracion(int duracion) {
		this.duracion = duracion;
		
	}
	
	@Override
	public String toString() {
		String sms = "\nDatos de la película: \nTitulo: " + titulo + "\nDirector: " + director+ "\nDuración: "
				+ duracion + "\n***************************************\n";
		return sms;
	}

	// La ordenación natural se llevará a cabo por la duración de la película, de un modo ascendente
	@Override
	public int compareTo(PeliculaCine p1) {
		return (p1.duracion - this.duracion);
	}

	

}
