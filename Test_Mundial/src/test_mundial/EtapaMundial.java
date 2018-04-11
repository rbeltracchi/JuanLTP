/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_mundial;

import java.util.ArrayList;

/**
 *
 * @author juanI
 */
public abstract class EtapaMundial {

    private String descripcionEtapa;

    ArrayList<Partido> Partidos = new ArrayList<>();

    public EtapaMundial(Equipo local, Equipo visitante) {

       
        
        
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    
    public void addPartido (Partido partido){
        
        Partidos.add(partido);
        
    }
    
    protected String getPartidos (){
        
       
        
    }
    
    public abstract getEquiposQueAvanzan(){
        
    }
    
    
}
