package controllers.empleado;

import application.dto.empleado.CalcularNominaResponseDto;

import application.usecases.empleado.CalcularNominaUseCase;

public class CalcularNominaController {

    private final CalcularNominaUseCase useCase;

    public CalcularNominaController(CalcularNominaUseCase useCase){
        this.useCase = useCase;
    }

    public CalcularNominaResponseDto execute() throws Exception {
        return useCase.process();
    }
}
