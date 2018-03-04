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
 * @author Ronald Jefrey Moreno Mora
 * @author Luis Miguel Morales Sandoval
 * Programacion II
 * SIS 301
 * Universidad de Cundinamarca - Facatativa
 */

public class Candidato extends Partido{
    /*atributos*/
    private String nombres;
    private String apellidos;
    private String Documento;
    private int edad=0;
    private long telefono;
    private String direccion;
    private String ciudadNacimiento;
    private int numeroVotosTelevision=0;
    private int numeroVotosRadio=0;
    private int numeroVotosInternet=0;
    private int totalVotos=0;
    private int gastoCandidato=0;
    
    
    /*constructor*/
    /**
     * 
     * @param _nombrePartido
     * @param _nombres
     * @param _apellidos
     * @param _documento
     * @param _edad
     * @param _telefono
     * @param _direccion
     * @param _ciudadNacimiento
     * @param _numeroVotosTelevision
     * @param _numeroVotosRadio
     * @param _numeroVotosInternet
     * @param _totalVotos
     * @param _gastoCandidato 
     */
    public Candidato(String _nombrePartido,String _nombres,String _apellidos,String _documento,int _edad, long _telefono,String _direccion, String _ciudadNacimiento,int _numeroVotosTelevision, int _numeroVotosRadio,int _numeroVotosInternet,int _totalVotos, int _gastoCandidato) {
        super(_nombrePartido);
        this.nombres=_nombres;
        this.apellidos=_apellidos;
        this.Documento=_documento;
        this.edad=_edad;
        this.telefono=_telefono;
        this.direccion=_direccion;
        this.ciudadNacimiento=_ciudadNacimiento;
        this.numeroVotosTelevision=_numeroVotosTelevision;
        this.numeroVotosRadio=_numeroVotosRadio;
        this.numeroVotosInternet=_numeroVotosInternet;
        this.totalVotos=_totalVotos;
        this.gastoCandidato=_gastoCandidato;
    }
    
    /**
     * visualiza los datos de los candidatos.
     */
     public void visualizarCandidato(){
     
           System.out.println("...................................");
           System.out.println("//Datos del Candidato//");
           System.out.println("Nombres: "+this.getNombres());
           System.out.println("Apellidos: "+this.getApellidos());
           System.out.println("Nº Documento: "+this.getDocumento());
           System.out.println("Edad: "+this.getEdad());
           System.out.println("Ciudad de Nacimiento:  "+this.getCiudadNacimiento());
           System.out.println("Direccion: "+this.getDireccion());
           System.out.println("Telefono: "+this.getTelefono());
           System.out.println("Partido Politico: "+this.getNombrePartido());
           System.out.println("...................................");
     }
     /**
      * Se realiza la votacion del candidato.
      */
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
                    this.setNumeroVotosTelevision(this.getNumeroVotosTelevision()+1);
                    break;

                case 2:
                    this.setNumeroVotosRadio(this.getNumeroVotosRadio()+1);
                   break;

                case 3:
                    this.setNumeroVotosInternet(this.getNumeroVotosInternet()+1);
                   break;
                   
