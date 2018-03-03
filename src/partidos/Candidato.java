/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidos;
import java.math.BigDecimal;
/**
 *
 * @author Ronald
 */
public class Candidato extends Partido{
    /*atributos*/
    private String nombres;
    private String apellidos;
    private int edad;
    private long telefono;
    private String direccion;
    private String ciudadNacimiento;
    private int numeroVotosTelevision=0;
    private int numeroVotosRadio=0;
    private int numeroVotosInternet=1;
    private int gastoVotos=0;
    private String partido;
    
    static int polo=3_000_000;
    static int liberal=2_000_000;
    static int verde=1_000_000;
    static int mira=500_000;
    /*constructor*/

    public Candidato(String _nombrePartido, int _totalVotos) {
        super(_nombrePartido, _totalVotos);
        this.partido=_nombrePartido;
    }
    
    
    public void calculoVotos(){
        this.gastoVotos=(this.numeroVotosInternet*10_000)+(this.numeroVotosTelevision*200_000)+(this.numeroVotosRadio*150_000);
        polo+=this.gastoVotos;
        System.out.println("Total polo: "+polo);
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
    public int getEdad() {
        return this.edad;
    }

    /**
     * @param _edad the edad to set
     */
    public void setEdad(int _edad) {
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
     * @return the nombres
     */
    
    
    
    
    
}
