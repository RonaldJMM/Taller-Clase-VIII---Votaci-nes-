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
               
                
                
                break;
            
            case 2:
                menuCandidatos(); 
                
               break;
               
            case 3:
               
                menuVotos();
               
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
    public static void menuCandidatos(){
        /*--------------------------------------------------------------------------*/
            Scanner lecturaVar = new Scanner(System.in);/*funcion para escanear el dato del usuario*/
            byte opcionMenu;/*variable para la opcion del menu*/
            do{/*repeticion del menu */
            System.out.println(".............................................");    
            System.out.println("         VOTACION AL CONGRESO CANDIDATOS.       ");
            System.out.println("    ...Elija el candidato de su preferencia...");
            System.out.println(".............................................");
            System.out.println("1.Candidato : "+"Partido:");
            System.out.println("2.Candidato : "+"Partido:");
            System.out.println("3.Candidato : "+"Partido:");
            System.out.println("4.Candidato : "+"Partido:");
            System.out.println("5.Candidato : "+"Partido:");
            System.out.println("6.Candidato : "+"Partido:");
            System.out.println("7.Candidato : "+"Partido:");
            System.out.println("8.Candidato : "+"Partido:");
            System.out.println("9.Candidato : "+"Partido:");
            System.out.println("10.Voto en blanco");
            System.out.println("..............................................");
            System.out.println("Digite el numero de la opcion que desea: ");

            opcionMenu = lecturaVar.nextByte();/**escaneo del dato del menu del usuario*/
            switch(opcionMenu){

            case 1:



                break;

            case 2:


                break;

             case 3:


                break;

             case 4:

                break;


              case 5:

                break;


               case 6:


                break;

             case 7:


                break;

             case 8:

                break;



              case 9:

                break; 

              case 10:

                  break;
                        default:/**
                                  *opcion no valida del menu.
                                   * 
                                   * */
               System.out.println("Opcion no valida en el menu.");
               break;
                  }

           }while(opcionMenu!=1 && opcionMenu!=2 && opcionMenu!=3 &&opcionMenu!=4 && opcionMenu!=5 && opcionMenu!=6&&opcionMenu!=7 && opcionMenu!=8 && opcionMenu!=9&&opcionMenu!=10);/*condicion salida del menu.*/


/*--------------------------------------------------------------------------*/
    }
    
    public static void menuVotos(){
         Scanner lecturaVar = new Scanner(System.in);/*funcion para escanear el dato del usuario*/
            byte opcionMenu;
        
         do{/*repeticion del menu */
             System.out.println("......................"); 
            System.out.println("RESULTADOS DE VOTACION");
             System.out.println("......................");
            System.out.println("1.Votos por Candidato.");
            System.out.println("2.Votos por partido ");
             System.out.println(".....................");
             System.out.println("Digite la opcion correspondiente :");

            opcionMenu = lecturaVar.nextByte();/**escaneo del dato del menu del usuario*/
            switch(opcionMenu){

                case 1:
                   
                    
                    break;

                case 2:
                   
                    
                   break;

                
                   
                default:/**
                        *opcion no valida del menu.
                        * 
                        * */
                    System.out.println("Opcion no valida en el menu.");
                    break;
            }

            }while(opcionMenu!=1 && opcionMenu!=2 );


        
}
    
    
    
    
    
    
    
    
    
    
}


