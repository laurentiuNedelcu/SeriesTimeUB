package model;

import java.util.ArrayList;
import java.util.Iterator;

public class STUB {//Cal persistencia de dades? -> serializable?
    private Cataleg cat;//Cambio QUIM
    private LlistatUsuaris llistat_usuaris;

    public STUB(){
        cat = new Cataleg();
        llistat_usuaris = new LlistatUsuaris();
    }

    public LlistatUsuaris getLlistat_usuaris(){
        return this.llistat_usuaris;
    }

    public void addSerie(String title, String descripcio){//Cambio QUIM
        Serie se = new Serie(title, descripcio);
        cat.addSerie(se);
    }
    public void addTemp(String idSerie, String numTemporada, String numEpisodis){//Cambio QUIM
        Temporada temp = new Temporada(numTemporada, numEpisodis);
        cat.addTemp(idSerie,temp);
    }

}
