/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.math.BigDecimal;
import java.util.Scanner;
import partidos.Candidato;
import partidos.Partido;
/**
 *
 * @author Ronald
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Candidato candidato1 = new Candidato("Polo",3);
        Candidato candidato2 = new Candidato("Pol",4);
        
        candidato1.calculoVotos();
        candidato2.calculoVotos();
        
        Scanner lecturaVar = new Scanner(System.in);/*funcion para escanear el dato del usuario*/
        byte opcionMenu;/*variable para la opcion del menu*/
        do{/*repeticion del menu */
        System.out.println(".............................................");    
        System.out.println("         ELECCIONES AL CONGRESO.             ");
        System.out.println(".............................................");
        System.out.println("1.Visualizacion de los candidatos.");
        System.out.println("2.Votar por un candidato.");
        System.out.println("3.Calculo total de votos.");
        System.out.println("4.Calculo costo promedio de votos por partido.");
        System.out.println("5.Finalizar.");
        System.out.println("..............................................");
        System.out.println("Digite el numero de la opcion que desea: ");
        
        opcionMenu = lecturaVar.nextByte();/**escaneo del dato del menu del usuario*/
        switch(opcionMenu){
            
            case 1:
               
                candidato1.visualizarCandidato();
                
                break;
            
            case 2:
                
                
               
               break;
               
            case 3:
                
               
               break;
               
            case 4:
              
               break;
           
               
            case 5:
                /*salida del menu.*/
                System.out.println("Ha salido del aplicativo....");
                break;
            default:/**
                    *opcion no valida del menu.
                    * 
                    * */
                System.out.println("Opcion no valida en el menu.");
                break;
        }
        
        }while(opcionMenu!=5);/*condicion salida del menu.*/
        
        
        
        
        
        
        
        
        
        
}
}
