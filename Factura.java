public class Factura implements PorPagar{
    private int numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
    public Factura(int numeroPieza, String descripcionPieza,int cantidad, double precioPorArticulo){
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.setCantidad(cantidad);
        this.setPrecioPorArticulo(precioPorArticulo);
    }
    public int getNumeroPieza() {return numeroPieza;}

    public void setNumeroPieza(int numeroPieza) {this.numeroPieza = numeroPieza;}

    public String getDescripcionPieza() {return descripcionPieza;}

    public void setDescripcionPieza(String descripcionPieza) {this.descripcionPieza = descripcionPieza;}

    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {
        this.cantidad = 0;
        if(cantidad > 0)
            this.cantidad = cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = 0;
        if(precioPorArticulo > 0)
            this.precioPorArticulo = precioPorArticulo;
    }

    @Override
    public String toString() {
        return "Factura No. :" + this.numeroPieza + "\t" + this.descripcionPieza + "\t"+ this.cantidad + "\t" + this.precioPorArticulo;
    }

    public double obtenerMontoPago(){
        return this.cantidad * this.precioPorArticulo;

    }
}

