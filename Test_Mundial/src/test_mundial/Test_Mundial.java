/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_mundial;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juanI
 */
public class Test_Mundial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //se crean los equipos
        Equipo e1 = new Equipo();
        Equipo e2 = new Equipo();
        Equipo e3 = new Equipo();
        Equipo e4 = new Equipo();

        //fecha??
        Date fecha = null;

        //creando partidos. se setean los equipos que van a ser local y visitante
        Partido p1 = new Partido(fecha, e1, e2);
        p1.setLocal(e1);
        p1.setVisitante(e2);
        Partido p2 = new Partido(fecha, e3, e4);
        p1.setLocal(e3);
        p1.setVisitante(e4);
        Partido p3 = new Partido(fecha, e1, e3);
        p1.setLocal(e1);
        p1.setVisitante(e3);
        Partido p4 = new Partido(fecha, e2, e4);
        p1.setLocal(e2);
        p1.setVisitante(e4);
        Partido p5 = new Partido(fecha, e1, e4);
        p1.setLocal(e1);
        p1.setVisitante(e4);
        Partido p6 = new Partido(fecha, e3, e2);
        p1.setLocal(e3);
        p1.setVisitante(e4);

        //Seteamos los partidos que jugo cada equipo
        e1.setPartidosJugados(p1);
        e1.setPartidosJugados(p3);
        e1.setPartidosJugados(p5);
        e2.setPartidosJugados(p6);
        e2.setPartidosJugados(p4);
        e2.setPartidosJugados(p1);
        e3.setPartidosJugados(p2);
        e3.setPartidosJugados(p3);
        e3.setPartidosJugados(p6);
        e4.setPartidosJugados(p2);
        e4.setPartidosJugados(p4);
        e4.setPartidosJugados(p5);

        //Se dan los goles por partido
        //goles del local
        p1.getResultado().setGolesLocal(4);
        p2.getResultado().setGolesLocal(5);
        p3.getResultado().setGolesLocal(2);
        p4.getResultado().setGolesLocal(1);
        p5.getResultado().setGolesLocal(0);
        p6.getResultado().setGolesLocal(3);
        //goles de visitante
        p1.getResultado().setGolesVisitante(4);
        p2.getResultado().setGolesVisitante(5);
        p3.getResultado().setGolesVisitante(3);
        p4.getResultado().setGolesVisitante(4);
        p5.getResultado().setGolesVisitante(6);
        p6.getResultado().setGolesVisitante(1);

    }

}
