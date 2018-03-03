/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidos;

/**
 *
 * @author Ronald
 */
public class Candidato extends Partido{
    /*atributos*/
    private String nombres;
    private String apellidos;
    private byte edad;
    private long telefono;
    private String direccion;
    private String ciudadNacimiento;
    private int numeroVotos;
    
    /*constructor*/

    public Candidato(String _nombrePartido, int _gastoCampaña, int _totalVotos,String _nombres,String _apellidos, byte _edad,long _telefono,String _direccion, String _ciudadNacimiento,int _numeroVotos) {
        super(_nombrePartido, _gastoCampaña, _totalVotos);
        this.nombres=_nombres;
        this.apellidos=_apellidos;
        this.edad=_edad;
        this.telefono=_telefono;
        this.direccion=_direccion;
        this.ciudadNacimiento=_ciudadNacimiento;
        this.numeroVotos=_numeroVotos;
        
        
        
        
    }
    
    
    /*get y set de atributos*/
    
    public void setNombres(){
    
        
       
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the edad
     */
    public byte getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    /**
     * @return the telefono
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
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
     * @return the ciudadNacimiento
     */
    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    /**
     * @param ciudadNacimiento the ciudadNacimiento to set
     */
    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    /**
     * @return the numeroVotos
     */
    public int getNumeroVotos() {
        return numeroVotos;
    }

    /**
     * @param numeroVotos the numeroVotos to set
     */
    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
    
    
}
