package Principal;

import java.util.ArrayList;

import Principal.Carros.Carro;
import Principal.Carros.CarroA;
import Principal.Carros.CarroC;
import Principal.Carros.CarroS;

public class Controlador {
    // esta es la clase controlador.

    public static void main(String args[]){
        Vista vista = new Vista();
        ArrayList <Carro> controlador_carros = new ArrayList<Carro>();
        switch (vista.menuCarros()) {
            case 1:
                controlador_carros.add(new CarroS());
                break;
            
            case 2:
                controlador_carros.add(new CarroA());
                break;

            case 3:
                controlador_carros.add(new CarroC());
                break;

            default:
                break;
        }

        controlador_carros.get(0).e

    }
}
