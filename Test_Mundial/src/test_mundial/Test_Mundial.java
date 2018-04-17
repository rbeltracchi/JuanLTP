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

        Equipo arg = new Equipo();
        Equipo peru = new Equipo();
        Date fecha = null;

        Partido par = new Partido(fecha, arg, peru);

        arg.setPartidosJugados(par);
        peru.setPartidosJugados(par);

        System.out.println(arg.getPartidosJugados());
    }

}
