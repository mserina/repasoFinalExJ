package dtos;

import java.time.LocalDate;

/**
 * Clase que contiene los metodos de y atributos de la clase entidad citas
 * msm - 060524
 */
public class citasDto {

	//campos
	long id;
	String nombre = "ssss";
	String apellidos = "ssss";
	String dni = "SSSS";
	String especialidad = "ssss";
	LocalDate fechaCita;
	boolean asistenciaCitas = false;
	
	
	//getters setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDNI() {
		return dni;
	}
	public void setDNI(String dNI) {
		dni = dNI;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public LocalDate getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}
	public boolean isAsistenciaCitas() {
		return asistenciaCitas;
	}
	public void setAsistenciaCitas(boolean asistenciaCitas) {
		this.asistenciaCitas = asistenciaCitas;
	}

	//constructores 
	public citasDto(long id, String nombre, String apellidos, String dNI, String especialidad, LocalDate fechaCita) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dNI;
		this.especialidad = especialidad;
		this.fechaCita = fechaCita;
	}
	
	public citasDto() {
		
	}
	
	//toString 
	
	@Override
	public String toString() {
		
		return "[id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", especialidad=" + especialidad + ", fechaCita=" + fechaCita + ", asistenciaCitas=" + asistenciaCitas + "]";
	}
	
	
	
}
