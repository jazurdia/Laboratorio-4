package Principal.Modos;

import java.util.ArrayList;

public class ModoRadio extends Modo {
    private Boolean frecuencia;
    private double emisoraActual;
    private ArrayList<Double> emisorasGuardadas = new ArrayList<Double>();

    /**
     * 
     * @param frecuencia boolean que establece la frecuencia. true si Am, false si Fm. Parámetro para el método setFrecuencia(boolean frecuencia)
     */
    public ModoRadio(boolean frecuencia){
        setModo(0); // modo radio. 
        setEmisora(106.5);//emisora por defecto.
        setFrecuencia(false); // FM por defecto. 
    }
    
    public void nextEmisora(){
        this.emisoraActual = emisoraActual + 0.5;
    }

    public void guardarEmisora(){
        emisorasGuardadas.add(emisoraActual);
    }

    /**
     * 
     * @param num establece la emisora que se guarda en ArrayList Emisoras Guardadas. 
     */
    public void guardarEmisora(double num){
        emisorasGuardadas.add(num);
    }
    
    
        // setter y getters

    /**
     * 
     * @param emisoraActual establece la emisora actual, para que pueda reproducirse. 
     */
    public void setEmisora(double emisoraActual){
        this.emisoraActual = emisoraActual;
    }

    /**
     * 
     * @return devuelve la emisora que reproduce actualmente. 
     */
    public double getEmisoraActual(){
        return emisoraActual;
    }

    /**
     * 
     * @return regresa un ArrayList de datos tipo double, que son los números de las emisoras guardadas. 
     */
    public ArrayList<Double> getEmisorasGuardadas(){
        return emisorasGuardadas;
    }

    /**
     * 
     * @param frecuencia boolean que establece la frecuencia. true si Am, false si Fm. 
     */
    public void setFrecuencia(boolean frecuencia){
        this.frecuencia = frecuencia;
    }

    public boolean getFrecuencia(){
        return frecuencia;
    }

    

    



}
