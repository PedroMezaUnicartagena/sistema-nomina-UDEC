package domain.entities;

public abstract class Empleado {

    protected String nombre;
    protected String apellido;
    protected int id;
    protected int antiguedad;
    protected final double PORCENTAJE_SEGURO_PENSION = 0.04;

    public Empleado(String nombre, String apellido, int id, int antiguedad) {
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
    public int getId() {
        return id;
    }
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setNombre( String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setAntiguedad (int antiguedad){
        this.antiguedad = antiguedad;
    }

    public abstract double calcularSalarioBruto();
    public abstract boolean esEmpleadoPermanente();

    public double calcularDeducciones(){
        return calcularSalarioBruto() * PORCENTAJE_SEGURO_PENSION;
    }

    public double calcularBeneficios(){
        return 0;
    }

    public double calcularSalarioNeto(){
        double bruto = calcularSalarioBruto();
        double deduciones = calcularDeducciones();
        double beneficios = calcularBeneficios();
        double neto = bruto - deduciones + beneficios;
        return Math.max(neto, 0);
    }
}
