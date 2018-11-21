package controller;

import model.STUB;
import model.Usuari;
import resources.DAO_XML_STUB;

import java.util.ArrayList;

public class Controlador {
    STUB dades;
    DAO_XML_STUB dao;

    public Controlador(String nomFitxer){
        dades = new STUB();
        dao = new DAO_XML_STUB(nomFitxer,dades);
    }

    public String getCataleg(){
        return dades.getCataleg();
    }
    public void registreUsuari(String nom_real, String nacionalitat, String nickname, String password, String data_naixement){
        dades.getLlistat_usuaris().registrarUsuari(nom_real, nacionalitat, nickname, password, data_naixement);
    }

    public Usuari logInUsuari(String nickname, String password){//+/- recuperar/desar Dades de Pro2
        return dades.getLlistat_usuaris().logInUsuari(nickname, password);
    }
}
