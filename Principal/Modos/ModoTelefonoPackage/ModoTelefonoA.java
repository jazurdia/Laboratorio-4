package Principal.Modos.ModoTelefonoPackage;

import Principal.Interfaces.InterfacesTelefono.TelefonoA;

public class ModoTelefonoA extends ModoTelefono implements TelefonoA {

    public ModoTelefonoA(boolean conexion) {
        super(conexion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String llamarUltimo() {
        // TODO Auto-generated method stub
        String llamando = getContactoActual();
        return llamando;
    }
    
}
