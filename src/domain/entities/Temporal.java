package domain.entities;

public class Temporal extends Empleado{

    private double salarioMensual;

    public Temporal(double salarioMensual, String nombre, String apellido, String id, int antiguedad) {
        super(nombre, apellido, id, antiguedad);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioMensual;
    }

    @Override
    public boolean esEmpleadoPermanente() {
        return false;
    }

    @Override
    public double calcularBeneficios(){
        return 0;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }
}
