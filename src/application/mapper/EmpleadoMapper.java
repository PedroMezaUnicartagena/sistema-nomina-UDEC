package application.mapper;

import application.dto.empleado.BuscarEmpleadoResponseDto;
import application.dto.empleado.ObtenerNominaResponseDto;

import domain.entities.Empleado;

public class EmpleadoMapper {

    private EmpleadoMapper(){
    }

    public static BuscarEmpleadoResponseDto toBuscarEmpleadoResponseDto( Empleado empleado) {

        return new BuscarEmpleadoResponseDto(
                empleado.getId(),
                empleado.getNombre() + " " + empleado.getApellido(),
                empleado.getClass().getSimpleName(),
                empleado.calcularSalarioBruto(),
                empleado.calcularDeducciones(),
                empleado.calcularSalarioNeto()
        );
    }


    public static ObtenerNominaResponseDto.EmpleadoNominaDto toEmpleadoNominaDto(Empleado empleado) {

        return new ObtenerNominaResponseDto.EmpleadoNominaDto(
                empleado.getId(),
                empleado.getNombre() + " " + empleado.getApellido(),
                empleado.getClass().getSimpleName(),
                empleado.calcularSalarioNeto()
        );
    }
}