/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.math.BigDecimal;
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
}
}
