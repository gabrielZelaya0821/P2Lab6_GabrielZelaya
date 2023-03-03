package lanzamientos;

import java.util.Date;

/**
 *
 * @author gabri
 */
public class Lanzamiento {
    private String title;
    private Date fecha;
    private int likes = 0;

    public Lanzamiento() {
    }

    public Lanzamiento(String title, Date fecha) {
        this.title = title;
        this.fecha = fecha;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return title + "|" + fecha.toString();
    }
    
}
