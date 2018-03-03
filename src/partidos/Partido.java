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
public class Partido {
    private String nombrePartido;
    private int gastoCampaña;
    private int totalVotos;
    static int polo=3_000_000;
    static int liberal=2_000_000;
    static int verde=1_000_000;
    static int mira=500_000;
    public Partido(String _nombrePartido , int _totalVotos){
        this.nombrePartido=_nombrePartido;
        
        this.totalVotos=_totalVotos;
    }
    
    /**
     * Introduce el nombre del partido.
     * @param _nombrePartido 
     */
    public void setNombrePartido(String _nombrePartido){
        this.nombrePartido=_nombrePartido;
    }
    /**
     * Retorna el nombre del partido.
     * @return nombrePartido 
     */
    public String getNombrePartido(){
        return this.nombrePartido;
    }
    /**
     * Introduce el gasto total de la campaña.
     * @param _gastoCampaña 
     */
    public void setGastoCampaña(int _gastoCampaña){
        this.gastoCampaña=_gastoCampaña;
    }
    /**
     * Retorna el gasto de la campaña.
     * @return gastoCampaña
     */
    public int getGastoCampaña(){
        return this.gastoCampaña;
    }
    /**
     * Introduce el total de votos del partido.
     * @param _totalVotos 
     */
    public void setTotalVotos(int _totalVotos ){
        this.totalVotos=_totalVotos;
    }
    /**
     * Retorna el total de Votos de la campaña.
     * @return  totalVotos
     */
    public int getTotalVotos(){
        return this.totalVotos;
    }
}
