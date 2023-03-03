package modelos;

import java.util.ArrayList;
import lanzamientos.Album;
import lanzamientos.Cancion;

/**
 *
 * @author gabri
 */
public class Artista extends Usuario{
    private String nombre;
    private ArrayList<Cancion> canciones;
    private ArrayList<Album> albumes = new ArrayList<>();

    public Artista() {
        super();
    }

    public Artista(String nombre, String user, String password, int age) {
        super(user, password, age);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return super.toString()+"|"+nombre;
    }
    
    
}
