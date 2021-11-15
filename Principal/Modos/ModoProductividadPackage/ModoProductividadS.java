package Principal.Modos.ModoProductividadPackage;

import Principal.Interfaces.InterfacesProductividad.ProductividadS;

public class ModoProductividadS extends ModoProductividad implements ProductividadS {

    @Override
    public String planificarViaje(String origen, String destino, String fecha) {
        // TODO Auto-generated method stub
        String string = "Tu viaje, que comienza en " + origen + " y termina en " + destino + " se hará en " + fecha + ". Espero que lo disfrutes. ";
        return string;
    }
    
}
