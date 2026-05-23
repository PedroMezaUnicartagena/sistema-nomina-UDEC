package application.usecases.empleado;

import application.dto.empleado.EliminarEmpleadoRequestDto;
import application.dto.empleado.EliminarEmpleadoResponseDto;

import application.memory.MemoriaEmpleados;

public class EliminarEmpleadoUseCase {
    public EliminarEmpleadoResponseDto process(EliminarEmpleadoRequestDto request) throws Exception {


        boolean eliminado = MemoriaEmpleados.EMPLEADOS.removeIf(e -> e.getId() == request.getId());
        if (!eliminado) {
            throw new Exception("Empleado no encontrado");
        }

        return new EliminarEmpleadoResponseDto("Empleado eliminado correctamente");
    }
}