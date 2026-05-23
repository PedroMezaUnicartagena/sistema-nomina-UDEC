package controllers.empleado;

import application.dto.empleado.BuscarEmpleadoRequestDto;
import application.dto.empleado.BuscarEmpleadoResponseDto;

import application.usecases.empleado.BuscarEmpleadoUseCase;

public class BuscarEmpleadoController {

    private final BuscarEmpleadoUseCase useCase;

    public BuscarEmpleadoController(BuscarEmpleadoUseCase useCase){
        this.useCase = useCase;
    }

    public BuscarEmpleadoResponseDto execute(BuscarEmpleadoRequestDto request) throws Exception {
        return useCase.process(request);
    }
}