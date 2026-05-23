package application.usecases.empleado;

import application.dto.empleado.BuscarEmpleadoRequestDto;
import application.dto.empleado.BuscarEmpleadoResponseDto;

import application.mapper.EmpleadoMapper;
import application.memory.MemoriaEmpleados;

import domain.entities.Empleado;

public class BuscarEmpleadoUseCase {
    public BuscarEmpleadoResponseDto process( BuscarEmpleadoRequestDto request) throws Exception {
        Empleado empleado = MemoriaEmpleados.EMPLEADOS.stream().filter(e -> e.getId() == request.getId())
                        .findFirst().orElseThrow(() -> new Exception("Empleado no encontrado"));

        return EmpleadoMapper.toBuscarEmpleadoResponseDto(empleado);
    }
}