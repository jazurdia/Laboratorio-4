package Principal.Modos.ModoProductividadPackage;

import Principal.Interfaces.InterfacesProductividad.ProductividadA;

public class ModoProductividadA extends ModoProductividad implements ProductividadA{

    @Override
    public String[] mostrarTarjeta(String nombre, String email, String noCel) {
        // TODO Auto-generated method stub
        String[] info = new String[] {nombre, email, noCel};
        return info;
    }
    
}
