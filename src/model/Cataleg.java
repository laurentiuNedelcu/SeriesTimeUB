package model;


import java.util.ArrayList;
import java.util.Iterator;

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

    public String getCataleg(){
        String s = "";
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            s += se.getTitle();
            s += " ";
        }
        return s;
    }

    public String getLlistatSeriesComencades(Usuari us){
        String s = "";
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.serieComencada(us) && !se.serieAcabada(us)) {
                s += se.getTitle();
                s += " ";
            }
        }
        return s;
    }

    public String getLlistatSeriesAcabades(Usuari us){
        String s = "";
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.serieAcabada(us)) {
                s += se.getTitle();
                s += " ";
            }
        }
        return s;
    }

    public String getLlistatSeriesNoComencades(Usuari us){
        String s = "";
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(!se.serieAcabada(us)&&!se.serieComencada(us)) {
                s += se.getTitle();
                s += " ";
            }
        }
        return s;
    }
}
