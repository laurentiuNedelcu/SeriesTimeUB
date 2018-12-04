package model;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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


    public int visualitzarEpisodi(Usuari us, int ep, int temp, String ser){
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.getId().equals(ser)){
                return se.visualitzarEpisodi(us, ep, temp);
            };
        }
        return 1;
    }

    public int subscriureEpisodi(Usuari us, int ep, int temp, String ser){
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.getId().equals(ser)){
                return se.subscriureEpisodi(us, ep, temp);
            };
        }
        return 1;
    }

    public String valorarEpisodi(Usuari us, int puntuacio, String data, int ep, int temp, String ser){
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.getId().equals(ser)){
                return se.valorarEpisodi(us, puntuacio, data, ep, temp);
            };
        }
        return "Serie no trobada";
    }

    public List<Serie> getCataleg(){
        return series;
    }

    public List<Serie> getLlistatSeriesComencades(Usuari us){
        ArrayList<Serie> aux = new ArrayList<>();
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.serieComencada(us) && !se.serieAcabada(us)) {
                aux.add(se);
            }
        }
        return aux;
    }

    public List<Serie> getLlistatSeriesAcabades(Usuari us){
        ArrayList<Serie> aux = new ArrayList<>();
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.serieAcabada(us)) {
                aux.add(se);
            }
        }
        return aux;
    }

    public List<Serie> getLlistatSeriesNoComencades(Usuari us){
        ArrayList<Serie> aux = new ArrayList<>();
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(!se.serieAcabada(us)&&!se.serieComencada(us)) {
                aux.add(se);
            }
        }
        return aux;
    }
}
