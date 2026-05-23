package application.usecases.empleado;

import application.dto.empleado.ObtenerNominaResponseDto;

import application.mapper.EmpleadoMapper;
import application.memory.MemoriaEmpleados;

import java.util.List;
import java.util.stream.Collectors;

public class ObtenerNominaUseCase {

    public ObtenerNominaResponseDto process() throws Exception {
        List<ObtenerNominaResponseDto.EmpleadoNominaDto> empleados = MemoriaEmpleados.EMPLEADOS.stream().map(
                EmpleadoMapper::toEmpleadoNominaDto).collect(Collectors.toList());

        return new ObtenerNominaResponseDto(
                empleados
        );
    }
}