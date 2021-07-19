import java.util.Scanner;

public class Controlador {
    int opc;
    int c;
    int e;
    private Vista view;
    private Modelo model = new Modelo();
    Scanner dato = new Scanner(System.in);
    public void programa(){
        do{
            view.menu();
            System.out.println("Opción:");
            opc = dato.nextInt();
            model.servicio(opc);
            if (opc >= 4){
                break;
            }else {
                System.out.println("Estrato del inmueble:");
                e = dato.nextInt();
                model.setEstrato(e);
                System.out.println("Consumo del inmueble:");
                c = dato.nextInt();
                model.setConsumo(c);

                if (opc == 1) {
                    model.setValorUnitario(6200.0);
                    model.informacionFactura();
                    model.facturacion(model.getEstrato(), model.getConsumo());
                } else if (opc == 2){
                    model.setValorUnitario(9256.0);
                    model.informacionFactura();
                    model.facturacion(model.getEstrato(), model.getConsumo());
                }   else {
                    model.setValorUnitario(5234.0);
                    model.informacionFactura();
                    model.facturacion(model.getEstrato(), model.getConsumo());
                }
            }
        } while (opc != 4);
    }
}