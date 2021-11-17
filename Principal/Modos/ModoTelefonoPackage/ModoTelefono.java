package Principal.Modos.ModoTelefonoPackage;

import java.util.ArrayList;

import Principal.Modos.Modo;

public class ModoTelefono extends Modo {
    private boolean conexion = false;
    private ArrayList<String> contactos = new ArrayList<String>()    ; // constante.
    private String contactoActual;

    public ModoTelefono(boolean conexion){
        setModo(2); // nodo telefono
        setConexion(conexion);
        crearContactos();
        contactoActual = contactos.get(0);
    }

    /**
     * 
     * @param num ingresar el numero de índice de los contactos. 
     * @return devuelve el nombre del contacto que se está llamando. 
     */
    public String llamarContacto(int num){
        setContactoActual(num);
        // vista debe indicar que se llama contacto. 

        return contactoActual;
    }

    // Setters y Getters

    /**
     * 
     * @param conexion establece si hay conexión entre el teléfono y el carro. 
     */
    public void setConexion(boolean conexion){
        this.conexion = conexion;
    }

    /**
     * 
     * @param num establece el índice de contacto actual. 
     */
    private void setContactoActual(int num){
        this.contactoActual = contactos.get(num);
    }

    /**
     * 
     * @return regresa el nombre del contacto actual. 
     */
    public String getContactoActual(){
        return contactoActual;
    }

    /**
     * 
     * @return devuelve el ArrayList de contactos, se debería usar para la vista. 
     */
    public ArrayList<String> getContactos (){
        return contactos;
    }

    /**
     * 
     * @return devuelve el valor de la conexion (encendido o apagado)
     */
    public boolean getConexion(){
        return conexion;
    }

    public void crearContactos(){
        contactos.add("Mark Hammil");
        contactos.add("Julio Iglesias");
        contactos.add("Winston Churchill");
    }




}
