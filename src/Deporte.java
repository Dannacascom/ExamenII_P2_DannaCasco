
import java.util.ArrayList;


public class Deporte {
    private ArrayList<Torneo> torneos = new ArrayList();
    private String nombre;
    
    public Deporte() {
    }

    public Deporte(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

   

    @Override
    public String toString() {
        return  torneos + nombre;
    }

  
    
    
}
