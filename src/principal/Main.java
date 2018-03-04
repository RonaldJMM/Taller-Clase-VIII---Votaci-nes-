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
 * @author Ronald Jefrey Moreno Mora
 * @author Luis Miguel Morales Sandoval
 * Programacion II
 * SIS 301
 * Universidad de Cundinamarca - Facatativa
 */
public class Main {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Candidato candidato1 = new Candidato("Polo","Camilo", "Enriquez Pedraza","10742347568", 39, 320894567, "Cra 7 No.23-29", "Funza", 0, 0, 0, 0, 0);
        Candidato candidato2 = new Candidato("Polo","Juan", "Rodriguez Valencia","10746757568", 45, 320894567, "Cra 5 No.45-22", "Bogota", 0, 0, 0, 0, 0);
        Candidato candidato3 = new Candidato("Polo","Alvaro", "Martinez Niño","10742347345", 29, 320894567, "Cra 7 No.33-21", "Facatativa", 0, 0, 0, 0, 0);
        Candidato candidato4 = new Candidato("Liberal","Thomas", "Enriquez Nuñez","14562347568", 50, 320894567, "Cra 23 No.34-43", "Mosquera", 0, 0, 0, 0, 0);
        Candidato candidato5 = new Candidato("Liberal","Ana", "Lopez Pedraza","10742355568", 32, 320894567, "Cra 7 No.24-34", "Fusagasuga", 0, 0, 0, 0, 0);
        Candidato candidato6 = new Candidato("Verde","Alexander", "Aguirre Mora","10767447568", 37, 320894567, "Cra 4 No.23-22", "Facatativa", 0, 0, 0, 0, 0);
        Candidato candidato7 = new Candidato("Verde","Liliana", "Betancour Pedraza","10734647568", 40, 320894567, "Cra 7 No.12-23", "Mosquera", 0, 0, 0, 0, 0);
        Candidato candidato8 = new Candidato("Mira","Camilo", "Cifuentes Chacon","107423937468", 41, 320894567, "Cra 2 No.13-45", "La Mesa", 0, 0, 0, 0, 0);
        Candidato candidato9 = new Candidato("Mira","Carlos", "Morales Sulega","10743457568", 49, 320894567, "Cra 13 No.56-13", "Subachoque", 0, 0, 0, 0, 0);
        
