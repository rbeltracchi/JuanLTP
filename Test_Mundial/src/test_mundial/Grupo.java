package test_mundial;

import java.util.ArrayList;
import java.util.List;

/**
 * en esta clase definir que equipos pasan a la siguiente ronda
 *
 * @author juanI
 */
public class Grupo extends EtapaMundial {

    //arreglo de equipos
    ArrayList<Equipo> Equipos = new ArrayList<>();

    //dar puntaje a cada equipo segun sus victorias/empate
    private int getPuntos(Equipo e) {

        int puntos = 0;

        for (Partido partidos : e.getPartidosJugados()) {

            if (partidos.getResultado().GanoLocal() && e.getNombre().equals(partidos.getLocal()));
            {
                puntos += 3;
            }
            if (!partidos.getResultado().Empate() && !partidos.getResultado().GanoLocal() && e.getNombre().equals(partidos.getVisitante()));
            {
                puntos += 3;
            }
            if (partidos.getResultado().Empate()) {

                puntos += 1;
            }

        }

        return puntos;
    }

    //metodo abstracto de la clase padre- devuelve los equipo que avanzan
    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {

        //Comparar puntos aca
        Equipo ganador = new Equipo();

        for (Partido Partido1 : super.getPartidos()) {

            if (getPuntos(Partido1.getLocal()) > getPuntos(ganador));
            ganador = Partido1.getLocal();
            ganador.

        }

    }

}
