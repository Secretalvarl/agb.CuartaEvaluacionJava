package servicios;

import java.util.List;

import dtos.citasDtos;
import dtos.clientesDtos;

public interface ficheroInterfaz {

	/*
	 * Metodo para crear un fichero con las citas
	 * agb-07/05/2024
	 */
	public void crearFicheroCitas(List<citasDtos> listaCitas, List<clientesDtos> listaClientes);
	/*
	 * Metodo para crear un fichero con las consultas
	 * agb-07/05/2024
	 */
	public void crearFicheroConsultas(List<citasDtos> listaCitas, List<clientesDtos> listaClientes);
}
