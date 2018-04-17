package test_mundial;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * En esta clase se van a definir los partidos, que equipos jugaron en que fecha
 * y quien gano
 *
 * @author juanI
 */
public class Partido {

    private Date fecha;
    private Equipo local, visitante;
    private Resultado resultado = new Resultado();

    public Partido(Date fecha, Equipo local, Equipo visitante) {

        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Resultado getResultado() {

        
        
        return resultado;
    }

    public void setResultado(Resultado resultado) {

        this.resultado = resultado;

    }

}
