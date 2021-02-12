package numeroEscondido;

import java.util.ArrayList;
import java.util.Arrays;

public class Secuencia {
	private int cantCifras;
	private String sec;

	public Secuencia(int cantCifras, String sec) {
		this.cantCifras = cantCifras;
		this.sec = sec;
	}

	public Secuencia() {

	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public int getCantCifras() {
		return cantCifras;
	}

	public void setCantCifras(int cantCifras) {
		this.cantCifras = cantCifras;
	}

	public String validaCoincidencia(Secuencia s1, Secuencia s2) {
		///Genero una cadena vacia para devolver
		String cadena = "";
		//guardo los numeros en cadenas auxiliares para trabajar los datos
		String sec1 = s1.getSec();
		String sec2 = s2.getSec();
		//
		char[] caracteres2 = sec2.toCharArray();
		Arrays.sort(caracteres2);
		String ordena2 = new String(caracteres2);
		//
		ArrayList<Integer> posiciones = new ArrayList<Integer>();// guardo las posiciones de coincidencia
		int cantidadN1 = s1.getCantCifras();///cantidad cifras numero 1
		int cantidadN2 = s2.getCantCifras();///cantidad cifras numero 2
		int index = 0;///indice para recorrer el numero 1
		int cont = 0;///cuento la cantidad de combinaciones
		while (cantidadN1 >= cantidadN2) {
			
			String subCad1 = sec1.substring(index, (index + cantidadN2));
			char[] chars1 = subCad1.toCharArray();
			Arrays.sort(chars1);

			String ordena1 = new String(chars1);
			if (ordena1.equals(ordena2)) {
				posiciones.add(index + 1);
				cont++;
			}

			index++;
			cantidadN1--;
		}
		
        ///al final verifico ubico la salida final
		if (cont == 0) {
			cadena += "NO";
		} else {
			cadena += "SI " + Integer.toString(cont);
			cadena += "\n";
			for (int i = 0; i < posiciones.size(); i++) {
				cadena += Integer.toString(posiciones.get(i))+ " ";
			}
		}

		return cadena;

	}

}
