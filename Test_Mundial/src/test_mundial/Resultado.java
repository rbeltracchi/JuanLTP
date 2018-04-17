package test_mundial;

import java.util.Date;

/**
 * En esta clase se van a definir los resultados de cada partido
 *
 * @author juanI
 */
public class Resultado {

    private int golesLocal, golesVisitante;

    public Resultado(int golesLocal, int golesVisitante) {

        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
    public Resultado(){
        this.golesLocal = 0;
        this.golesVisitante = 0;
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
