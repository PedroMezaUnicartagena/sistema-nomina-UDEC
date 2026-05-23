package controllers.empleado;

import application.dto.empleado.EliminarEmpleadoRequestDto;
import application.dto.empleado.EliminarEmpleadoResponseDto;

import application.usecases.empleado.EliminarEmpleadoUseCase;

public class EliminarEmpleadoController {
    private final EliminarEmpleadoUseCase useCase;

    public EliminarEmpleadoController(EliminarEmpleadoUseCase useCase){
        this.useCase = useCase;
    }

    public EliminarEmpleadoResponseDto execute(EliminarEmpleadoRequestDto request) throws Exception {
        return useCase.process(request);
    }
}