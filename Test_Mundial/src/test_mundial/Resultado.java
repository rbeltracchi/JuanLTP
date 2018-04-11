/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_mundial;

import java.util.Date;

/**
 *
 * @author juanI
 */
public class Resultado extends Partido {

    private int golesLocal, golesVisitante;

    
     Resultado(Date fecha, Equipo local, Equipo visitante) {
        super(fecha, local, visitante);
    }
    
    
    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

   

    public boolean GanoLocal() {

        if (golesLocal > golesVisitante) {
            return true;
        } else {
            return false;
        }

    }
    
    
    public boolean Empate() {

        if (golesLocal == golesVisitante) {
            
            return true;
        }
        return false;
    }
    

}
