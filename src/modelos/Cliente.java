package modelos;

import java.util.ArrayList;
import lanzamientos.Cancion;

/**
 *
 * @author gabri
 */
public class Cliente extends Usuario{
    private ArrayList<Cancion> playlist;
    private ArrayList<Cancion> likedSongs;

    public Cliente() {
        super();
    }

    public Cliente(String user, String password, int age) {
        super(user, password, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
