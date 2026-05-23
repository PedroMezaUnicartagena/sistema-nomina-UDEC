package controllers.empleado;

import application.dto.empleado.ObtenerNominaResponseDto;
import application.usecases.empleado.ObtenerNominaUseCase;

public class ObtenerNominaController {

    private final ObtenerNominaUseCase useCase;

    public ObtenerNominaController(ObtenerNominaUseCase useCase){
        this.useCase = useCase;
    }

    public ObtenerNominaResponseDto execute() throws Exception {
        return useCase.process();
    }
}