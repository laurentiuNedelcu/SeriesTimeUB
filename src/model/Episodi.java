package model;
import java.util.*;

public class Episodi {
    private String title,  duration,  idioma,  description,  data;
    private SubscriureEpisodi vist;
    private Valoracio valoracions;

    public Episodi(String title, String duration, String idioma, String description, String data){
        this.title = title;
        this.duration = duration;
        this.idioma = idioma;
        this.description = description;
        this.data = data;
        vist = new SubscriureEpisodi();
        valoracions = new Valoracio();
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getDescription() {
        return description;
    }

    public String getData() {
        return data;
    }

    public int subscriureUsuari(Usuari us){
        return vist.subscriureUsuari(us);
    }

    public String valorarEpisodi(Usuari us, int puntuacio, String data){
        return valoracions.valorarUnEpisodi(us,puntuacio,data);
    }

    public int visualitzarEpisodi(Usuari us){
        if (!vist.usuariJaSubscrit(us))
            return subscriureUsuari(us);
        return 0;
    }

    public boolean estaVisualitzat (Usuari us){
        return vist.usuariJaSubscrit(us);
    }
}
