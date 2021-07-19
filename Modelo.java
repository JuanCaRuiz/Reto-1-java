public class Modelo {
    private double valorUnitario;
    private int consumo;
    private int estrato;
    private double costo;
    private double descuento;
    private double impuesto;
    private double totalPagar;

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public void servicio (int opc){
        if(opc == 1){
            System.out.println("Pago Servicio de: Energia");
        }else if(opc == 2){
            System.out.println("Pago Servicio de: Acueducto");
        }else if(opc == 3){
            System.out.println("Pago Servicio de: Gas Natural");
        }else if(opc == 4){
            System.out.println("Hasta pronto");
        }else{
            System.out.println("Opción invalida");
        }
    }

    public void informacionFactura(){
        System.out.println("El consumo fue: "+consumo);
        System.out.println("El valor unidad: "+valorUnitario);
        System.out.println("Estrato del inmueble: "+estrato);
    }

    private double descuentoEstrato(int estrato, double total) {
        if (estrato == 1 || estrato == 2) {
            descuento = (total * 0.50)*(-1);
            System.out.println("Descuento o sobrecosto: "+(descuento));
            return descuento;
        } else if (estrato == 3 || estrato == 4) {
            descuento = (total * 0.10)*(-1);
            System.out.println("Descuento o sobrecosto: "+(descuento));
            return descuento;
        } else {
            descuento = total * 0.25;
            System.out.println("Descuento o sobrecosto: "+descuento);
            return descuento;
        }
    }

    private double impuesto(double total){
        impuesto = total * 0.01;
        System.out.println("Impuesto por infraestrutura: "+impuesto);
        return impuesto;
    }

    private double totalPagar(double total,double descuento, double impuesto){
        totalPagar = total + descuento + impuesto;
        System.out.println("TOTAL A PAGAR: "+totalPagar);
        return totalPagar;
    }

    public void facturacion(int estrato, int consumo){
        costo = valorUnitario*consumo;
        System.out.println("Costo total: "+costo);
        descuentoEstrato(estrato,costo);
        impuesto(costo);
        totalPagar(costo,descuento,impuesto);
    }

}