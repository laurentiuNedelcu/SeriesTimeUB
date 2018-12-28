package controller;

import model.STUB;
import model.Serie;
import model.Usuari;
import model.UsuariAcces;
import resources.DAO_XML_STUB;
import vista.ObserverLlistas;
import java.util.*;

import java.util.List;

public class Controlador { //Funcionalitats de subscriure Episodi i valorar Episodi i obtenir el catàleg
    private STUB dades;
    private DAO_XML_STUB dao;
    private UsuariAcces facade;

    static Controlador controlador = new Controlador();

    private Controlador(){
        dades = new STUB();
        dao = new DAO_XML_STUB("src/resources/STUB.xml",dades);
        facade = new UsuariAcces(dades);
    }

    public static Controlador getInstance(){ return controlador; }

    public List getCataleg(){
        return dades.getCataleg();
    }

    public Usuari registreUsuari(String id, String nom_real, String dni, String nacionalitat, String nickname, String password, String data_naixement, String adress, boolean vip){
        return facade.registreUsuari(id, nom_real, dni, nacionalitat, nickname, password, data_naixement, adress, vip);
    }
    public Usuari logInUsuari(String nickname, String password) {//+/- recuperar/desar Dades de Pro2
        return facade.logInUsuari(nickname, password);
    }

    public int visualitzarEpisodi(int ep, int temp, String ser){
        return dades.visualitzarEpisodi(ep, temp, ser);
    }

    public int subscriureEpisodi(int ep, int temp, String ser){
        return dades.subscriureEpisodi(ep, temp, ser);
    }

    public String valorarEpisodi(int puntuacio, String data, int ep, int temp, String ser){
        return dades.valorarEpisodi(puntuacio,data,ep,temp,ser);
    }

    public boolean isSubscrit(int ep, int temp, String ser){
        return dades.isVisualitzat(ep,temp,ser);
    }

    public void addObserverLlista(ObserverLlistas o){
        dades.registerObserverLlistas(o);
    }

    public List<Serie> llistaDeSeriesComencades(){
        return dades.getLlistatSeriesComencades();
    }

    public List<Serie> llistaDeSeriesAcabades(){
        return dades.getLlistatSeriesAcabades();
    }

    public List<Serie> llistaDeSeriesNoComencades(){
        return dades.getLlistatSeriesNoComencades();
    }

    public String buscaSerie(String nom){
        List<Serie> cataleg = dades.getCataleg();
        Iterator<Serie> s = cataleg.iterator();

        while(s.hasNext()) {
            Serie se = s.next();
            if(se.getTitle().equals(nom)){
                return se.getDescripcio();
            }
        }
        return null;
    }

}
