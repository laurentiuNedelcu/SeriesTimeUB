package model;

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

    public void addSerie(String id, String title, String descripcio){
        cat.addSerie(id, title,descripcio);
    }

    public void addTemp(String idSerie, String numTemporada, String numEpisodis){
        cat.addTemp(idSerie, numTemporada, numEpisodis);
    }

    public void addEp(String title, String duration, String idioma, String description, String data, String idSerie, String numTemporada) {
        cat.addEp(title, duration, idioma, description, data, idSerie, numTemporada);
    }

    public String getCataleg() {
        return cat.getCataleg();
    }
}
