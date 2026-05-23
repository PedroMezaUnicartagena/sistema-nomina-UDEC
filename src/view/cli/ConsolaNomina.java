package view.cli;

import application.dto.empleado.AgregarEmpleadoRequestDto;
import application.dto.empleado.AgregarEmpleadoResponseDto;
import application.dto.empleado.BuscarEmpleadoRequestDto;
import application.dto.empleado.BuscarEmpleadoResponseDto;
import application.dto.empleado.CalcularNominaResponseDto;
import application.dto.empleado.EliminarEmpleadoRequestDto;
import application.dto.empleado.EliminarEmpleadoResponseDto;
import application.dto.empleado.ObtenerNominaResponseDto;
import application.usecases.empleado.AgregarEmpleadoUseCase;
import application.usecases.empleado.BuscarEmpleadoUseCase;
import application.usecases.empleado.CalcularNominaUseCase;
import application.usecases.empleado.EliminarEmpleadoUseCase;
import application.usecases.empleado.ObtenerNominaUseCase;
import controllers.empleado.AgregarEmpleadoController;
import controllers.empleado.BuscarEmpleadoController;
import controllers.empleado.CalcularNominaController;
import controllers.empleado.EliminarEmpleadoController;
import controllers.empleado.ObtenerNominaController;

import java.util.Scanner;

public class ConsolaNomina {

    private final Scanner scanner;

    private final AgregarEmpleadoController agregarController;
    private final BuscarEmpleadoController buscarController;
    private final EliminarEmpleadoController eliminarController;
    private final ObtenerNominaController obtenerController;
    private final CalcularNominaController calcularController;

    public ConsolaNomina(){
        scanner = new Scanner(System.in);
        agregarController = new AgregarEmpleadoController(new AgregarEmpleadoUseCase());
        buscarController = new BuscarEmpleadoController( new BuscarEmpleadoUseCase());

        eliminarController = new EliminarEmpleadoController(new EliminarEmpleadoUseCase());
        obtenerController = new ObtenerNominaController(new ObtenerNominaUseCase());
        calcularController = new CalcularNominaController(new CalcularNominaUseCase());
    }


    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        agregarEmpleado();
                        break;

                    case 2:
                        buscarEmpleado();
                        break;

                    case 3:
                        listarNomina();
                        break;

                    case 4:
                        eliminarEmpleado();
                        break;

                    case 5:
                        calcularNomina();
                        break;

                    case 0:
                        System.out.println(
                                "Saliendo del sistema..."
                        );
                        break;

                    default:
                        System.out.println(
                                "Opción inválida"
                        );
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 0);
    }


    private void mostrarMenu(){

        System.out.println("\n========== SISTEMA NOMINA ==========");
        System.out.println("1. Agregar empleado");
        System.out.println("2. Buscar empleados");
        System.out.println("3. Listar nomina");
        System.out.println("4. Eliminar empleado");
        System.out.println("5. Calcular total nomina");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opcion: ");
    }


    private void agregarEmpleado() throws Exception {
        System.out.println("\n=== AGREGAR EMPLEADO ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Antiguedad: ");
        int antiguedad = scanner.nextInt();
        System.out.print("Salario base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();
        AgregarEmpleadoRequestDto request = new AgregarEmpleadoRequestDto(
                        nombre,
                        apellido,
                        id,
                        antiguedad,
                        salarioBase);

        AgregarEmpleadoResponseDto response =
                agregarController.execute(
                        request
                );

        System.out.println(
                response.getMensaje()
        );
    }



    private void buscarEmpleado() throws Exception {

        System.out.println(
                "\n=== BUSCAR EMPLEADO ==="
        );
        System.out.print("Ingrese ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        BuscarEmpleadoRequestDto request = new BuscarEmpleadoRequestDto(id);
        BuscarEmpleadoResponseDto response = buscarController.execute(request);

        System.out.println("\nEmpleado encontrado:");
        System.out.println("ID: " + response.getId());
        System.out.println("Nombre: " + response.getNombreCompleto());
        System.out.println("Tipo: " + response.getTipoEmpleado());
        System.out.println("Salario bruto: " + response.getSalarioBruto());
        System.out.println("Deducciones: " + response.getDeducciones());
        System.out.println("Salario neto: " + response.getSalarioNeto());
    }



    private void listarNomina() throws Exception {
        System.out.println("\n=== NOMINA ===");
        ObtenerNominaResponseDto response = obtenerController.execute();

        for (ObtenerNominaResponseDto.EmpleadoNominaDto empleado : response.getEmpleados()) {
            System.out.println("------------------------");
            System.out.println("ID: " + empleado.getId());
            System.out.println("Nombre: " + empleado.getNombreCompleto());
            System.out.println("Tipo: "+ empleado.getTipoEmpleado());
            System.out.println("Salario Neto: " + empleado.getSalarioNeto());
        }
    }

    private void eliminarEmpleado() throws Exception {
        System.out.println("\n=== ELIMINAR EMPLEADO ===");
        System.out.print("Ingrese ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        EliminarEmpleadoRequestDto request = new EliminarEmpleadoRequestDto(id);
        EliminarEmpleadoResponseDto response = eliminarController.execute(request);
        System.out.println( response.getMensaje());
    }


    private void calcularNomina() throws Exception {
        System.out.println("\n=== TOTAL NOMINA ===");
        CalcularNominaResponseDto response = calcularController.execute();
        System.out.println("Total nómina: " + response.getTotalNomina());
    }
}