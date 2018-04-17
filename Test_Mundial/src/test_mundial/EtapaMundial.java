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

    ArrayList<Partido> Partidos;

    //se inicializa la lista partidos junto con el constructor 
    public EtapaMundial() {

        Partidos = new ArrayList<>();
    }

    //aca le va a llegar y va a devolver la descripcion de la etapa
    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    //se agregan los partidos a la lista partidos
    public void addPartido(Partido partido) {

        Partidos.add(partido);

    }

    //devuelve la lista de partidos
    protected ArrayList<Partido> getPartidos() {

        return this.Partidos;

    }

    //metodo abstracto 
    public abstract ArrayList<Equipo> getEquiposQueAvanzan();

}