        Scanner lecturaVar = new Scanner(System.in);/*funcion para escanear el dato del usuario*/
        byte opcionMenu;/*variable para la opcion del menu*/
        do{/*repeticion del menu */
        System.out.println(".............................................");    
        System.out.println("         ELECCIONES AL CONGRESO.             ");
        System.out.println(".............................................");
        System.out.println("1.Visualizacion de los candidatos.");
        System.out.println("2.Votar por un candidato.");
        System.out.println("3.Calculo total de votos.");
        System.out.println("4.Calculo costo promedio por partido.");
        System.out.println("5.Finalizar.");
        System.out.println("..............................................");
        System.out.println("Digite el numero de la opcion que desea: ");
        
        opcionMenu = lecturaVar.nextByte();/**escaneo del dato del menu del usuario*/
        switch(opcionMenu){
            
            case 1:
               
                do{/*repeticion del menu */
                    System.out.println(".............................................");    
                    System.out.println("         INFORMACION DEL CONGRESO CANDIDATOS.       ");
                    System.out.println("    ...Elija el candidato de su preferencia...");
                    System.out.println(".............................................");
                    System.out.println("1.Candidato : "+candidato1.getNombres()+" "+candidato1.getApellidos()+" - Partido:"+candidato1.getNombrePartido());
                    System.out.println("2.Candidato : "+candidato2.getNombres()+" "+candidato2.getApellidos()+" - Partido:"+candidato2.getNombrePartido());
                    System.out.println("3.Candidato : "+candidato3.getNombres()+" "+candidato3.getApellidos()+" - Partido:"+candidato3.getNombrePartido());
                    System.out.println("4.Candidato : "+candidato4.getNombres()+" "+candidato4.getApellidos()+" - Partido:"+candidato4.getNombrePartido());
                    System.out.println("5.Candidato : "+candidato5.getNombres()+" "+candidato5.getApellidos()+" - Partido:"+candidato5.getNombrePartido());
                    System.out.println("6.Candidato : "+candidato6.getNombres()+" "+candidato6.getApellidos()+" - Partido:"+candidato6.getNombrePartido());
                    System.out.println("7.Candidato : "+candidato7.getNombres()+" "+candidato7.getApellidos()+" - Partido:"+candidato7.getNombrePartido());
                    System.out.println("8.Candidato : "+candidato8.getNombres()+" "+candidato8.getApellidos()+" - Partido:"+candidato8.getNombrePartido());
                    System.out.println("9.Candidato : "+candidato9.getNombres()+" "+candidato9.getApellidos()+" - Partido:"+candidato9.getNombrePartido());
                    
                    System.out.println("..............................................");
                    System.out.println("Digite el numero de la opcion que desea: ");

                    opcionMenu = lecturaVar.nextByte();/**escaneo del dato del menu del usuario*/
                    switch(opcionMenu){

                    case 1:
                        candidato1.visualizarCandidato();
                        break;

                    case 2:
                        candidato2.visualizarCandidato();
                        break;

                     case 3:
                         candidato3.visualizarCandidato();
                        break;

                     case 4:
                         candidato4.visualizarCandidato();
                        break;


                      case 5:
                          candidato5.visualizarCandidato();
                        break;


                       case 6:
                           candidato6.visualizarCandidato();

                        break;

                     case 7:
                         candidato7.visualizarCandidato();

                        break;

                     case 8:
                         candidato8.visualizarCandidato();
                        break;



                      case 9:
                          candidato9.visualizarCandidato();
                        break;
                          
                                default:/**
                                          *opcion no valida del menu.
                                           * 
                                           * */
                       System.out.println("Opcion no valida en el menu.");
                       break;
                          }

                   }while(opcionMenu!=1 && opcionMenu!=2 && opcionMenu!=3 &&opcionMenu!=4 && opcionMenu!=5 && opcionMenu!=6&&opcionMenu!=7 && opcionMenu!=8 && opcionMenu!=9);/*condicion salida del menu.*/

                
                break;
            
            case 2:
                   
                    do{/*repeticion del menu */
                    System.out.println(".............................................");    
                    System.out.println("         VOTACION AL CONGRESO CANDIDATOS.       ");
                    System.out.println("    ...Elija el candidato de su preferencia...");
                    System.out.println(".............................................");
                    System.out.println("1.Candidato : "+candidato1.getNombres()+" "+candidato1.getApellidos()+" - Partido:"+candidato1.getNombrePartido());
                    System.out.println("2.Candidato : "+candidato2.getNombres()+" "+candidato2.getApellidos()+" - Partido:"+candidato2.getNombrePartido());
                    System.out.println("3.Candidato : "+candidato3.getNombres()+" "+candidato3.getApellidos()+" - Partido:"+candidato3.getNombrePartido());
                    System.out.println("4.Candidato : "+candidato4.getNombres()+" "+candidato4.getApellidos()+" - Partido:"+candidato4.getNombrePartido());
                    System.out.println("5.Candidato : "+candidato5.getNombres()+" "+candidato5.getApellidos()+" - Partido:"+candidato5.getNombrePartido());
                    System.out.println("6.Candidato : "+candidato6.getNombres()+" "+candidato6.getApellidos()+" - Partido:"+candidato6.getNombrePartido());
                    System.out.println("7.Candidato : "+candidato7.getNombres()+" "+candidato7.getApellidos()+" - Partido:"+candidato7.getNombrePartido());
                    System.out.println("8.Candidato : "+candidato8.getNombres()+" "+candidato8.getApellidos()+" - Partido:"+candidato8.getNombrePartido());
                    System.out.println("9.Candidato : "+candidato9.getNombres()+" "+candidato9.getApellidos()+" - Partido:"+candidato9.getNombrePartido());
                    System.out.println("10.Voto en blanco");
                    System.out.println("..............................................");
                    System.out.println("Digite el numero de la opcion que desea: ");

                    opcionMenu = lecturaVar.nextByte();/**escaneo del dato del menu del usuario*/
                    switch(opcionMenu){

                    case 1:
                        candidato1.votarCandidato();
                        break;

                    case 2:
                        candidato2.votarCandidato();
                        break;

                     case 3:
                         candidato3.votarCandidato();
                        break;

                     case 4:
                         candidato4.votarCandidato();
                        break;


                      case 5:
                          candidato5.votarCandidato();
                        break;


                       case 6:
                           candidato6.votarCandidato();

                        break;

                     case 7:
                         candidato7.votarCandidato();

                        break;

                     case 8:
                         candidato8.votarCandidato();
                        break;



                      case 9:
                          candidato9.votarCandidato();
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
                
               break;
               
            case 3:
               
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
                           candidato1.visualizacionVotosCandidato();
                           candidato2.visualizacionVotosCandidato();
                           candidato3.visualizacionVotosCandidato();
                           candidato4.visualizacionVotosCandidato();
                           candidato5.visualizacionVotosCandidato();
                           candidato6.visualizacionVotosCandidato();
                           candidato7.visualizacionVotosCandidato();
                           candidato8.visualizacionVotosCandidato();
                           candidato9.visualizacionVotosCandidato();

                           break;

                       case 2:
                           candidato1.visualizacionVotosPartido();
                           
                          break;



                       default:/**
                               *opcion no valida del menu.
                               * 
                               * */
                           System.out.println("Opcion no valida en el menu.");
                           break;
                   }

                   }while(opcionMenu!=1 && opcionMenu!=2 );
               
               break;
               
            case 4:
                do{/*repeticion del menu */
                    System.out.println("......................"); 
                   System.out.println("RESULTADOS DE GASTOS");
                    System.out.println("......................");
                   System.out.println("1.Gastos por Candidato.");
                   System.out.println("2.Gastos por partido ");
                    System.out.println(".....................");
                    System.out.println("Digite la opcion correspondiente :");

                   opcionMenu = lecturaVar.nextByte();/**escaneo del dato del menu del usuario*/
                   switch(opcionMenu){

                       case 1:
                           candidato1.visualizacionGastoCandidato();
                           candidato2.visualizacionGastoCandidato();
                           candidato3.visualizacionGastoCandidato();
                           candidato4.visualizacionGastoCandidato();
                           candidato5.visualizacionGastoCandidato();
                           candidato6.visualizacionGastoCandidato();
                           candidato7.visualizacionGastoCandidato();
                           candidato8.visualizacionGastoCandidato();
                           candidato9.visualizacionGastoCandidato();

                           break;

                       case 2:
                           candidato1.visualizacionGastoPartido();
                           
                          break;



                       default:/**
                               *opcion no valida del menu.
                               * 
                               * */
                           System.out.println("Opcion no valida en el menu.");
                           break;
                   }

                   }while(opcionMenu!=1 && opcionMenu!=2 );
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