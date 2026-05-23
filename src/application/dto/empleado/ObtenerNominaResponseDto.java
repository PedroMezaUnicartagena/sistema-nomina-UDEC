package application.dto.empleado;

import java.util.List;

public class ObtenerNominaResponseDto {
    private List<EmpleadoNominaDto> empleados;

    public ObtenerNominaResponseDto( List<EmpleadoNominaDto> empleados ){
        this.empleados = empleados;
    }

    public List<EmpleadoNominaDto> getEmpleados(){
        return empleados;
    }


    public static class EmpleadoNominaDto {
        private int id;
        private String nombreCompleto;
        private String tipoEmpleado;
        private double salarioNeto;

        public EmpleadoNominaDto( int id, String nombreCompleto,  String tipoEmpleado, double salarioNeto){
            this.id = id;
            this.nombreCompleto = nombreCompleto;
            this.tipoEmpleado = tipoEmpleado;
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

        public double getSalarioNeto(){
            return salarioNeto;
        }
    }
}
