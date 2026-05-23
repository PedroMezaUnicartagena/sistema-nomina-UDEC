package application.dto.empleado;

public class BuscarEmpleadoResponseDto {

    private int id;
    private String nombreCompleto;
    private String tipoEmpleado;
    private double salarioBruto;
    private double deducciones;
    private double salarioNeto;

    public BuscarEmpleadoResponseDto( int id, String nombreCompleto, String tipoEmpleado, double salarioBruto, double deducciones, double salarioNeto){
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.tipoEmpleado = tipoEmpleado;
        this.salarioBruto = salarioBruto;
        this.deducciones = deducciones;
        this.salarioNeto = salarioNeto;
    }

    public int getId(){
        return id;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public String getTipoEmpleado(){
        return tipoEmpleado;
    }

    public double getSalarioBruto(){
        return salarioBruto;
    }

    public double getDeducciones(){
        return deducciones;
    }

    public double getSalarioNeto(){
        return salarioNeto;
    }
}
