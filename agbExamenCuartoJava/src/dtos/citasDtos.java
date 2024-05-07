package dtos;

import java.time.LocalDate;

public class citasDtos {

	String especialidad = "aaaaaa";
	LocalDate fechaCita;

	public LocalDate getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public citasDtos() {
		
	}
}
