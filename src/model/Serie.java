package model;

import java.util.ArrayList;

public class Serie {
    private String id, title, descripcio;
    private ArrayList<Temporada> temporades;

    public Serie(String id, String title, String descricpio){
        this.id = id;
        this.title = title;
        this.descripcio = descripcio;
        temporades = new ArrayList<>();
    }

    public void addTemporada(String numTemporada, String numEpisodis){
        Temporada te = new Temporada(numTemporada, numEpisodis);
        temporades.add(te);
    }

    public Temporada getTemporada(int i){
        return (temporades.get(i));
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public void addEp(String title, String duration, String idioma, String description, String data, String numTemporada) {
        int tempN = Integer.parseInt(numTemporada)-1;
        Temporada te = temporades.get(tempN);
        te.addEpisodi(title, duration, idioma, description, data);
    }

    public int subscriureEpisodi(Usuari us, int ep, int temp){
        return temporades.get(temp-1).subscriureEpisodi(us,ep);
    }
}