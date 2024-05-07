package controladores;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import dtos.citasDtos;
import dtos.clientesDtos;
import servicios.ficheroImplementacion;
import servicios.ficheroInterfaz;
import servicios.menuImplementacion;
import servicios.menuInterfaz;
import servicios.operativaImplementacion;
import servicios.operativaInterfaz;

public class inicioAplicacion {

	public static void main(String[] args) {

		menuInterfaz mi = new menuImplementacion();
		operativaInterfaz oi = new operativaImplementacion();
		ficheroInterfaz fi = new ficheroImplementacion();

		List<clientesDtos> listaCLientes = new ArrayList<clientesDtos>();
		List<citasDtos> listaCitas = new ArrayList<citasDtos>();

		LocalDate fecha = LocalDate.now();
		String ruta = ("log-" + fecha + (".txt"));
		int opcionSeleccionada;
		boolean cerrarMenu = false;

		try {
			
			BufferedWriter escribir = new BufferedWriter(new FileWriter(new File(ruta)));
			
			while (!cerrarMenu) {
				opcionSeleccionada = mi.menuPirncipal();
				switch (opcionSeleccionada) {
				case 0:
					escribir.write("Se ha cerrado el menu principal");
					cerrarMenu = true;
					break;
				case 1:
					escribir.write("Ha seleccionado el menu empleado");
					boolean cerrarEmpleado = false;
					int opcionEmpleado;
					while (!cerrarEmpleado) {
						opcionEmpleado = mi.menuEmpleados();
						switch (opcionEmpleado) {
						case 0:
							escribir.write("Ha seleccionado el cerrar menu empleado");
							cerrarEmpleado = true;
							break;
						case 1:
							escribir.write("Ha seleccionado validar cliente");
							oi.validarCliente(listaCLientes);
							break;
						case 2:
							escribir.write("Ha seleccionado crear fichero citas");
							fi.crearFicheroCitas(listaCitas, listaCLientes);
							break;
						default:
							break;
						}
					}
					break;
				case 2:
					boolean cerrarCliente = false;
					int opcionCliente;
					while (!cerrarCliente) {
						opcionCliente = mi.menuClientes();
						switch (opcionCliente) {
						case 0:
							escribir.write("Ha seleccionado el cerrar menu cliente");
							cerrarCliente = true;
							break;
						case 1:
							escribir.write("Ha seleccionado crear cliente");
							oi.crearCliente(listaCLientes);
							break;
						case 2:
							escribir.write("Ha seleccionado crear solicitud dita");
							oi.solicitudCitas(listaCitas, listaCLientes);
							break;
						case 3:
							escribir.write("Ha seleccionado ver consultas medicas");
							break;
						default:
							break;
						}
					}
					break;
				default:
					break;
				}
			}
			escribir.close();
		} catch (Exception e) {

		}

	}

}
