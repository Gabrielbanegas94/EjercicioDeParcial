package numeroEscondido;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.junit.Test;

public class TestNumEscondido {

	@Test
	public void prueba1() {
		Escritura escritura = new Escritura();
		Lectura lectura = new Lectura();
		String resultado=lectura.leeFileYgeneraResultado("..\\Pruebas\\Entradas\\prueba1.in");
		
		escritura.grabarFile("..\\Pruebas\\Salidas\\salida1.out", resultado);
		
		String esperado ="SI 2\n2 3 ";
		assertEquals(esperado, resultado);
		
	}
    
	@Test
	public void prueba2() {
		Escritura escritura = new Escritura();
		Lectura lectura = new Lectura();
		String resultado=lectura.leeFileYgeneraResultado("..\\Pruebas\\Entradas\\prueba2.in");
		
		escritura.grabarFile("..\\Pruebas\\Salidas\\salida2.out", resultado);
		
	
		String esperado ="NO";
		assertEquals(esperado, resultado);
		
		
	}
	
	@Test
	public void prueba3() {

		Escritura escritura = new Escritura();
		Lectura lectura = new Lectura();
		String resultado = lectura.leeFileYgeneraResultado("..\\Pruebas\\Entradas\\prueba3.in");

		escritura.grabarFile("..\\Pruebas\\Salidas\\salida3.out", resultado);
		String esperado = "SI 1\n5 ";
		assertEquals(esperado, resultado);

	}
	
	@Test
	public void prueba4() {

		Escritura escritura = new Escritura();
		Lectura lectura = new Lectura();
		String resultado = lectura.leeFileYgeneraResultado("..\\Pruebas\\Entradas\\prueba4.in");

		escritura.grabarFile("..\\Pruebas\\Salidas\\salida4.out", resultado);
		String esperado = "SI 2\n5 9 ";
		assertEquals(esperado, resultado);

	}
	
	@Test
	public void pruebaPTO5() {

		Escritura escritura = new Escritura();
		Lectura lectura = new Lectura();
		String resultado = lectura.leeFileYgeneraResultado("..\\Pruebas\\Entradas\\pruebaPTO5.in");
		escritura.grabarFile("..\\Pruebas\\Salidas\\salidaPTO5.out", resultado);
		String esperado = "SI 6\n1 5 9 13 17 21 ";
		assertEquals(esperado, resultado);

	}
	
	@Test
	public void pruebaMismaLongitud() {

		Escritura escritura = new Escritura();
		Lectura lectura = new Lectura();
		String resultado = lectura.leeFileYgeneraResultado("..\\Pruebas\\Entradas\\MismaLong.in");
		escritura.grabarFile("..\\Pruebas\\Salidas\\salidaMismaLong.out", resultado);
		String esperado = "SI 1\n1 ";
		assertEquals(esperado, resultado);

	}
	
	@Test
	public void pruebaNumRepetidos() {

		Escritura escritura = new Escritura();
		Lectura lectura = new Lectura();
		String resultado = lectura.leeFileYgeneraResultado("..\\Pruebas\\Entradas\\Repetidos.in");
		escritura.grabarFile("..\\Pruebas\\Salidas\\salidaRepetido.out", resultado);
		String esperado = "SI 2\n1 5 ";
		assertEquals(esperado, resultado);

	}
	
	@Test
	public void pruebaTodasCombinaciones() {

		Escritura escritura = new Escritura();
		Lectura lectura = new Lectura();
		String resultado = lectura.leeFileYgeneraResultado("..\\Pruebas\\Entradas\\NumConTodasCombinaciones.in");
		escritura.grabarFile("..\\Pruebas\\Salidas\\salidaConTodasCombinaciones.out", resultado);
		String esperado = "SI 10\n1 3 4 5 7 9 10 13 15 16 ";
		assertEquals(esperado, resultado);

	}
	
	
	
}
