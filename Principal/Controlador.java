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

    
        ArrayList<Carro> carro = new ArrayList<Carro>();

        /**
         * Menu 1, se instancia el tipo de carro. 
         * Menu 2, se decide qué modo se usará. 
         * Menus 3s, específicos para cada modo. 
         * 
         * 
         */

        
        int tipoCarro = 1;
        switch (tipoCarro) {
            case 1:// carro S
                carro.add(new CarroS());
                break;
            case 2:// carro S
                carro.add(new CarroA());
                break;
            case 3:
                carro.add(new CarroC());
                break;

        }

        boolean stopMenu2 = false;
        while (stopMenu2 == false){
            //menu 2
            
        }
        
















    }
}
