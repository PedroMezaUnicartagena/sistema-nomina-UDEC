package application.dto.empleado;

public class EliminarEmpleadoResponseDto {
    private String mensaje;

    public EliminarEmpleadoResponseDto( String mensaje ){
        this.mensaje = mensaje;
    }

    public String getMensaje(){

        return mensaje;
    }
}
