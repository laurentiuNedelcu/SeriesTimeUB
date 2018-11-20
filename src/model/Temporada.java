package model;

import java.util.ArrayList;

public class Temporada {
    String numTemporada, numEpisodis;
    ArrayList<Episodi> episodis;

    public Temporada(String numTemporada, String numEpisodis){
        this.numTemporada = numTemporada;
        this.numEpisodis = numEpisodis;
        episodis = new ArrayList<Episodi>();
    }
    public void addEpisodi(Episodi ep){
        episodis.add(ep);
    }
    public Episodi getEpisodi(int i){
        return (episodis.get(i));
    }
}
