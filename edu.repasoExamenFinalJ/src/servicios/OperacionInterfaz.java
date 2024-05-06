package servicios;

/**
 * Contiene la cabezera de los metodos del servicio operacion
 * msm - 060506
 */
public interface OperacionInterfaz {

	/**
	 * Se registra que el usuario ha llegado a la cita
	 * msm - 060524
	 */
	public void registroLlegada() throws Exception;
	
	public void añadirClientesP() throws Exception;
	
	public void verClientes();
	
	public void mostrarConsultas(String especialidad) throws Exception;
	
	/*
		public void imprimirConsulta();
	*/
	}
