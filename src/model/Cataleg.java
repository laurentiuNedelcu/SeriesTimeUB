package model;


import java.util.ArrayList;

public class Cataleg {
    ArrayList<Serie> series;
    public Cataleg(){
        series = new ArrayList<>();
    }

    public void addSerie(Serie se){
        series.add(se);
    }

    public void addTemp(String idSerie, Temporada temp){
        int id = Integer.parseInt(idSerie);
    }

    public ArrayList<Serie> getCataleg(){
        return (series);
    }
}
