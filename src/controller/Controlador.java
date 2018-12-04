package controller;

import model.STUB;
import model.Serie;
import model.Usuari;
import resources.DAO_XML_STUB;

import java.util.List;

public class Controlador { //Funcionalitats de subscriure Episodi i valorar Episodi i obtenir el catàleg
    private STUB dades;
    private DAO_XML_STUB dao;
    private ControladorAcces facade;

    public Controlador(String nomFitxer){
        dades = new STUB();
        dao = new DAO_XML_STUB(nomFitxer,dades);
        facade = new ControladorAcces(dades);
    }

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

    public List<Serie> llistaDeSeriesComencades(){
        return dades.getLlistatSeriesComencades();
    }

    public List<Serie> llistaDeSeriesAcabades(){
        return dades.getLlistatSeriesAcabades();
    }

    public List<Serie> llistaDeSeriesNoComencades(){
        return dades.getLlistatSeriesNoComencades();
    }

}
