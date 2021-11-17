package Principal.Carros;

import Principal.Vista;
import Principal.Modos.ModoRadio;
import Principal.Modos.ModoReproduccion;
import Principal.Modos.ModoProductividadPackage.ModoProductividadC;
import Principal.Modos.ModoTelefonoPackage.ModoTelefonoC;

public class CarroC extends Carro {
    Vista vista = new Vista();
    ModoRadio radio = new ModoRadio(true);
    ModoReproduccion reproductor = new ModoReproduccion(1, 1); // llamar método de la vista para esto. 
    ModoTelefonoC telefono = new ModoTelefonoC(false);
    ModoProductividadC productividad = new ModoProductividadC();
    
    @Override
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
                                vista.show("La emisora actual es: " + radio.getEmisoraActual());
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
                                stop3b = false;
                                break;

                            default:
                                break;
                        }
                    }
                    break;
                
                case 3://MODO TELEFONO S
                    boolean stop3c = false;
                    while (stop3c == false){
                        switch (vista.menuModoTelefonoC()) {
                            case 1:
                                telefono.setConexion(vista.conexion()); // vista
                                break;

                            case 2:
                                telefono.llamarContacto(vista.Contacto()); // vista
                                break;

                            case 3:
                            vista.FinalizarLlamada();

                            case 4:
                                telefono.llamadaEnEspera(); //vista
                                vista.LlamadaEnEspera();
                                break;

                            case 5:
                                stop3c = true;
                        
                            default:
                                break;
                        }
                    }
                    break;

                case 4:
                    productividad.pronosticoClima("");
                    vista.PronnosticoClima("Nublado");
                    break;

                default:
                    break;
            }           
        }
    }
}
