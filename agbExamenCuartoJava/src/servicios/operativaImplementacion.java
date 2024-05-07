package servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dtos.citasDtos;
import dtos.clientesDtos;

public class operativaImplementacion implements operativaInterfaz {

	Scanner sc = new Scanner(System.in);

	public void crearCliente(List<clientesDtos> listaClientes) {

		boolean cerrarCliente = false;

		do {

			clientesDtos nuevoCliente = new clientesDtos();

			System.out.println("Escriba su DNI");
			nuevoCliente.setDNI(sc.next());

			System.out.println("Escriba su nombre:");
			String nombre = sc.next();
			nuevoCliente.setNombreCliente(nombre);

			System.out.println("Escriba sus apellidos:");
			String apellidos = sc.next();
			nuevoCliente.setApellidosCliente(apellidos);

			long id = 1;
			for (int i = 0; i < listaClientes.size(); i++) {

				if (i > 0) {

					id = id + 1;

					nuevoCliente.setIdCliente(id);

				} else {

					id = 1;

					nuevoCliente.setIdCliente(id);
				}
			}

			boolean validar = false;
			nuevoCliente.setValidacionCliente(validar);

			LocalDate fecha = LocalDate.now();
			nuevoCliente.setFechaAlta(fecha);

			String nombreCompleto = apellidos + (", ") + nombre;

			nuevoCliente.setNombreCompleto(nombreCompleto);

			listaClientes.add(nuevoCliente);

			System.out.println("¿Quiere seguir registrando clientes?. Seleccione s o n");
			if (sc.next().equals("n")) {

				cerrarCliente = true;
			}

		} while (!cerrarCliente);
	}

	public void validarCliente(List<clientesDtos> listaClientes) {

		clientesDtos nuevoCliente = new clientesDtos();
		
		for (clientesDtos buscarClientes : listaClientes) {

			if (buscarClientes.getValidacionCliente().equals(false)) {

				System.out.println(buscarClientes.getDNI() + " - " + buscarClientes.getApellidosCliente() + ", "
						+ buscarClientes.getNombreCliente());
			}

		}

		System.out.println(" ");
		System.out.println("Escriba el DNI del cliente a validar");
		String DNIDado = sc.next();

		for (clientesDtos buscarClientes : listaClientes) {

			if (DNIDado.equals(buscarClientes.getDNI())) {

				buscarClientes.setValidacionCliente(true);

				listaClientes.add(nuevoCliente);
				System.out.println("Cliente validado correctamente");

			} else {

				System.out.println("El DNI es corresponde con ningun cliente");
			}

		}
	}

	public void solicitudCitas(List<citasDtos> listaCitas, List<clientesDtos> listaClientes) {

		boolean cerrarCitas = false;

		do {
			citasDtos nuevaCitasDtos = new citasDtos();

			System.out.println("Escriba su DNI");
			String DNI = sc.next();

			for (clientesDtos buscarClientes : listaClientes) {

				if (DNI.equals(buscarClientes.getDNI()) && buscarClientes.getValidacionCliente().equals(true)) {

					System.out.println("01. Pisicología");
					System.out.println("02. Traumatología");
					System.out.println("03. Fisioterapia");

					String opcion = sc.next();

					if (opcion.equals("01")) {

						String especialidadString = "Pisicología";
						nuevaCitasDtos.setEspecialidad(especialidadString);
					}
					if (opcion.equals("02")) {

						String especialidadString = "Traumatología";
						nuevaCitasDtos.setEspecialidad(especialidadString);
					}
					if (opcion.equals("03")) {

						String especialidadString = "Fisioterapia";
						nuevaCitasDtos.setEspecialidad(especialidadString);
					}

				}
			}

			System.out.println("Escriba la fecha y hora a la que quiere la cita");
			String fechaDada = sc.next();
			try {
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH");
				LocalDate fecha = LocalDate.parse(fechaDada, formato);

				nuevaCitasDtos.setFechaCita(fecha);
			} catch (Exception e) {
				System.out.println(e);
			}

			listaCitas.add(nuevaCitasDtos);

			System.out.println("¿Quiere seguir solicitando citas?. Seleccione s o n");
			if (sc.next().equals("n")) {

				cerrarCitas = true;
			}

		} while (!cerrarCitas);

	}
}
