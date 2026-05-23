package controllers.empleado;

import application.dto.empleado.ActualizarEmpleadoRequestDto;
import application.dto.empleado.ActualizarEmpleadoResponseDto;

import application.usecases.empleado.ActualizarEmpleadoUseCase;

public class ActualizarEmpleadoController {

    private final ActualizarEmpleadoUseCase useCase;

    public ActualizarEmpleadoController(
            ActualizarEmpleadoUseCase useCase) {
        this.useCase = useCase;
    }

    public ActualizarEmpleadoResponseDto execute(
            ActualizarEmpleadoRequestDto request)
            throws Exception {
        return useCase.process(request);
    }
}