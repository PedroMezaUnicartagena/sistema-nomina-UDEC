package domain.entities;

public class PorHoras extends Empleado{

    //atributos
    private double tarifaHoras;
    private int horasTrabajadas;
    private final double PAGO_HORAS_EXTRA = 1.5;
    private final int REQUISITO_ANIOS_FONDO_AHORRO = 1;
    private final double PORCENTAJE_SALARIO_FONDO = 0.02;


    //constructor con parametros
    public PorHoras(double tarifaHoras, int horasTrabajadas, String nombre, String apellido, String id, int antiguedad) {
        super(nombre, apellido, id, antiguedad);

        if (horasTrabajadas < 0){
            throw new IllegalArgumentException("las horas trabajadas no puede ser"
                    + "negativas");
        }

        this.tarifaHoras = tarifaHoras;
        this.horasTrabajadas = horasTrabajadas;
    }





    //funciones sobreescritas
    @Override
    public double calcularSalarioBruto() {
        int horasNormales = Math.min(horasTrabajadas, 40);
        int horasExtras = Math.max(horasTrabajadas - 40, 0);

        return (horasNormales * tarifaHoras) + (horasExtras * tarifaHoras * PAGO_HORAS_EXTRA);
    }

    @Override
    public boolean esEmpleadoPermanente() {
        return false;
    }

    @Override
    public double calcularBeneficios(){
        double bruto = calcularSalarioBruto();

        if (antiguedad > REQUISITO_ANIOS_FONDO_AHORRO) {
            return bruto * PORCENTAJE_SALARIO_FONDO;
        }
        return 0;
    }

    public double getTarifaHoras() {
        return tarifaHoras;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
}
