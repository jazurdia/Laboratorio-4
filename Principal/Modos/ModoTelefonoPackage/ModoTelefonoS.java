package Principal.Modos.ModoTelefonoPackage;

import Principal.Interfaces.InterfacesTelefono.TelefonoS;

public class ModoTelefonoS extends ModoTelefono implements TelefonoS{

    public ModoTelefonoS(boolean conexion) {
        super(conexion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean entradaAudio(boolean entradad) {
        // TODO Auto-generated method stub
        return entradad;
    }
    
}