                default:/**
                        *opcion no valida del menu.
                        * 
                        * */
                    System.out.println("Opcion no valida en el menu.");
                    break;
            }

            }while(opcionMenu!=1 && opcionMenu!=2 && opcionMenu!=3);
            
            this.setTotalVotos(this.getTotalVotos() + 1);
            
            if(this.getNombrePartido()=="Polo"){
                totalVotosPolo++;
            }
            if(this.getNombrePartido()=="Liberal"){
                totalVotosLiberal++;
            }
            if(this.getNombrePartido()=="Verde"){
                totalVotosVerde++;
            }
            if(this.getNombrePartido()=="Mira"){
                totalVotosMira++;
            }
            
            calculoGasto();
     }
    /**
     * Se calcula los gasto de los partidos y los candidatos.
     */
    public void calculoGasto(){
        if (this.getNombrePartido()== "Polo"){
            gastoPartidoPolo-=this.getGastoCandidato();
            this.setGastoCandidato((this.getNumeroVotosInternet()*10_000)+(this.getNumeroVotosTelevision()*200_000)+(this.getNumeroVotosRadio()*150_000));
            gastoPartidoPolo+=this.getGastoCandidato();
        }
        if (this.getNombrePartido()== "Liberal"){
            gastoPartidoLiberal-=this.getGastoCandidato();
            this.setGastoCandidato((this.getNumeroVotosInternet()*10_000)+(this.getNumeroVotosTelevision()*200_000)+(this.getNumeroVotosRadio()*150_000));
            gastoPartidoLiberal+=this.getGastoCandidato();
        }
        if (this.getNombrePartido()== "Verde"){
            gastoPartidoVerde-=this.getGastoCandidato();
            this.setGastoCandidato((this.getNumeroVotosInternet()*10_000)+(this.getNumeroVotosTelevision()*200_000)+(this.getNumeroVotosRadio()*150_000));
            gastoPartidoVerde+=this.getGastoCandidato();
        }
        if (this.getNombrePartido()== "Mira"){
            gastoPartidoMira-=this.getGastoCandidato();
            this.setGastoCandidato((this.getNumeroVotosInternet()*10_000)+(this.getNumeroVotosTelevision()*200_000)+(this.getNumeroVotosRadio()*150_000));
            gastoPartidoMira+=this.getGastoCandidato();
        }
        
        
    }
    /**
     * Muestra los votos de los candidatos.
     */
    public void visualizacionVotosCandidato(){
        System.out.println("El total de votos del cantidato "+this.getNombres()+" "+this.getApellidos()+" del partido "+this.getNombrePartido()+" es: "+this.getTotalVotos());

    }
    /**
     * Muestra los gastos de los candidatos.
     */
    public void visualizacionGastoCandidato(){
        System.out.println("El gasto por votaciones del candidato "+this.getNombres()+" "+this.getApellidos()+" del partido "+this.getNombrePartido()+" es de: $"+this.getGastoCandidato());
    }
    
    /*get y set de atributos*/
    /**
     * Muestra del dato.
     * @return nombres
     */
    
    public String getNombres() {
        return this.nombres;
    }

    
   /**
    * Captura el dato.
    * @param _nombres 
    */
   
    public void setNombres(String _nombres) {
        this.nombres = _nombres;
    }

    /**
     * Muestra del dato.
     * @return apellidos
     */
    public String getApellidos() {
        return this.apellidos;
    }

    /**
     *Captura el dato.
     * @param _apellidos
     */
    public void setApellidos(String _apellidos) {
        this.apellidos = _apellidos;
    }
    
    /**
     * Muestra del dato.
     * @return numero documento de identificacion
     */
    public String getDocumento() {
        return this.Documento;
    }

    
   /**
    * Captura el dato
    * @param _documento 
    */
   
    public void setDocumento(String _documento) {
        this.Documento = _documento;
    }
    /**
     * Muestra del dato.
     * @return edad
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Captura el dato.
     * @param _edad
     */
    public void setEdad(int _edad) {
        this.edad = _edad;
    }

    /**
     * Muestra del dato.
     * @return telefono
     */
    public long getTelefono() {
        return this.telefono;
    }

    /**
     * Captura el dato.
     * @param _telefono
     */
    public void setTelefono(long _telefono) {
        this.telefono = _telefono;
    }

    /**
     * Muestra del dato.
     * @return direccion
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * Captura el dato.
     * @param _direccion
     */
    public void setDireccion(String _direccion) {
        this.direccion = _direccion;
    }

    /**
     * Muestra del dato.
     * @return ciudad de nacimiento
     */
    public String getCiudadNacimiento() {
        return this.ciudadNacimiento;
    }

    /**
     *Captura el dato.
     * @param _ciudadNacimiento
     */
    public void setCiudadNacimiento(String _ciudadNacimiento) {
        this.ciudadNacimiento = _ciudadNacimiento;
    }

    /**
     * Muestra del dato.
     * @return numero de votos realizados por el medio de television
     */
    public int getNumeroVotosTelevision() {
        return numeroVotosTelevision;
    }

    /**
     * Muestra del dato.
     * @return numero de votos realizados por el medio de radio
     */
    public int getNumeroVotosRadio() {
        return numeroVotosRadio;
    }

    /**
     * Muestra del dato.
     * @return numero de votos realizados por el medio de internet
     */
    public int getNumeroVotosInternet() {
        return numeroVotosInternet;
    }

    /**
     * Captura el dato.
     * @param numeroVotosTelevision 
     */
    public void setNumeroVotosTelevision(int numeroVotosTelevision) {
        this.numeroVotosTelevision = numeroVotosTelevision;
    }

    /**
     * Captura el dato.
     * @param numeroVotosRadio 
     */
    public void setNumeroVotosRadio(int numeroVotosRadio) {
        this.numeroVotosRadio = numeroVotosRadio;
    }

    /**
     * Captura el dato.
     * @param numeroVotosInternet 
     */
    public void setNumeroVotosInternet(int numeroVotosInternet) {
        this.numeroVotosInternet = numeroVotosInternet;
    }

    /**
     * Muestra del dato.
     * @return total de votos del candidato
     */
    public int getTotalVotos() {
        return totalVotos;
    }

    /**
     * Captura el dato.
     * @param totalVotos 
     */
    public void setTotalVotos(int totalVotos) {
        this.totalVotos = totalVotos;
    }

    /**
     * Muestra del dato.
     * @return total gasto del candidato en la campaña
     */
    public int getGastoCandidato() {
        return gastoCandidato;
    }

    /**
     * Captura el dato.
     * @param gastoCandidato 
     */
    public void setGastoCandidato(int gastoCandidato) {
        this.gastoCandidato = gastoCandidato;
    }
    
}
