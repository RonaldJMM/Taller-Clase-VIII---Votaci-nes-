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
    public void visualizacionVotosCandidato(){
        System.out.println("El total de votos del cantidato "+this.getNombres()+" "+this.getApellidos()+" del partido "+this.getNombrePartido()+" es: "+this.getTotalVotos());

    }
    public void visualizacionGastoCandidato(){
        System.out.println("El gasto por votaciones del candidato "+this.getNombres()+" "+this.getApellidos()+" del partido "+this.getNombrePartido()+" es de: $"+this.getGastoCandidato());
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
    
    public String getDocumento() {
        return this.Documento;
    }

    
   
   
    public void setDocumento(String _documento) {
        this.Documento = _documento;
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
     * @return the numeroVotosTelevision
     */
    public int getNumeroVotosTelevision() {
        return numeroVotosTelevision;
    }

    /**
     * @return the numeroVotosRadio
     */
    public int getNumeroVotosRadio() {
        return numeroVotosRadio;
    }

    /**
     * @return the numeroVotosInternet
     */
    public int getNumeroVotosInternet() {
        return numeroVotosInternet;
    }

    /**
     * @param numeroVotosTelevision the numeroVotosTelevision to set
     */
    public void setNumeroVotosTelevision(int numeroVotosTelevision) {
        this.numeroVotosTelevision = numeroVotosTelevision;
    }

    /**
     * @param numeroVotosRadio the numeroVotosRadio to set
     */
    public void setNumeroVotosRadio(int numeroVotosRadio) {
        this.numeroVotosRadio = numeroVotosRadio;
    }

    /**
     * @param numeroVotosInternet the numeroVotosInternet to set
     */
    public void setNumeroVotosInternet(int numeroVotosInternet) {
        this.numeroVotosInternet = numeroVotosInternet;
    }

    /**
     * @return the totalVotos
     */
    public int getTotalVotos() {
        return totalVotos;
    }

    /**
     * @param totalVotos the totalVotos to set
     */
    public void setTotalVotos(int totalVotos) {
        this.totalVotos = totalVotos;
    }

    /**
     * @return the gastoCandidato
     */
    public int getGastoCandidato() {
        return gastoCandidato;
    }

    /**
     * @param gastoCandidato the gastoCandidato to set
     */
    public void setGastoCandidato(int gastoCandidato) {
        this.gastoCandidato = gastoCandidato;
    }

    

    /**
     * @return the nombres
     */
    
    
    
    
    
}
