package application.dto.empleado;

public class ActualizarEmpleadoResponseDto {
    private String mensaje;

    public ActualizarEmpleadoResponseDto( String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
