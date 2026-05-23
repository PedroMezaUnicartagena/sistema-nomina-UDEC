package application.dto.empleado;

public class AgregarEmpleadoResponseDto {

    private String mensaje;

    public AgregarEmpleadoResponseDto(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje(){
        return mensaje;
    }
}
