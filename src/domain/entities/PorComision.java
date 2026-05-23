package domain.entities;

public class PorComision extends Empleado{

    private double sueldoBase;
    private double totalVentas;
    private double porcentajeDeComision;
    private final int VENTAS_MIN_BONO = 20000000;
    private final double PORCENTAJE_BONO = 0.03;
    private final int BONO_ALIMENTACION = 1000000;

    public PorComision(double sueldoBase, double totalVentas, double porcentajeDeComision, String nombre, String apellido, String id, int antiguedad) {
        super(nombre, apellido, id, antiguedad);

        if (totalVentas < 0) {
            throw new IllegalArgumentException("Las ventas no pueden ser negativas.");
        }

        this.sueldoBase = sueldoBase;
        this.totalVentas = totalVentas;
        this.porcentajeDeComision = porcentajeDeComision;
    }

    @Override
    public double calcularSalarioBruto() {
        double comision = totalVentas * porcentajeDeComision;
        double bonoExtra = (totalVentas > VENTAS_MIN_BONO) ? totalVentas * PORCENTAJE_BONO : 0;
        return sueldoBase + comision + bonoExtra;
    }

    @Override
    public boolean esEmpleadoPermanente() {
        return true;
    }


    @Override
    public double calcularBeneficios(){
        return BONO_ALIMENTACION;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public double getPorcentajeDeComision() {
        return porcentajeDeComision;
    }
}
