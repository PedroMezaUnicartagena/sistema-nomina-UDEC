package application.dto.empleado;

public class ActualizarEmpleadoRequestDto {
    private int id;
    private String nombre;
    private String apellido;
    private int antiguedad;

    public ActualizarEmpleadoRequestDto( int id, String nombre, String apellido, int antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
}
