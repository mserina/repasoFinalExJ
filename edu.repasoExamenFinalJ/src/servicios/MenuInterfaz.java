package servicios;

/**
 * Contiene la cabezera de los metodos del servicio menu
 * msm - 060506
 */
public interface MenuInterfaz {

	/**
	 * Muestra el menu principal y devuelve la respuesta del usuario
	 * msm - 060524
	 * @return La respuesta del usuario
	 */
	public int mostrarMenuPrincipal();
		
	public void implementacionSubmenu1() throws Exception;
}
