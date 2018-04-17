/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_mundial;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Esta clase define el nombre del equipo y cuantos partidos jugo
 *
 * @author juanI
 */
public class Equipo {

    private String nombre;
    private int golesRecibidos, golesHechos;

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getGolesHechos() {
        return golesHechos;
    }

    public void setGolesHechos(int golesHechos) {
        this.golesHechos = golesHechos;
    }
    
    public int diferenciaDeGoles (){
        
        return golesHechos - golesRecibidos;
        
    }
    

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

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    
}
