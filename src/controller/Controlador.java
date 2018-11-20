package controller;

import model.STUB;
import resources.DAO_XML_STUB;

public class Controlador {// Comunicació vista-model; dos funcionalitats: signIn, logIn -> Facade?
    private STUB dades;
    private DAO_XML_STUB dao;

    public Controlador(String nomFitxer){
        dades = new STUB();
        dao = new DAO_XML_STUB(nomFitxer,dades);
    }

    public void registreUsuari(String nom_real, String nacionalitat, String nickname, String password, String data_naixement){
        dades.getLlistat_usuaris().registrarUsuari(nom_real, nacionalitat, nickname, password, data_naixement);
    }

    public STUB logInUsuari(String nickname, String password){//+/- recuperar/desar Dades de Pro2
        dades.getLlistat_usuaris().logInUsuari(nickname, password);
    }
}
