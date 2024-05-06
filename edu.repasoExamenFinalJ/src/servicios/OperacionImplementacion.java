package servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.inicio;
import dtos.citasDto;
import utilidades.idGenerator;

/**
 * /**
 * Clase que contiene la implementacion de los metodos del servicio operaciones
 * msm - 070524
 */
public class OperacionImplementacion implements OperacionInterfaz{

	inicio i = new inicio();
	idGenerator idGen = new idGenerator();
	
	public void registroLlegada() throws Exception{
		System.out.println("Inserte el DNI");
		String dni = i.sc.next();
		LocalDate hoy = LocalDate.now();
		
		try {
			for(citasDto citas : i.listaCitas) {
				if(dni.equals(citas.getDNI())) {
					
					if(hoy.equals(citas.getFechaCita())) {
						System.out.println("Espera su turno para la consulta de "+ citas.getEspecialidad() +" en la sala de epera.");
						citas.setAsistenciaCitas(true);
					}
					else {
						System.out.println("No dispone de cita para hoy");
					}
				}
			}
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	
	public void añadirClientesP() throws Exception{
	
		long id = idGen.idGeneratorMetodo();
		String nombre = "Alfonso";
		String apellidos = "Fernández";
		String dni = "47966922T";
		String especialidad = "Psicología";
		String fechaCita = "03-05-2024";
		
		long id2 = idGen.idGeneratorMetodo();
		String nombre2 = "Alfonso";
		String apellidos2 = "Fernández";
		String dni2 = "47966922T";
		String especialidad2 = "Psicología";
		String fechaCita2 = "03-05-2024";
		

		try {
			DateTimeFormatter formatoFecha =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate fechaFormateada = LocalDate.parse(fechaCita, formatoFecha);
			LocalDate fechaFormateada2 = LocalDate.parse(fechaCita2, formatoFecha);
			
			citasDto citaNueva = new citasDto(id, nombre, apellidos, dni, especialidad, fechaFormateada);
			citasDto citaNueva2 = new citasDto(id2, nombre2, apellidos2, dni2, especialidad2, fechaFormateada2);
			i.listaCitas.add(citaNueva);
			i.listaCitas.add(citaNueva2);
			
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	public void mostrarConsultas(String especialidad) throws Exception{
		System.out.println("Inserte una fecha dd-MM-yyyy");
		String fechaS = i.sc.next();
	
		try {
			for(citasDto citas : i.listaCitas) {
				if(fechaS.equals(citas.getFechaCita().toString())) {
					System.out.println("nombreCompleto =" + citas.getNombre().concat(" ").concat(citas.getApellidos()));
					
				}
			}
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	
	public void verClientes() {
		
		for(citasDto citas : i.listaCitas) {
			System.out.println(" ");
			System.out.println(citas);
			System.out.println(" ");
		}
	}

}
