package application.usecases.empleado;

import application.dto.empleado.AgregarEmpleadoRequestDto;
import application.dto.empleado.AgregarEmpleadoResponseDto;

import application.memory.MemoriaEmpleados;

import domain.entities.Asalariado;
import domain.entities.Empleado;

public class AgregarEmpleadoUseCase {
    public AgregarEmpleadoResponseDto process(AgregarEmpleadoRequestDto request) throws Exception {
        Empleado empleado = new Asalariado(
                        request.getNombre(),
                        request.getApellido(),
                        request.getId(),
                        request.getAntiguedad(),
                        request.getSalarioBase()
                );


        MemoriaEmpleados.EMPLEADOS
                .add(empleado);


        return new AgregarEmpleadoResponseDto(
                "Empleado agregado correctamente"
        );
    }
}