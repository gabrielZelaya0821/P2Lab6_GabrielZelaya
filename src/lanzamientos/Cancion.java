package lanzamientos;

import java.util.Date;

/**
 *
 * @author gabri
 */
public class Cancion extends Lanzamiento{
    
    private Album album;
    private Date duracion;

    public Cancion() {
        super();
    }

    public Cancion(String title, Date fecha,Album album,Date duracion) {
        super(title, fecha);
        this.album = album;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
