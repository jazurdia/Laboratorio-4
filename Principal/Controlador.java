package Principal;

import Principal.Carros.CarroA;
import Principal.Carros.CarroC;
import Principal.Carros.CarroS;

public class Controlador {
    // esta es la clase controlador.

    public static void main(String args[]){
        Vista vista = new Vista();
        switch (vista.menuCarros()) {
            case 1:
                CarroS carros = new CarroS();
                carros.ex();
                break;
            
            case 2:
                CarroA carroa = new CarroA();
                carroa.ex();                
            break;

            case 3:
                CarroC carroc = new CarroC();
                carroc.ex();                
            break;

            default:
                break;
        }
    }
}
