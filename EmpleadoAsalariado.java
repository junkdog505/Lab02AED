public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,String numeroSeguroSocial, double salarioSemanal){
        super(primerNombre, apellidoPaterno, numeroSeguroSocial); 
        setSalarioSemanal(salarioSemanal);

    }

    public double getSalarioSemanal() {return salarioSemanal;}
    public void setSalarioSemanal(double salarioSemanal){
        this.salarioSemanal = 0;
        if(salarioSemanal > 0)
            this.salarioSemanal = salarioSemanal;
    }
    @Override
    public String toString() {return "Empleado Asalariado: " + super.toString() + "\n" + "Salario Semanal: "+ this.salarioSemanal;}

    public double obtenerMontoPago(){return this.salarioSemanal * 4;}
}