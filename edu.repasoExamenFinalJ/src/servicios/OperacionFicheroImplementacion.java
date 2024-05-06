package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import controladores.inicio;

public class OperacionFicheroImplementacion implements OperacionFicheroInterfaz{

	inicio i = new inicio();
	
	
	public void controladorExcepcionesLog(String texto) {
		try {
			i.escrituraArchivo = new FileWriter(i.rutaLog, true);
			i.contenidoArchivo = new BufferedWriter(i.escrituraArchivo);
			i.contenidoArchivo.write(texto);
			i.contenidoArchivo.close();
			i.escrituraArchivo.close();
		}
		catch (IOException e){
			System.out.println("ERROR IO: " + e.getMessage());
		}
	}
	
}
