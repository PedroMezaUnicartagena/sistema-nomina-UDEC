package application.usecases.empleado;

import application.dto.empleado.CalcularNominaResponseDto;

import application.memory.MemoriaEmpleados;

import domain.entities.Empleado;

public class CalcularNominaUseCase {
    public CalcularNominaResponseDto process() throws Exception {
        double total = MemoriaEmpleados.EMPLEADOS.stream()
                        .mapToDouble(Empleado::calcularSalarioNeto).sum();

        return new CalcularNominaResponseDto(total);
    }
}