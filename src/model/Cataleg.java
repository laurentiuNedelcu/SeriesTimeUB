package model;


import java.util.ArrayList;
import java.util.Iterator;

public class Cataleg {
    ArrayList<Serie> series;
    public Cataleg(){
        series = new ArrayList<>();
    }

    public void addSerie(String id, String title, String descripcio){
        Serie se = new Serie(id, title, descripcio);
        series.add(se);
    }

    public void addTemp(String idSerie, String numTemporada, String numEpisodis){
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.getId().equals(idSerie)){
                se.addTemporada(numTemporada, numEpisodis);
            };
        }
    }

    public void addEp(String title, String duration, String idioma, String description, String data, String idSerie, String numTemporada) {
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.getId().equals(idSerie)){
                se.addEp(title, duration, idioma, description, data, numTemporada);
            };
        }
    }

    public String getCataleg(){
        String s = "";
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            s += se.getTitle();
            s += " ";
        }
        return s;
    }
}
