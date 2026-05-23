package application.dto.empleado;

public class BuscarEmpleadoRequestDto {

    private int id;

    public BuscarEmpleadoRequestDto(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
