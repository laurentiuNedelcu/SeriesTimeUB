package model;
import java.util.*;

public class Episodi {
    String title,  duration,  idioma,  description,  data;
    SubscriureEpisodi vist;

    public Episodi(String title, String duration, String idioma, String description, String data){
        this.title = title;
        this.duration = duration;
        this.idioma = idioma;
        this.description = description;
        this.data = data;
        vist = new SubscriureEpisodi();
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

    public String getData(String data) {
        return data;
    }

    public int subscriureUsuari(Usuari us){
        return vist.subscriureUsuari(us);
    }
}
