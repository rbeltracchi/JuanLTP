/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_mundial;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanI
 */
public class Grupo extends EtapaMundial {
    
        
    ArrayList<Equipo> Equipos = new ArrayList<>();
   

    
    private int getPuntos(Equipo e) {

        int puntos = 0;

        for (Partido partidos : e.getPartidosJugados()) {

            if (partidos.getResultado().GanoLocal() && e.getNombre().equals(partidos.getLocal()));
            {
                puntos += 3;
            }
            if (!partidos.getResultado().Empate() && !partidos.getResultado().GanoLocal() && e.getNombre().equals(partidos.getVisitante()));
            {
                puntos += 3;
            }
            if (partidos.getResultado().Empate()) {
                
                puntos += 1;
            }

        }

        return puntos;
    }
    
    
    
    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan(){
        
        //Comparar puntos aca
        Equipo ganador = new Equipo ();
        
        for (Partido Partido1 : super.getPartidos()) {
            
           if (getPuntos(Partido1.getLocal()) > getPuntos(ganador));
           ganador = Partido1.getLocal();
            
            
        }
   
   
        
            
        }

    
        
        
    }


