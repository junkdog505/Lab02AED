public class test {
    public static void main(String[] args) {
        PorPagar objPorPagar[] = new PorPagar[4];
        objPorPagar [0] = new Factura(10, "producto 1",10,19.6);
        objPorPagar [1] = new Factura(20, "producto 2",5,12.79);
        objPorPagar [2] = new EmpleadoAsalariado("Jorge","Lopez","1010",110.60);
        objPorPagar [3] = new EmpleadoAsalariado("Maria","Nuñez","1020",220.20);
        listar(objPorPagar);
    }
    public static void listar(PorPagar[] arr){
        for(PorPagar obj : arr){
            System.out.println(obj + "\tPago: "+ obj.obtenerMontoPago());

        }
    }
}