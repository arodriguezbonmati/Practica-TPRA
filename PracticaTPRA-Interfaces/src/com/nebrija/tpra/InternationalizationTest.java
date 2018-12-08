package com.nebrija.tpra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InternationalizationTest {

	@Test
	void testInternationalization() {
		
		Translate.translate();
		
		assertEquals(Translate.getString22(), "Precio");
		
		assertEquals(Translate.getString10(), "Libros");
		
		assertEquals(Translate.getString11(), "Peliculas");
		
		assertEquals(Translate.getString24(), "Cual?");

		assertEquals(Translate.getString30(), "Salvar al Soldado Ryan");
		
		assertEquals(Translate.getString37(), "Accion");
		
		assertEquals(Translate.getString32(), "Need for Speed");
		
		assertEquals(Translate.getString20(), "Aventura");
		
		assertEquals(Translate.getString14(), "Piensa en Java");
		
		assertEquals(Translate.getString1(), "Bienvenido");
		
		assertEquals(Translate.getString6(), "Salir de la tienda");

		assertEquals(Translate.getString29(), "El Resplandor");
		
		assertEquals(Translate.getString28(), "La Guerra de las Galaxias");
		
		assertEquals(Translate.getString18(), "Historia");
		
		
	}

}
