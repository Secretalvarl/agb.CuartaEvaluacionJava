package servicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dtos.citasDtos;
import dtos.clientesDtos;

public class ficheroImplementacion implements ficheroInterfaz {

	Scanner sc = new Scanner(System.in);

	public void crearFicheroCitas(List<citasDtos> listaCitas, List<clientesDtos> listaClientes) {

		System.out.println("Escriba la fecha a consultar");
		String fechaDada = sc.next();

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(fechaDada, formato);

		String ruta = ("informe-" + fechaDada + (".txt"));

		try {

			BufferedWriter escribir = new BufferedWriter(new FileWriter(new File(ruta)));

			for (clientesDtos buscarClientes : listaClientes) {

				for (citasDtos buscarCitas : listaCitas) {

					if (fecha.equals(buscarCitas.getFechaCita())) {

						escribir.write(buscarClientes.getDNI() + ";" + buscarClientes.getApellidosCliente() + ", "
								+ buscarClientes.getNombreCliente() + ";" + buscarCitas.getEspecialidad());
					} else {

						System.out.println("No hay informacion que mostrar");
					}
				}
				
				
			}
			escribir.close();

		} catch (Exception e) {

		}

	}

	public void crearFicheroConsultas(List<citasDtos> listaCitas, List<clientesDtos> listaClientes) {

		System.out.println("Escriba su DNI");
		String DNI = sc.next();

		System.out.println("Escriba la fecha de inicio ");
		String fechaInicio = sc.next();

		System.out.println("Escriba la fecha final");
		String fechaFinal = sc.next();

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fecha = LocalDate.parse(fechaInicio, formato);

		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fecha2 = LocalDate.parse(fechaFinal, formato);

		for (clientesDtos buscarDni : listaClientes) {
			
			if (DNI.equals(buscarDni.getDNI())){
				
				for(citasDtos buscarCitasDtos : listaCitas) {
					
					if(fechaInicio => buscarCitasDtos.getFechaCita() && fechaFinal <= buscarCitasDtos.getFechaCita()) {
						
						System.out.println(buscarCitasDtos.getFechaCita() + buscarCitasDtos.getEspecialidad());
					}else {
						
						System.out.println("No hay ninguna cita en ese intervalo de tiempo");
					}
					
				}
			}

		}

	}

}
