package model;

import vista.ObserverLlistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class STUB implements SubjectLlistas{
    private Cataleg cat;
    private LlistatUsuaris llistat_usuaris;
    private ArrayList<ObserverLlistas> obsLlistas;

    public STUB(){
        cat = new Cataleg();
        llistat_usuaris = new LlistatUsuaris();
        obsLlistas = new ArrayList<>();
    }

    public LlistatUsuaris getLlistat_usuaris(){
        return this.llistat_usuaris;
    }

    public Usuari registrarUsuari(String id, String nom_real,String dni, String nacionalitat, String nickname, String password, String data_naixement, String adress, boolean vip){
        return llistat_usuaris.registrarUsuari(id, nom_real, dni, nacionalitat, nickname, password, data_naixement, adress, vip);
    }

    public Usuari logInUsuari(String nickname, String password){
        return llistat_usuaris.logInUsuari(nickname,password);
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

    public List getCataleg() {
        return cat.getCataleg();
    }

    public boolean isVisualitzat(int ep, int temp, String ser){
        return cat.isVisualitzat(llistat_usuaris.getUsuariActual(), ep, temp, ser);
    }

    public int visualitzarEpisodi(int ep, int temp, String ser){
        int i = cat.visualitzarEpisodi(llistat_usuaris.getUsuariActual(), ep, temp, ser);
        notifyObserversLlistas();
        return i;
    }

    public int visualitzarEpisodi(String us, int ep, int temp, String ser){
        int i = cat.visualitzarEpisodi(llistat_usuaris.getUsuari(us), ep, temp, ser);
        notifyObserversLlistas();
        return i;
    }

    public int subscriureEpisodi(int ep, int temp, String ser){
        int i = cat.subscriureEpisodi(llistat_usuaris.getUsuariActual(), ep, temp, ser);
        notifyObserversLlistas();;
        return i;
    }

    public int subscriureEpisodi(String client, int ep, int temp, String ser){
        int i = cat.subscriureEpisodi(llistat_usuaris.getUsuari(client), ep, temp, ser);
        notifyObserversLlistas();
        return i;
    }

    public String valorarEpisodi(int puntuacio, String data, int ep, int temp, String ser){
        String s = cat.valorarEpisodi(llistat_usuaris.getUsuariActual(), puntuacio, data, ep, temp, ser);
        notifyObserversLlistas();
        return s;
    }

    public String valorarEpisodi(String us, int puntuacio, String data, int ep, int temp, String ser){
        String s = cat.valorarEpisodi(llistat_usuaris.getUsuari(us), puntuacio, data, ep, temp, ser);
        notifyObserversLlistas();
        return s;
    }

    public List<Serie> getLlistatSeriesComencades(){
        return cat.getLlistatSeriesComencades(llistat_usuaris.getUsuariActual());
    }

    public List<Serie> getLlistatSeriesAcabades(){
        return cat.getLlistatSeriesAcabades(llistat_usuaris.getUsuariActual());
    }

    public List<Serie> getLlistatSeriesNoComencades(){
        return cat.getLlistatSeriesNoComencades(llistat_usuaris.getUsuariActual());
    }

    @Override
    public void registerObserverLlistas(ObserverLlistas o) {
        obsLlistas.add(o);
    }

    @Override
    public void removeObserverLlistas(ObserverLlistas o) {
        Iterator<ObserverLlistas> it = obsLlistas.iterator();
        while(it.hasNext()){
            ObserverLlistas ob = it.next();
            if (ob.equals(o))
                obsLlistas.remove(ob);
        }
    }

    @Override
    public void notifyObserversLlistas() {
        Iterator<ObserverLlistas> it = obsLlistas.iterator();
        while(it.hasNext()){
            ObserverLlistas ob = it.next();
            ob.updateLlistas();
        }
    }
}
