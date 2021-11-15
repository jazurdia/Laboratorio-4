package Principal.Carros;

import Principal.Modos.ModoRadio;
import Principal.Modos.ModoReproduccion;
import Principal.Modos.ModoProductividadPackage.ModoProductividadS;
import Principal.Modos.ModoTelefonoPackage.ModoTelefonoS;

public class CarroS extends Carro implements {
    ModoRadio radio = new ModoRadio(true);
    ModoReproduccion reproductor = new ModoReproduccion(listaActual, var); // llamar método de la vista para esto. 
    ModoTelefonoS telefono = new ModoTelefonoS(true);
    ModoProductividadS productividad = new ModoProductividadS();

}
