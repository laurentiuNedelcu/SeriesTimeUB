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
            }
        }
    }

    public void addEp(String title, String duration, String idioma, String description, String data, String idSerie, String numTemporada) {
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.getId().equals(idSerie)){
                se.addEp(title, duration, idioma, description, data, numTemporada);
            }
        }
    }


    public int visualitzarEpisodi(Usuari us, int ep, int temp, String ser){
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.getId().equals(ser)){
                return se.visualitzarEpisodi(us, ep, temp);
            }
        }
        return 1;
    }

    public int subscriureEpisodi(Usuari us, int ep, int temp, String ser){
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.getId().equals(ser)){
                return se.subscriureEpisodi(us, ep, temp);
            }
        }
        return 1;
    }

    public String valorarEpisodi(Usuari us, int puntuacio, String data, int ep, int temp, String ser){
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            Serie se = it.next();
            if(se.getId().equals(ser)){
                return se.valorarEpisodi(us, puntuacio, data, ep, temp);
            }
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


/*

//////////////PARA ORDENAR SERIES EN UNA LISTA///////////////////
        if (series.size() == 0){
            series.add(se);
        } else {
            String data = se.getTemporada(0).getEpisodi(0).getData();
            int cont = 0;
            for (Serie s: series) {
                String aux = s.getTemporada(0).getEpisodi(0).getData();
                if (compareData(data,aux)){
                    series.add(cont,se);
                } else{
                    cont++;
                }
            }
        }


    private boolean compareData(String novaData, String data){

        String[] data1 = novaData.split("/");
        String[] data2 = data.split("/");

        int nouDia = Integer.parseInt(data1[0]);
        int nouMes = Integer.parseInt(data1[1]);
        int nouAny = Integer.parseInt(data1[2]);

        int dia = Integer.parseInt(data2[0]);
        int mes = Integer.parseInt(data2[1]);
        int any = Integer.parseInt(data2[2]);

        if (nouAny<any){ return true; }
        if (nouMes<mes){ return true; }
        if (nouDia<dia){ return true; }

        return false;

    }

 */