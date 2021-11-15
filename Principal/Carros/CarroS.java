package Principal.Carros;

import Principal.Modos.ModoRadio;
import Principal.Modos.ModoReproduccion;
import Principal.Modos.ModoProductividadPackage.ModoProductividadS;
import Principal.Modos.ModoTelefonoPackage.ModoTelefonoS;

public class CarroS extends Carro{
    
    // Instancia  de Modos
    ModoRadio radio = new ModoRadio(true);
    ModoReproduccion reproductor = new ModoReproduccion(1, 1); // llamar método de la vista para esto. 
    ModoTelefonoS telefono = new ModoTelefonoS(true);
    ModoProductividadS productividad = new ModoProductividadS();

    
    public void ex(){
        //Menu 2 ¿Que Modo desea usar?

        boolean stop = false;
        while(stop == true){
            int menu2 = 0; {} //////
            
            switch (menu2) {
                case 1: //MODO RADIO
                boolean stop3 = false;
                while (stop3 == false){
                /**
                 * 1. cambiar de emisora
                 * 2. guardar la emisora
                 * 3. carga la emisora
                 * 4. cambiar de FM a AM. 
                 * 5. Salir del modo. 
                 */
                
                int menu3 = 0;
                switch (menu3){
                    case 1: // cambiar de emisora
                        radio.nextEmisora();
                        // vista para radio.getEmisora();
                        break;
        
                    case 2:// guardar la emisora
                        radio.guardarEmisora();
                        // vista para ver emisoras guardadas. 
                        break;
        
                    case 3: // cargar la emisora
                        radio.setEmisora(106.5);//vista
                        // vista para radio.getEmisoraActual();
                        break;
        
                    case 4: // cambiar frecuencia
                        radio.setFrecuencia(false);
                        break;
                    
                    case 5: // salir de este ciclo. 
                        stop3 = true;
                
                    default:
                        break;
                }
            }    


                    break;
            
                default:
                    break;
            }

            
                
        }

        
        
    }



}
