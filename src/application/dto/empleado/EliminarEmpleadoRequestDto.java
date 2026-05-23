package application.dto.empleado;

public class EliminarEmpleadoRequestDto {

    private int id;

    public EliminarEmpleadoRequestDto( int id ){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
