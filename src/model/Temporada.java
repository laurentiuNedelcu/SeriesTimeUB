package model;

import java.util.ArrayList;

public class Temporada {
    private String numTemporada, numEpisodis;
    private ArrayList<Episodi> episodis;

    public Temporada(String numTemporada, String numEpisodis){
        this.numTemporada = numTemporada;
        this.numEpisodis = numEpisodis;
        episodis = new ArrayList<Episodi>();
    }
    public void addEpisodi(String title, String duration, String idioma, String description, String data){
        Episodi ep = new Episodi(title, duration, idioma, description, data);
        episodis.add(ep);
    }

    public Episodi getEpisodi(int i){ return episodis.get(i); }

    public boolean isVisualitzat(Usuari us, int ep){
        int numE = Integer.parseInt(numEpisodis);
        if(ep<=numE)
            return episodis.get(ep-1).estaVisualitzat(us);
        return false;
    }

    public int visualitzarEpisodi(Usuari us, int ep){
        int numE = Integer.parseInt(numEpisodis);
        if(ep<=numE)
            return episodis.get(ep-1).visualitzarEpisodi(us);
        return 1;
    }

    public boolean estaComencada (Usuari us){
        return episodis.get(0).estaVisualitzat(us);
    }

    public boolean estaAcabada (Usuari us){
        int i = episodis.size();
        if(i==0)
            return false;
        return episodis.get(i-1).estaVisualitzat(us);
    }
    public int subscriureEpisodi(Usuari us, int ep){
        return episodis.get(ep-1).subscriureUsuari(us);
    }

    public String valorarEpisodi(Usuari us, int puntuacio, String data, int ep){
        return episodis.get(ep-1).valorarEpisodi(us,puntuacio,data);
    }

    public int numEp(){
        return episodis.size();
    }
}

