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

    ArrayList<Partido> PartidosJugados = new ArrayList<>();

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

    public int diferenciaDeGoles() {

        /*En este metodo se van a estar buscando los goles que convirtio y recibio cada equipo
          con el fin de dar una diferencia de goles
          Se recorrera la lista de los partidos jugados buscando en cuales jugo, se comparara si jugo como visitante o local
          y asi obtener los goles convertidos o recibidos en cada fecha para luego devolver una diferencia de goles. */
        int dif = 0;

        for (Partido P : PartidosJugados) {

            if (P.getVisitante().getNombre().equals(this.nombre)) {

                golesHechos += P.getResultado().getGolesLocal();
                golesRecibidos += P.getResultado().getGolesVisitante();

                if (P.getVisitante().getNombre().equals(this.nombre)) {

                    golesHechos += P.getResultado().getGolesVisitante();
                    golesRecibidos += P.getResultado().getGolesLocal();

                    if (golesHechos > golesRecibidos) {

                        dif = golesHechos - golesRecibidos;

                    } else if (golesRecibidos > golesHechos) {

                        dif = golesRecibidos - golesHechos;

                    } else if (golesHechos == golesRecibidos) {

                        dif = 0;
                    }

                }
            }
        }

        return dif;
    }

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
