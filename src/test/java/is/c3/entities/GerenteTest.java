package is.c3.entities;


import is.c3.model.Pelicula;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GerenteTest {

	private Cine cine;

	@BeforeEach
	public void setUp() {
		// Antes de cada test, creamos una nueva instancia del cine
		cine = new Cine();
	}

	@Test
	public void testdelete() {
		PeliculaCine p1 = new PeliculaCine("Captain America: Brave New World", "Julius Onah", 118);
		PeliculaCine p2 = new PeliculaCine("Mission: Impossible – The Final Reckoning", "Christopher McQuarrie", 163);
		
		cine.save(p1);
		cine.save(p2);
		
		// Permitir eliminar un libro en concreto
		cine.delete(p1);

		assertFalse(cine.find(p1), "Película añadida incorrectamente");
	}
	
	@Test
	public void testSave() {
		PeliculaCine p1 = new PeliculaCine("Captain America: Brave New World", "Julius Onah", 118);
		
		//Añadir una película
		cine.save(p1);

		assertTrue(cine.find(p1), "Película añadida correctamente");
	}
	
	@Test
	public void testDeleteAll() {
		//TODO
	}
	
	@Test
	public void testSaveAll() {
		
		PeliculaCine p1 = new PeliculaCine("Captain America: Brave New World", "Julius Onah", 118);
		PeliculaCine p2 = new PeliculaCine("Mission: Impossible – The Final Reckoning", "Christopher McQuarrie", 163);
		PeliculaCine p3 = new PeliculaCine("Snow White", "Marc Webb", 109);
		
	    PeliculaCine[] peliculas = {p1, p2, p3};
		
		// Almacenar varias películas
		cine.saveAll(peliculas);		
				
		assertEquals(cine.getPeliculas().size(), 3, "Almacenados incorrectamente");
	}

	

}
