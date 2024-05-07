package dtos;

import java.time.LocalDate;

public class clientesDtos {

	long idCliente;
	String DNI = "aaaaaa";
	String nombreCliente = "aaaaaa";
	String apellidosCliente = "aaaaaaa";
	LocalDate fechaAlta;
	String nombreCompleto = "aaaaaa";
	Boolean validacionCliente;
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public Boolean getValidacionCliente() {
		return validacionCliente;
	}
	public void setValidacionCliente(Boolean validacionCliente) {
		this.validacionCliente = validacionCliente;
	}

	public clientesDtos(){
		
	}
	public clientesDtos(String DNI, String nombreCliente, String apellidosCliente, LocalDate fechaAlta, String nombreCompleto, long idCliente) {
		
		this.DNI = DNI;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
		this.fechaAlta = fechaAlta;
		this.idCliente = idCliente;
		this.nombreCompleto = nombreCompleto;
	}
}
