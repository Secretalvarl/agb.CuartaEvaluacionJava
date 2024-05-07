package servicios;

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz {

	Scanner sc = new Scanner(System.in);

	public int menuPirncipal() {

		int opcion;

		System.out.println("-----------------");
		System.out.println("|0. Cerrar menu |");
		System.out.println("|1. Empleados   |");
		System.out.println("|2. Clientes    |");
		System.out.println("----------------");

		opcion = sc.nextInt();

		return opcion;

	}

	public int menuEmpleados() {

		int opcion;

		System.out.println("----------------------------------------------------");
		System.out.println("|0. Volver al menu principal                       |");
		System.out.println("|1. Validar nuevo cliente                          |");
		System.out.println("|2. Imprimir citas medicas para un dia especifico  |");
		System.out.println("----------------------------------------------------");

		opcion = sc.nextInt();

		return opcion;
	}

	public int menuClientes() {

		int opcion;

		System.out.println("---------------------------------------------------------");
		System.out.println("|0. Volver al menu principal                            |");
		System.out.println("|1. Registro de cliente                                 |");
		System.out.println("|2. Solicitud de cita medica                            |");
		System.out.println("|3. Consultar citas medicas para un intervalo de tiempo |");
		System.out.println("---------------------------------------------------------");

		opcion = sc.nextInt();

		return opcion;
	}
}
