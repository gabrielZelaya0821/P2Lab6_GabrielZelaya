package lanzamientos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gabri
 */
public class Album extends Lanzamiento{
    private ArrayList<Cancion> canciones;
    private int cantidad = canciones.size();

    public Album() {
        super();
    }

    public Album(ArrayList<Cancion> canciones, String title, Date fecha) {
        super(title, fecha);
        this.canciones = canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return super.toString()+"|"+canciones;
    }
    
}
