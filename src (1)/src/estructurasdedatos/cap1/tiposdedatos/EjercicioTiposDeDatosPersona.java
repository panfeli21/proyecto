/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.tiposdedatos;

/**
 *
 * @author felipe
 */
public class EjercicioTiposDeDatosPersona {
    
    private String nombre;
    public int cedula;
    private String direccion;
    private String telofono;
    
    
    public EjercicioTiposDeDatosPersona(int cedula) {
        this.cedula = cedula;
       
        
    }

    public EjercicioTiposDeDatosPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     * @felipe 
     */
    public void setNombre(String nombre) {
        //Codifico las reglas de negocio para cambiar un atributo.
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telofono
     */
    public String getTelofono() {
        return telofono;
    }

    /**
     * @param telofono the telofono to set
     */
    public void setTelofono(String telofono) {
        this.telofono = telofono;
    }

    
}
