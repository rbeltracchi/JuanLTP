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
public class Resultado {

    private int golesLocal, golesVisitante, puntos = 0;

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
            puntos += 3;
            return true;

        } else {
            return false;
        }

    }

    public boolean Empate() {

        if (golesLocal == golesVisitante) {
            puntos++;
            return true;
        }
        return false;
    }

    public int getPuntos() {
       
        if (this.GanoLocal())
            
            return puntos;
        }
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

}
