package controladores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.citasDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperacionImplementacion;
import servicios.OperacionInterfaz;

/**
 * Clase principal del programa
 * msm - 060524
 */
public class inicio {

	
	public static Scanner sc = new Scanner (System.in);
	public static String rutaLog = "C:\\Users\\Usuario\\Desktop\\ARCHIVOS\\archivoLog.txt";
	public static FileWriter escrituraArchivo;
	public static BufferedWriter contenidoArchivo;
	
	public static List<citasDto> listaCitas = new ArrayList();
	
	
	/**
	 * Metodo que controla el flujo de la aplicacion
	 * msm - 070524
	 * @param arg
	 */
	public static void main (String[] arg) {
		
		int opcionSeleccionada;
		boolean cerrarMenu = false;
		
		OperacionInterfaz op = new OperacionImplementacion();
		MenuInterfaz menu = new MenuImplementacion();
		
		
		while(!cerrarMenu) {
			
			opcionSeleccionada = menu.mostrarMenuPrincipal();
			
			try {
				switch(opcionSeleccionada) {
				
				case 0:
					escrituraArchivo = new FileWriter(rutaLog, true);
					escrituraArchivo.write("Se ha cerrado la aplicacion" + "\n");
					escrituraArchivo.close();
					cerrarMenu = true;
					break;
				case 1: 
					escrituraArchivo = new FileWriter(rutaLog,true);
					escrituraArchivo.write("Se ha seleccionado el registro de llegada"  + "\n");
					escrituraArchivo.close();
					op.registroLlegada();
					
					break;
				case 2:
					escrituraArchivo = new FileWriter(rutaLog,true);
					escrituraArchivo.write("Se ha seleccionado la lista de consultas"  + "\n" );
					escrituraArchivo.close();
					menu.implementacionSubmenu1();
					break;
				
				case 3:
					escrituraArchivo = new FileWriter(rutaLog,true);
					escrituraArchivo.write("Se ha seleccionado la opcion añadir citas"  + "\n" );
					escrituraArchivo.close();
					op.añadirClientesP();
					break;
					
				case 4:
					escrituraArchivo = new FileWriter(rutaLog,true);
					escrituraArchivo.write("Se ha seleccionado la opcion ver clientes"  + "\n" );
					escrituraArchivo.close();
					op.verClientes();
				}
			}
			catch(Exception e) {
				System.out.println("ERROR[]: " + e.getMessage());
			}
		}
	}
}
