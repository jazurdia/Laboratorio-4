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
        while(stop == false){
            switch (vista.menuModo()) {
                case 1: //MODO RADIO
                    boolean stop3a = false;
                    while (stop3a == false){           
                        switch (vista.menuModoRadio()){
                            case 1: // cambiar de emisora
                                radio.nextEmisora();
                                vista.show("La emisora actual es: " + radio.getEmisoraActual());
                                // vista para radio.getEmisora();
                                break;
                
                            case 2:// guardar la emisora
                                radio.guardarEmisora();
                                vista.show("Se ha guardado la emisora");
                                break;
                
                            case 3: // cargar la emisora
                                radio.setEmisora(vista.Emisora());//vista
                                vista.show("La emisora actual es: " + radio.getEmisoraActual());
                                break;
                
                            case 4: // cambiar frecuencia
                                radio.setFrecuencia(vista.AM_FM());
                                vista.show("Se ha cambiado la frecuencia");
                                break;
                            
                            case 5: // salir de este ciclo. 
                                stop3a = true;
                                break;
                        
                            default:
                                break;
                        }
                    }
                    break;
                
                case 2: // MODO REPRODUCTOR
                    boolean stop3b = false;
                    while (stop3b == false){
                        switch (vista.menuModoReproduccion()) {
                            case 1: // seleccionar playlist. 
                                reproductor.seleccionarPlaylist(vista.PlayList());//vista
                                break;
                            case 2: // cambiar canción
                                reproductor.cambiarCancion(vista.Cancion());
                                vista.show("La cancion actual es: " + reproductor.getCancionActual());
                                break;
                            case 3: // mostrar cancion
                                reproductor.getCancionActual();
                                vista.show("La cancion actual es: " + reproductor.getCancionActual());
                                break;

                            case 4:
                                stop3b = true;
                                break;

                            default:
                                break;
                        }
                    }
                    break;
                
                case 3://MODO TELEFONO S
                    boolean stop3c = false;
                    while (stop3c == false){
                        switch (vista.menuModoTelefonoS()) {
                            case 1:
                                telefono.setConexion(vista.conexion()); // vista
                                break;

                            case 2:
                                telefono.llamarContacto(vista.Contacto()); // vista
                                break;

                            case 3:
                                vista.FinalizarLlamada();

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
                    //Método de la vista introductorio?
                    productividad.planificarViaje(vista.Origen(), vista.Destino(), vista.Fecha());
                    break;

                case 5:
                    stop = true;
                    break;

                default:
                    break;
            }           
        }
    }
}
