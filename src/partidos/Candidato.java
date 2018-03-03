/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidos;

import java.math.BigDecimal;
import java.util.Scanner;
/**
 *
 * @author Ronald
 */
public class Candidato extends Partido{
    /*atributos*/
    private String nombres;
    private String apellidos;
    private int edad=0;
    private long telefono;
    private String direccion;
    private String ciudadNacimiento;
    private int numeroVotosTelevision=0;
    private int numeroVotosRadio=0;
    private int numeroVotosInternet=0;
    private int gastoVotos=0;
    
    
    /*constructor*/

    public Candidato(String _nombrePartido, int _totalVotos) {
        super(_nombrePartido, _totalVotos);
        this.setTotalVotos(_totalVotos);
    }
    
    
    public void calculoVotos(){
        this.gastoVotos=(this.numeroVotosInternet*10_000)+(this.numeroVotosTelevision*200_000)+(this.numeroVotosRadio*150_000);
        polo+=this.gastoVotos;
        System.out.println("Total polo: "+polo);
        ;
    }
  
  
     public void visualizarCandidato(){
     
           System.out.println("...................................");
           System.out.println("El nombre del candidato es: "+this.nombres);
           System.out.println("El apellido:"+this.apellidos);
           System.out.println("Edad: "+this.edad);
           System.out.println("Ciudad de nacimiento:  "+this.ciudadNacimiento);
           System.out.println("Partido Politico: "+this.getNombrePartido());
           System.out.println("...................................");
     }
     
     public void votarCandidato(){
         
         
         Scanner lecturaVar = new Scanner(System.in);/*funcion para escanear el dato del usuario*/
            byte opcionMenu;/*variable para la opcion del menu*/
            do{/*repeticion del menu */
            System.out.println("Medios");
            System.out.println("1.Television 2.Radio 3.Internet");
            System.out.println("Porque medio se entero del candidato?:");

            opcionMenu = lecturaVar.nextByte();/**escaneo del dato del menu del usuario*/
            switch(opcionMenu){

                case 1:
                    this.numeroVotosTelevision++;
                    break;

                case 2:
                    this.numeroVotosRadio++;
                   break;

                case 3:
                    this.numeroVotosInternet++;
                   break;
                   
                default:/**
                        *opcion no valida del menu.
                        * 
                        * */
                    System.out.println("Opcion no valida en el menu.");
                    break;
            }

            }while(opcionMenu!=1 && opcionMenu!=2 && opcionMenu!=3);
         
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
