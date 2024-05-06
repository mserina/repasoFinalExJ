package utilidades;

import controladores.inicio;

/**
 * Clase que genera ids
 * msm - 060524
 */
public class idGenerator {

	inicio i = new inicio();
	
	public long idGeneratorMetodo() {
		
		int tamano = i.listaCitas.size() -1;
		long idNuevo;
		
		if(tamano > 0) {
			idNuevo = i.listaCitas.get(tamano).getId() + 1;
		}
		else {
			idNuevo = 1;
		}
		
		return idNuevo;
	}
}
