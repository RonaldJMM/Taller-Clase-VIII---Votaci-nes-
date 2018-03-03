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
public class Partido {
    private String nombrePartido;
    private int gastoCampaña;
    private int totalVotos;
    
    Partido(String _nombrePartido, int _gastoCampaña, int _totalVotos){
        this.nombrePartido=_nombrePartido;
        this.gastoCampaña=_gastoCampaña;
        this.totalVotos=_totalVotos;
    }
    
    public void setNombrePartido(String _nombrePartido){
        this.nombrePartido=_nombrePartido;
    }
    
    public String getNombrePartido(){
        return this.nombrePartido;
    }
    
    public void setGastoCampaña(int _gastoCampaña){
        this.gastoCampaña=_gastoCampaña;
    }
    
    public int getGastoCampaña(){
        return this.gastoCampaña;
    }
    
    public void setTotalVotos(int _totalVotos ){
        this.totalVotos=_totalVotos;
    }
    
    public int getTotalVotos(){
        return this.totalVotos;
    }
}
