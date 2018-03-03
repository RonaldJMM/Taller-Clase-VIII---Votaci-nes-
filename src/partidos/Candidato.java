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
    
    
    public String getNombres() {
        return this.nombres;
    }

    
   
   
    public void setNombres(String _nombres) {
        this.nombres = _nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return this.apellidos;
    }

    /**
     *
     * @param _apellidos
     */
    public void setApellidos(String _apellidos) {
        this.apellidos = _apellidos;
    }

    /**
     * @return the edad
     */
    public byte getEdad() {
        return this.edad;
    }

    /**
     * @param _edad the edad to set
     */
    public void setEdad(byte _edad) {
        this.edad = _edad;
    }

    /**
     * @return the telefono
     */
    public long getTelefono() {
        return this.telefono;
    }

    /**
     * @param _telefono
     
     */
    public void setTelefono(long _telefono) {
        this.telefono = _telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * @param _direccion
     */
    public void setDireccion(String _direccion) {
        this.direccion = _direccion;
    }

    /**
     * @return the ciudadNacimiento
     */
    public String getCiudadNacimiento() {
        return this.ciudadNacimiento;
    }

    /**
     *
     * @param _ciudadNacimiento
     */
    public void setCiudadNacimiento(String _ciudadNacimiento) {
        this.ciudadNacimiento = _ciudadNacimiento;
    }

    /**
     * @return the numeroVotos
     */
    public int getNumeroVotos() {
        return this.numeroVotos;
    }

    /**
     * @param _numeroVotos
     */
    public void setNumeroVotos(int _numeroVotos) {
        this.numeroVotos = _numeroVotos;
    }

    /**
     * @return the nombres
     */
    
    
    
    
    
}
