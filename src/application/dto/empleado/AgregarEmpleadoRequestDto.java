package application.dto.empleado;

public class AgregarEmpleadoRequestDto {

    private String nombre;
    private String apellido;
    private int id;
    private int antiguedad;
    private double salarioBase;

    public AgregarEmpleadoRequestDto( String nombre, String apellido, int id, int antiguedad, double salarioBase) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.antiguedad = antiguedad;
        this.salarioBase = salarioBase;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getId() {
        return id;
    }

    public int getAntiguedad(){
        return antiguedad;
    }

    public double getSalarioBase(){
        return salarioBase;
    }
}
