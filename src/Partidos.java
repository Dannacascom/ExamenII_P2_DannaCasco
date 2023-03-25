
import java.util.ArrayList;


public class Partidos {
    private ArrayList<Equipos> equipos = new ArrayList();
    private ArrayList<Integer> puntajes = new ArrayList();

    public Partidos() {
    }

    @Override
    public String toString() {
        return equipos +"\n"+ puntajes ;
    }
    
    
}
