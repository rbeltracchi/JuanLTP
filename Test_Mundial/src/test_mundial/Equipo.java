/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_mundial;

import java.util.ArrayList;

/**
 * Esta clase define el nombre del equipo y cuantos partidos jugo
 *
 * @author juanI
 */
public class Equipo {

    private String nombre;

    ArrayList<Partido> PartidosJugados = new ArrayList<>();

    public ArrayList<Partido> getPartidosJugados() {
        return PartidosJugados;
    }

    public void setPartidosJugados(ArrayList<Partido> PartidosJugados) {
        this.PartidosJugados = PartidosJugados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Se cargan los partidos que jugo el equipo
    public void setPartidosJugados(Partido p) {

        PartidosJugados.add(p);

    }

}
