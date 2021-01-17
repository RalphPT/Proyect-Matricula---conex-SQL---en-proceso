
package Logica;


import Datos.PagoDB;
import Entidad.Pago;

public class PagoL {
    
    PagoDB objpagoDB=new PagoDB();
    public boolean graba_Pago(Pago pago){
        return objpagoDB.graba_Pago(pago);
    }
    public boolean busca_Pago(String nropago){
        return objpagoDB.busca_Pago(nropago);
    }
}
