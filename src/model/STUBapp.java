package model;

public class STUBapp {
    Cataleg cat;
    public STUBapp(){
        cat = new Cataleg();
    }

    public void addSerie(String title, String descripcio){
        Serie se = new Serie(title, descripcio);
        cat.addSerie(se);
    }
    public void addTemp(String idSerie, String numTemporada, String numEpisodis){
        Temporada temp = new Temporada(numTemporada, numEpisodis);
        cat.addTemp(idSerie,temp);
    }
}
