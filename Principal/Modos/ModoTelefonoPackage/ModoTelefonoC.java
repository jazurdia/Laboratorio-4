package Principal.Modos.ModoTelefonoPackage;

import Principal.Interfaces.InterfacesTelefono.TelefonoC;

public class ModoTelefonoC extends ModoTelefono implements TelefonoC{

    public ModoTelefonoC(boolean conexion) {
        super(conexion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String llamadaEnEspera() {
        return null;
    }
    
}
