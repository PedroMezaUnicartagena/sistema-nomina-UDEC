package application.usecases.empleado;

import application.dto.empleado.ActualizarEmpleadoRequestDto;
import application.dto.empleado.ActualizarEmpleadoResponseDto;

import application.memory.MemoriaEmpleados;

import domain.entities.Empleado;

public class ActualizarEmpleadoUseCase {

    public ActualizarEmpleadoResponseDto process(ActualizarEmpleadoRequestDto request) throws Exception {
        Empleado empleado = MemoriaEmpleados.EMPLEADOS.stream()
                .filter(e ->
                                e.getId() == request.getId()).findFirst().orElseThrow(() ->
                new Exception("Empleado no encontrado"));

        empleado.setNombre(
                request.getNombre()
        );

        empleado.setApellido(
                request.getApellido()
        );

        empleado.setAntiguedad(
                request.getAntiguedad()
        );

        return new ActualizarEmpleadoResponseDto(
                "Empleado actualizado correctamente"
        );
    }
}