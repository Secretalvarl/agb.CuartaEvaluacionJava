package servicios;

import java.util.List;

import dtos.citasDtos;
import dtos.clientesDtos;

public interface operativaInterfaz {
	/*
	 * Metodo para crear un nuevo cliente
	 * agb-07/05/2024
	 */
	public void crearCliente (List<clientesDtos> listaClientes);
	/*
	 * Metodo para validar un cliente
	 * agb-07/05/2024
	 */
	public void validarCliente(List<clientesDtos> listaClientes);
	/*
	 * Metodo para solicitar una cita
	 * agb-07/05/2024
	 */
	public void solicitudCitas(List<citasDtos> listaCitas, List<clientesDtos> listaClientes);
	
}
