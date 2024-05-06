package servicios;

import java.io.FileWriter;

import controladores.inicio;

/**
 * Clase que contiene la implementacion de los metodos del servicio menu
 * msm - 060524
 */
public class MenuImplementacion implements MenuInterfaz{

	public static inicio i = new inicio();
	public OperacionFicheroInterfaz of = new OperacionFicheroImplementacion();
	OperacionInterfaz op = new OperacionImplementacion();
	
	
	//interfaces menus
	public int mostrarMenuPrincipal() {
			int opcionSeleccionada = 99;
			
			System.out.println(" ");
			System.out.println("----------MENU PRINCIPAL--------");
			System.out.println("0[] CERRAR MENU");
			System.out.println("1[] REGISTRO DE LLEGADA");
			System.out.println("2[] LISTA DE CONSULTA");
			System.out.println(" ");
			
			opcionSeleccionada = i.sc.nextInt();
			
			return opcionSeleccionada;
	}
	
	private int mostrarSubmenu1() {
		int opcionSeleccionada = 99;
		
		System.out.println(" ");
		System.out.println("----------LISTAS DE CONSULTAS--------");
		System.out.println("0[] VOLVER ATRAS");
		System.out.println("1[] MOSTRAR CONSULTAS");
		System.out.println("2[] IMPRIMIR CONSULTAS");
		System.out.println(" ");
		
		opcionSeleccionada = i.sc.nextInt();
		
		return opcionSeleccionada;
}
	
	private int mostrarSubmenu2() {
		int opcionSeleccionada = 99;
		
		System.out.println(" ");
		System.out.println("----------LISTAS DE CONSULTAS--------");
		System.out.println("0[] VOLVER ATRAS");
		System.out.println("1[] PSICOLOGIA");
		System.out.println("2[] TRAUMATOLOGIA");
		System.out.println("3[] FISIOTERAPEUTA");
		System.out.println(" ");
		
		opcionSeleccionada = i.sc.nextInt();
		
		return opcionSeleccionada;
}
	
	
	
	
	
	//implementaciones
	public void implementacionSubmenu1() throws Exception {
		int opcionSeleccionada;
		
		boolean cerrarMenu = false;
		
		MenuInterfaz menu = new MenuImplementacion();
		while(!cerrarMenu) {
			
			opcionSeleccionada = mostrarSubmenu1();
			
			try {
				switch(opcionSeleccionada) {
				
				case 0:
					String textoError = "Se ha cerrado submenu1" + "\n";
					of.controladorExcepcionesLog(textoError);
					cerrarMenu = true;
					break;
				case 1: 
					String textoError1 = "Se ha seleccionado mostrar consulta" + "\n";
					of.controladorExcepcionesLog(textoError1);
					implementacionSubmenu2();
					break;
				case 2:
					String textoError2 = "Se ha seleccionado imprimir consulta" + "\n";
					of.controladorExcepcionesLog(textoError2);
					break;
				}
			}
			catch(Exception e) {
				throw e;
			}
		
		}

	}

	private void implementacionSubmenu2() throws Exception {
		int opcionSeleccionada;
		String especialidad;
		boolean cerrarMenu = false;
		
		MenuInterfaz menu = new MenuImplementacion();
		while(!cerrarMenu) {
			
			opcionSeleccionada = mostrarSubmenu2();
			
			try {
				switch(opcionSeleccionada) {
				
				case 0:
					String textoError = "Se ha cerrado submenu2" + "\n";
					of.controladorExcepcionesLog(textoError);
					cerrarMenu = true;
					break;
				case 1: 
					String textoError1 = "Se ha seleccionado psicologia" + "\n";
					of.controladorExcepcionesLog(textoError1);
					especialidad = "Psicología";
					op.mostrarConsultas(especialidad);
					break;
				case 2:
					String textoError2 = "Se ha seleccionado traumatologia" + "\n";
					especialidad = "Traumatologia";
					op.mostrarConsultas(especialidad);
					of.controladorExcepcionesLog(textoError2);
					break;
				case 3:
					String textoError3 = "Se ha seleccionado Fisioterapeuta" + "\n";
					especialidad = "Fisioterapia";
					op.mostrarConsultas(especialidad);
					of.controladorExcepcionesLog(textoError3);
					break;
				}
			}
			catch(Exception e) {
				throw e;
			}
		
		}

	}

}
