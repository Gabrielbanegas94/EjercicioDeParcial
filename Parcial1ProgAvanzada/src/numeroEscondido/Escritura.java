package numeroEscondido;
import java.math.BigInteger;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

public class Escritura {
	// pruebas auxiliares
	public void grabarFile(String pathFile, String cadena) {
		
		 FileWriter ArchivoSalida;
		  try {
			ArchivoSalida = new FileWriter(pathFile);
			BufferedWriter SalidaFinal = new BufferedWriter(ArchivoSalida);
			SalidaFinal.write(cadena);
			SalidaFinal.close();
			
		} catch (IOException e) {
			System.out.println(" No se genero el archivo salida");
			e.printStackTrace();
		}///TRYcatch SALIDA.OUT
		
	}
	

}
