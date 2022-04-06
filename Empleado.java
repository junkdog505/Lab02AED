public abstract class Empleado implements PorPagar{
    private String primerNombre, apellidoPaterno, numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial){
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNOmbre()
    {
		return this.primerNombre;
	}

    public void setPrimerNOmbre(String primerNombre)
    {
		this.primerNombre = primerNombre;
	}

    public String getNumeroSeguroSocial() {
        return this.numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    @Override
    public String toString(){
        return this. primerNombre + " " + this.apellidoPaterno + "\n" + "numero de seguridad social: " + this.numeroSeguroSocial;
    }

}
