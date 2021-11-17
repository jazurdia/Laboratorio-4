package Principal.Modos;

import java.util.ArrayList;

public class ModoReproduccion extends Modo {
    private ArrayList<String> listaDeReproduccionActual = new ArrayList<String>();
    private ArrayList<String> listaA = new ArrayList<String>(); // constante
    private ArrayList<String> listaB = new ArrayList<String>(); // constante
    private ArrayList<String> listaC = new ArrayList<String>(); // constante
    private int varInutil;
    private String cancionActual;

    // Constructor
    
    /**
     * 
     * @param listaActual establece la playlist actual.
     * @param var establece el tipo de reproduccion que es. 
     */
    public ModoReproduccion(int listaActual, int var){
        setModo(1); //Modo Reproduccion. 
        crearListas();
        seleccionarPlaylist(listaActual);
        setVarInutil(var);
    }
    
    
    /**
     * Este método selecciona una de las tres playlist predeterminadas. 
     * @param playList: int que hace seleccionar una de las tres playlist predeterminadas. 
     */
    
    public void seleccionarPlaylist(int playList){
        switch (playList) {
            case 1:
                listaDeReproduccionActual = listaA;
                break;
        
            case 2:
                listaDeReproduccionActual = listaB;
                break;

            case 3:
                listaDeReproduccionActual = listaC;
                break;
        } 
    }

    /**
     * 
     * @param num establece la canción actual en reproduccion
     */
    public void cambiarCancion(int num){
        cancionActual = listaDeReproduccionActual.get(num);
    }

    // Getters y Setters

    /**
     * 
     * @return devuelve la cancion actual
     */
    public String getCancionActual(){
        return cancionActual;
    }

    /**
     * 
     * @return devuelve listaA
     */
    public ArrayList<String> getListaA(){
        return listaA;
    }

    /**
     * 
     * @return devuelve ListaB
     */
    public ArrayList<String> getListaB(){
        return listaB;
    }

    /**
     * 
     * @return devuelve listaC
     */
    public ArrayList<String> getListaC(){
        return listaC;
    }

    /**
     * 
     * @param varInutil establece el valor de varInutil. 
     */
    public void setVarInutil(int varInutil){
        this.varInutil = varInutil;
        // Si es 1, es MP3. Si es 2, es CD. Si es 3, es Spotify. 
    }

    /**
     * 
     * @return devuelve el tipo de reproductor que se está ejecutando. 
     */
    public int getVarInutil(){
        return varInutil;
    }

    public void crearListas(){
        listaA.add("Smoke on the water / 04:35 / Deep Purple / Rock");
        listaA.add("Just what I need / 03:45 / The Cars / Rock");
        listaA.add("Highway To Hell / 03:35 / AC DC / Rock");
        listaB.add("Dream on / 04:26 / AC DC / Rock");
        listaB.add("Another One Bites The Dust / 03:34 / Queen / Rock");
        listaB.add("Creep / 03:58 / Radiohead / Rock");
        listaC.add("Don't Stop Believin / 04:35 / Journey / Rock");
        listaC.add("Seven Nation Army / 04:00 / The White Strips / Rock");
        listaC.add("I love Rock & Roll / 02:55 / Twisted Sister / Rock");
    }

    

}
