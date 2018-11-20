package model;

import java.util.ArrayList;

public class Serie {
    String title, descripcio;
    ArrayList<Temporada> temporades;
    public Serie(String title, String descricpio){
        this.title = title;
        this.descripcio = descripcio;
        temporades = new ArrayList<>();
    }

    public void addTemporada(Temporada te){
        temporades.add(te);
    }

    public Temporada getTemporada(int i){
        return (temporades.get(i));
    }

}
