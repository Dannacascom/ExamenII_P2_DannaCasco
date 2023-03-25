
import java.util.ArrayList;


public class Torneo {
    private String nombre;
    private ArrayList<Equipos> equipos = new ArrayList();
    private ArrayList<Partidos> partidos = new ArrayList();
    private String periodo;

    
    public Torneo() {
    }

    public Torneo(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipos> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partidos> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partidos> partidos) {
        this.partidos = partidos;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
   
    
}
