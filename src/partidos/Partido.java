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
    static int gastoPartidoPolo=3_000_000;
    static int gastoPartidoLiberal=2_000_000;
    static int gastoPartidoVerde=1_000_000;
    static int gastoPartidoMira=500_000;
    static int totalVotosPolo=0;
    static int totalVotosLiberal=0;
    static int totalVotosVerde=0;
    static int totalVotosMira=0;
    
    public Partido(String _nombrePartido){
        this.nombrePartido=_nombrePartido;
        
    }
    public void visualizacionGastoPartido(){
        System.out.println("El gasto por el partido Polo es de: $"+gastoPartidoPolo);
        System.out.println("El gasto por el partido Liberal es de: $"+gastoPartidoLiberal);
        System.out.println("El gasto por el partido Verde es de: $"+gastoPartidoVerde);
        System.out.println("El gasto por el partido Mira es de: $"+gastoPartidoMira);
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
     * Introduce el total de votos del partido.
     * @param _totalVotos 
     */
   
}
