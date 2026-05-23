package domain.entities;

public abstract class Empleado {

    protected String nombre;
    protected String apellido;
    protected String id;
    protected int antiguedad;
    protected final double PORCENTAJE_SEGURO_PENSION = 0.04;

    public Empleado(String nombre, String apellido, String id, int antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.antiguedad = antiguedad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getId() {
        return id;
    }
    public int getAntiguedad() {
        return antiguedad;
    }

    public abstract double calcularSalarioBruto();
    public abstract double esEmpleadoPermanente();

    public double calcularDeducciones(){
        return calcularSalarioBruto() * PORCENTAJE_SEGURO_PENSION;
    }

    public double calcularBeneficios(){
        return = 0;
    }

    public double calcularSalarioNeto(){
        double bruto = calcularSalarioBruto();
        double deduciones = calcularDeducciones();
        double beneficios = calcularBeneficios();
        double neto = bruto - deduciones + beneficios;
        return Math.max(neto, 0);
    }
}
