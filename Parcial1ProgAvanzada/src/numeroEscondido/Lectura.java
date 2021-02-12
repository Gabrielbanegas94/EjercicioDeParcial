package numeroEscondido;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Lectura {

	public String leeFileYgeneraResultado(String pathFile) {
		FileReader fr;
		String retorno = "";
		try {
			fr = new FileReader(pathFile);
			Scanner lectura = new Scanner(fr);

			int cantSec1 = lectura.nextInt();// cantidad secuencia 1
			String numSec1 = lectura.next();

			/// leeemos la segunda secuencia
			int cantSec2 = lectura.nextInt();// cantida secuencia 2
			String numSec2 = lectura.next();

			// guardamos en objetos
			Secuencia sec1 = new Secuencia(cantSec1, numSec1);

			Secuencia sec2 = new Secuencia(cantSec2, numSec2);

			Secuencia sec = new Secuencia();

			String resultado = sec.validaCoincidencia(sec1, sec2);/// metodo que genera el resultado

			retorno = resultado;

			lectura.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return retorno;
	}
}
