package domain.entities;

public class Asalariado extends Empleado{

    //atributos
    private double salarioMensual;
    private final int BONO_ALIMENTACION = 1000000;
    private final int ANIOS_BONO_ANTIGUEDAD = 5;
    private final double PORCENTAJE_BONO_MENSUAL = 0.10;

    //constructor

    public Asalariado(String nombre, String apellido, int id, int antiguedad, double salarioMensual) {
        super(nombre, apellido, id, antiguedad);
        this.salarioMensual = salarioMensual;

    }

    // funciones para calcular salario bruto
    //si es empleado o no
    //y calcular los beneificios
    @Override
    public double calcularSalarioBruto() {
        return salarioMensual;
    }

    @Override
    public boolean esEmpleadoPermanente() {
        return true;
    }

    @Override
    public double calcularBeneficios(){
        double beneficios = 0;
        beneficios += BONO_ALIMENTACION;
        if (antiguedad >ANIOS_BONO_ANTIGUEDAD){
            beneficios += salarioMensual * PORCENTAJE_BONO_MENSUAL;
        }
        return beneficios;
    }

    //getter para usarlo en el main
    public double getSalarioMensual() {
        return salarioMensual;
    }
}
