package application.dto.empleado;

public class CalcularNominaResponseDto {

    private double totalNomina;

    public CalcularNominaResponseDto( double totalNomina){
        this.totalNomina = totalNomina;
    }

    public double getTotalNomina(){
        return totalNomina;
    }
}