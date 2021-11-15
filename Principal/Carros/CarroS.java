package Principal.Carros;

import Principal.Vista;
import Principal.Modos.ModoRadio;
import Principal.Modos.ModoReproduccion;
import Principal.Modos.ModoProductividadPackage.ModoProductividadS;
import Principal.Modos.ModoTelefonoPackage.ModoTelefonoS;

public class CarroS extends Carro{
    
    // Instancia  de Modos
    Vista vista = new Vista();
    ModoRadio radio = new ModoRadio(true);
    ModoReproduccion reproductor = new ModoReproduccion(1, 1); // llamar método de la vista para esto. 
    ModoTelefonoS telefono = new ModoTelefonoS(false);
    ModoProductividadS productividad = new ModoProductividadS();

    
    public void ex(){
        //Menu 2 ¿Que Modo desea usar?

        boolean stop = false;
        while(stop == true){
            switch (vista.menuModo()) {
                case 1: //MODO RADIO
                    boolean stop3a = false;
                    while (stop3a == false){           
                        switch (vista.menuModoRadio()){
                            case 1: // cambiar de emisora
                                radio.nextEmisora();
                                // vista para radio.getEmisora();
                                break;
                
                            case 2:// guardar la emisora
                                radio.guardarEmisora();
                                // vista para ver emisoras guardadas. 
                                break;
                
                            case 3: // cargar la emisora
                                radio.setEmisora(vista.Emisora());//vista
                                // vista para radio.getEmisoraActual();
                                break;
                
                            case 4: // cambiar frecuencia
                                radio.setFrecuencia(vista.AM_FM());
                                break;
                            
                            case 5: // salir de este ciclo. 
                                stop3a = true;
                        
                            default:
                                break;
                        }
                    }
                    break;
                
                case 2: // MODO REPRODUCTOR
                    boolean stop3b = false;
                    while (stop3b == false){
                        int menu3 = 0;
                        switch (menu3) {
                            case 1: // seleccionar playlist. 
                                reproductor.seleccionarPlaylist(vista.PlayList());//vista
                                break;
                            case 2: // cambiar canción
                                reproductor.cambiarCancion(vista.Cancion());
                                break;
                            case 3: // mostrar cancion
                                reproductor.getCancionActual();
                            default:
                                break;
                        }
                    }
                    break;
                
                case 3://MODO TELEFONO S
                    boolean stop3c = false;
                    while (stop3c == false){
                        int menu3 = 0;
                        switch (menu3) {
                            case 1:
                                telefono.setConexion(vista.conexion()); // vista
                                break;

                            case 2:
                                telefono.llamarContacto(vista.Contacto()); // vista
                                break;

                            case 3:
                                //metodo de la vista que diga que finalizó la llamada. 

                            case 4:
                                telefono.entradaAudio(vista.telefono_auriculares()); //vista
                                break;

                            case 5:
                                stop3c = true;
                        
                            default:
                                break;
                        }
                    }
                    break;

                case 4:
                    productividad.planificarViaje(vista.Origen(), vista.Destino(), vista.Fecha());
                    break;

                default:
                    break;
            }

            
                
        }

        
        
    }



}
