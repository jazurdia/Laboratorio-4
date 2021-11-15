package Principal.Carros;

public class Carro {
    private boolean estado;
    private int volumen;

    public Carro(){
        setEstado(true);
        setVolumen(50);

    } 

    //setters y getters

    /**
     * 
     * @param volumen establece el volumen actual del carro. 
     */
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    /**
     * 
     * @param estado establece el estado de la radio (encendido: true, apagado: false)
     */
    public void setEstado(boolean estado){//enciende o apaga la radio. // remplaza a onOff()
        this.estado = estado;
    }

    /**
     * 
     * @return devuleve el estado del reproductor del carro. 
     */
    public boolean getEstado(){
        return estado;
    }

    /**
     * 
     * @return devuelve el volumen actual del carro. 
     */
    public int getVolumen(){
        return volumen;
    }

    




}
