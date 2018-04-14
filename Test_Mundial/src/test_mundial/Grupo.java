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
public class Grupo extends EtapaMundial {

    private Equipo eq1, eq3, eq4;
    private Equipo eq2;

    public Grupo(Equipo local, Equipo visitante) {
        super(local, visitante);
    }


    @Override
    public void getEquiposQueAvanzan(ArrayList<Equipo> Equipos) {

    }

}
