package controllers.empleado;

import application.dto.empleado.AgregarEmpleadoRequestDto;
import application.dto.empleado.AgregarEmpleadoResponseDto;

import application.usecases.empleado.AgregarEmpleadoUseCase;

public class AgregarEmpleadoController {

    private final AgregarEmpleadoUseCase useCase;

    public AgregarEmpleadoController(AgregarEmpleadoUseCase useCase){
        this.useCase = useCase;
    }

    public AgregarEmpleadoResponseDto execute(AgregarEmpleadoRequestDto request) throws Exception {
        return useCase.process(request);
    }
}