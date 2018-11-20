package model;
import java.util.*;

public class Episodi {
    String title,  duration,  idioma,  description,  data;

    public Episodi(String title, String duration, String idioma, String description, String data){
        this.title = title;
        this.duration = duration;
        this.idioma = idioma;
        this.description = description;
        this.data = data;
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
}
